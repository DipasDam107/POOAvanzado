/*
  Realizar un programa al que se le introduzca un número entero. Mostrar dicho número en
su representación hexadecimal. Evitar que se produzca una excepción si el usuario no introduce un
valor correcto (por ejemplo, si introduce texto o un número con decimales o un número demasiado
grande)
 */
package dam107t10e4;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class Main {
    static Scanner teclado;
    public static void main(String[] args){
        boolean bien;
        do{
            
            try{
                bien = true;
                int valor;
                teclado = new Scanner(System.in);
                System.out.println("Dime un numero: ");
                valor =teclado.nextInt();
                System.out.println("Valor Hexadecimal:  " + Integer.toHexString(valor));
                }catch(InputMismatchException e){
                    System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                    System.out.println("Valor Introducido incorrecto");
                    bien = false;
                }catch(Exception e){
                    System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                    System.out.println("Se ha producido un error");
                    bien = false;
                }
        }while(!bien);
    }
}
