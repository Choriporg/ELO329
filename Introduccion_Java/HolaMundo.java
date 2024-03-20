/*
Este es un programa básico que hice para
empezar a acostumbrarme a los comandos básicos y la sintaxis
de Java.

Este programa imprime un mensaje Hola Mundo y te dice
si la iteración es par o impar, además, incluye un comparador de Strings
para poder entender como funcionan estos.
 */

import java.io.*;
import java.util.Scanner;

public class HolaMundo {
    public static void main(String[ ] args){
        for(int i = 1; i <= 10; i++){ //Ciclo que repetirá los mensajes
            System.out.println("\t>> Hola Mundo! (" + i + ")\n");

            //Determinar la paridad de la iteración
            if (i % 2 == 0){
                System.out.println("\t\t>> Esta iteración es par :O\n");
            } else {
                System.out.println("\t\t>> Esta iteración es imapar :c\n");
            }
        }   
        
        //Input por consala de las 2 palabras que se van a comparar
        java.util.Scanner s = new Scanner(System.in);
        System.out.print("Ingrese palabra 1: ");
        String palabra1 = s.nextLine();
        System.out.print("Ingrese palabra 2: ");
        String palabra2 = s.nextLine();
        
        //Comparador de palabras
        if(palabra1.equals(palabra2)){
            System.out.println("\t>> las palabras son identicas.\n");
        }else if(palabra1.length() == palabra2.length()){
            System.out.println("\t>> Las palabras no son idénticas, pero tienen la misma cantidad de caracteres.\n");
        }else{
            System.out.println("\t>> Las palabras no tienen nada en común.\n");
        }
    }
}
