package Ejercicios;
//Emmanuel Isai Herrera Ortiz

import java.util.ArrayList;
import java.util.Scanner;

public class EnterosAlDerechoYAlReves {
    public static void main(String args[]){
        
        //Variables**************************
        String numeroEntrada;
        int longitud;
        String varAux="";
        ArrayList <String> numeros = new ArrayList();
        //***********************************
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero entero con signo de 32 bits");
        numeroEntrada = sc.nextLine();
        
        for(int i = 0; i < numeroEntrada.length(); i++){
            numeros.add(String.valueOf(numeroEntrada.charAt(i)));
        }
        
        longitud = numeros.size();
        
        for(int j = longitud-1; j >= 0; j--){
            varAux += numeros.get(j);
        }
        if(varAux.length() > 10){
            System.out.println("El número al revés es: 0");
        }else{
            System.out.println("El número al revés es: "+ varAux);
        }
    }
}
