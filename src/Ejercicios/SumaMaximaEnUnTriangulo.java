package Ejercicios;
//Emmanuel Isai Herrera Ortiz
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class SumaMaximaEnUnTriangulo {
    public static void main(String args[]){
        //Suma maxima de un triangulo, primero necesito abrir el archivo txt
        //Variables*******************************
        String ruta;
        String linea;
        ArrayList <String> numeros = new ArrayList();
        String temp="";
        int resultado=0;
        //****************************************
        
        ruta = JOptionPane.showInputDialog("Ingresa la ruta del archivo txt mas el nombre del archivo y su extension");
        
        try{
            BufferedReader br = new BufferedReader(new FileReader(ruta));
            
            
            while((linea = br.readLine())!=null){
                
                String lineaNueva = linea.replaceAll("\\s","");
                //***Obtengo la longitud
                //System.out.println(lineaNueva);
                if (lineaNueva.length() == 2) {
                    numeros.add(lineaNueva);
                } else {
                    int longitud = lineaNueva.length() - 4;

                    for (int i = 0; i < lineaNueva.length(); i++) {
                        if (i == longitud) {
                            temp+=lineaNueva.charAt(i);
                            temp+=lineaNueva.charAt(i+1);
                            numeros.add(String.valueOf(temp));
                            temp="";
                            break;
                        }
                    }
                }
            }
            //System.out.println(numeros);
            //Sumar los numeros
            for(int j = 0; j < numeros.size(); j++){
                resultado += Integer.parseInt(numeros.get(j));
            }
            System.out.println("El Resultado de la suma es: " + resultado);
            br.close();
        }catch(IOException e){
            JOptionPane.showMessageDialog(null,"Error al abrir el archivo");
        }
    }
}