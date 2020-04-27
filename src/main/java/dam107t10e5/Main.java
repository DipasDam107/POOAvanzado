/*
 Escribe un programa que solicite al usuario que introduzca una cadena y verifique, mediante
expresiones regulares, si la cadena se corresponde con:
    a) Una matrícula de coche (4 dígitos y 3 letras mayúsculas).
    b) Un número binario.
    c) Un número hexadecimal.
    d) Una fecha en formato YYYY-MM-DD (solo formato, no valida días del mes).
    e) Como el anterior, pero admite también que el día o el mes esté en un solo dígito.
    f) Un nombre de usuario en twitter, empieza por @ y puede contener letras mayúsculas
    y minúsculas, números, guiones y guiones bajos (entre 2 y 15 caracteres) 

 */
package dam107t10e5;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
     static Scanner teclado;
     public static void main(String[] args){
         teclado = new Scanner(System.in);
         System.out.println("Dime Cadena: ");
         String cadena = teclado.nextLine();
         
         String expMatricula = "\\d{4}[A-Z]{3}";
         String expBinario = "[01]+";
         String expHexa = "[0-9A-F]+";
         String expFecha = "\\d{2}-\\d{2}-\\d{4}";
         String expFechaUnDigito = "\\d{1,2}-\\d{1,2}-\\d{4}";
         String expTwitter = "@([A-Za-z]|[1-9]|\\-|_){2,15}";
     
         if(Pattern.matches(expMatricula, cadena)) System.out.println("Es una Matriucla");
         else if(Pattern.matches(expBinario, cadena)) System.out.println("Es un Binario");
         else if(Pattern.matches(expHexa, cadena)) System.out.println("Es un Hexadecimal");       
         else if(Pattern.matches(expFecha, cadena) || Pattern.matches(expFechaUnDigito, cadena) ) System.out.println("Es una Fecha");      
         else if(Pattern.matches(expTwitter, cadena) || Pattern.matches(expFechaUnDigito, cadena) ) System.out.println("Es una cuenta de Twitter");   
         else System.out.println("La cadena no se corresponde con ningún patrón");
     }
}
