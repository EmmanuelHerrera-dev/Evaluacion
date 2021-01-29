package Ejercicios;
//Emmanuel Isai Herrera Ortiz
import java.util.ArrayList;
import java.util.Scanner;

public class NumerosPalindromos {
    public static void main(String args[]){
        
        //Variables**************************
        boolean palindromo;
        int numeroEntrada;
        int longitud;
        String varAux;
        String varAux2="";
        ArrayList <String> numeros = new ArrayList();
        //***********************************
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero entero");
        numeroEntrada = sc.nextInt();
        
        varAux = String.valueOf(numeroEntrada);
        
        for(int i = 0; i < varAux.length(); i++){
            numeros.add(String.valueOf(varAux.charAt(i)));
        }
        
        longitud = numeros.size();
        
        for(int j = longitud-1; j >= 0; j--){
            varAux2 += numeros.get(j);
        }
        
        if(varAux2.equals(String.valueOf(numeroEntrada))){
            palindromo = true;
        }else{
            palindromo = false;
        }
        
        System.out.println("El número es palindromo: " + palindromo);
        
    }
}
