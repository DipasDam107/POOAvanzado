/*
 Escribe un programa que solicite al usuario que introduzca un email y que extraiga el nombre
 del usuario (lo que hay antes de la arroba) y el TLD (el dominio de nivel superior, lo que va después
 del punto). 
 */
package dam107t10e6;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    static Scanner teclado;
    public static void main(String[] args){
        teclado = new Scanner(System.in);
        System.out.println("Dime Email: ");
        String cadena = teclado.nextLine();
        
        String p = "([A-Za-z1-9]+)@[A-Za-z]+\\.([A-Za-z]{2,})";
        if(Pattern.matches(p, cadena)){
            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
            System.out.println("Correo valido");
            System.out.println("Email: " + cadena);
            Pattern patron = Pattern.compile("([A-Za-z1-9]+)@[A-Za-z]+\\.([A-Za-z]{2,})");
            Matcher matcher = patron.matcher(cadena);
            matcher.find();
            System.out.println("Nombre: " + matcher.group(1));
            System.out.println("Dominio Superior: " + matcher.group(2));
        }
        else{
            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
            System.out.println("No es un correo valido");
        }
        
    }
}
