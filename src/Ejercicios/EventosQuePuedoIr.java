package Ejercicios;
//Emmanuel Isai Herrera Ortiz
import java.util.ArrayList;

public class EventosQuePuedoIr {
    public static void main(String args[]){
        //Arreglo con los eventos
        String[][] eventos = {{"Evento 1", "1", "4"}, {"Evento 2", "2", "3"}, {"Evento 3", "4", "4"},
        {"Evento 4", "1", "2"}, {"Evento 5", "4", "5"}, {"Evento 6", "1", "1"}};
        
        //Variables***********************************************
        int numeroMayor = 0;
        int numeroMenor = Integer.parseInt(eventos[1][1]);
        int aux = 0;
        int contador = 0;
        int eventosTotales=0;
        ArrayList<Integer> dias = new ArrayList();
        ArrayList<Integer> eventosDisponibles = new ArrayList();
        //********************************************************
        eventosDisponibles.add(1);
        eventosDisponibles.add(2);
        eventosDisponibles.add(3);
        eventosDisponibles.add(4);
        eventosDisponibles.add(5);
        eventosDisponibles.add(6);
       
        
        //Mostrar los eventos disponibles
        for(int i = 0; i < 6; i++){
            System.out.println(eventos[i][0] + " que comienza el dia " + eventos[i][1] + " y termina el dia " + eventos[i][2]);
        }
        //Calcular a cuentos eventos puedo ir
        //Buscar el numero mas alto primero
        for(int j = 0; j < 6; j++){
            //Mayor
            if((Integer.parseInt(eventos[j][1])) > numeroMayor){
                numeroMayor = Integer.parseInt(eventos[j][1]);
            }else if((Integer.parseInt(eventos[j][2])) > numeroMayor){
                numeroMayor = Integer.parseInt(eventos[j][2]);
            }
            //Menor
            if((Integer.parseInt(eventos[j][1])) < numeroMenor){
                numeroMenor = Integer.parseInt(eventos[j][1]);
            }else if((Integer.parseInt(eventos[j][2])) < numeroMenor){
                numeroMenor = Integer.parseInt(eventos[j][2]);
            }
        }
        //Llenar el arreglo de los dias disponibles
        for(int k = 0; k < numeroMayor; k++){
            dias.add(k+1);
        }
        
        //Saber a cuantos eventos puedo ir
        //Primero saber los dias de un solo evento
        for (int m = 0; m < 6; m++) {
            if(eventos[m][1].equals(eventos[m][2])){
                aux = Integer.parseInt(eventos[m][1]);
                //Lo ponemos como dia ocupado
                for(int n = 0; n < dias.size(); n++){
                    if(aux == dias.get(n)){
                        dias.set(n, 0);
                    }
                }
                //Quitamos el evento
                for(int n = 0; n < eventosDisponibles.size(); n++){
                    if(m+1 == eventosDisponibles.get(n)){
                        eventosDisponibles.set(n, 0);
                    }
                }
            }
        }
        //comprobar los eventos restantes
        for(int p = 0; p < dias.size(); p++){
            if(dias.get(p)!=0){
                aux = dias.get(p);
                for (int i = 0; i < 6; i++) {
                    if (eventosDisponibles.get(i) != 0) {
                        if (aux >= Integer.parseInt(eventos[i][1]) && aux <= Integer.parseInt(eventos[i][2])) {
                            eventosDisponibles.set(i, 0);
                            for (int n = 0; n < dias.size(); n++) {
                                if (aux == dias.get(n)) {
                                    dias.set(n, 0);
                                }
                            }
                            break;
                        }   
                    }
                }
            }
        }
        
        for(int i = 0; i < eventosDisponibles.size(); i++){
            if(eventosDisponibles.get(i)==0){
                contador++;
            }
        }
        
        //System.out.println("El numero mayor es: " + numeroMayor);
        //System.out.println("El numero menor es: " + numeroMenor);
        //System.out.println("Dias disponibles: " + dias);
        //System.out.println("Eventos disponibles: " + eventosDisponibles);
        System.out.println("**********************************");
        System.out.println("Eventos a los que puedo ir: " + contador);
        System.out.println("**********************************");
    }
}
