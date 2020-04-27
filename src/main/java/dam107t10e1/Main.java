/*Crea una enumeración pública con el género de las personas (masculino, femenino) en un
archivo propio. Crea una nueva versión de la clase Persona (Persona_v4) que la incorpore como
atributo y adapta los métodos necesarios para tratarla (constructor, toString, etc). Haz un programa
que solicite al usuario por consola los datos de personas y los almacene en un HashSet (Introducirá
nombre “Z” para indicar que no desea introducir más personas). Finalmente mostrará todos los
datos almacenados en el mapa. 
*/
package dam107t10e1;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    static Scanner teclado;
    static HashSet <Persona> mapa;
    static Persona pers;
       public static void main(String[] args) {
            teclado = new Scanner(System.in);
            String nombre;
            mapa = new HashSet<>();
            do{
                pers = dameDatos();
                if(pers.getNombre().charAt(0)!='Z') mapa.add(pers);
            }while(pers.getNombre().charAt(0)!='Z');
            
            mostrar();
       
       }
       public static void mostrar(){
           for(Persona x: mapa){
               System.out.println(x.toString());
           }
       }
       
       public static Persona dameDatos(){
           String nombre, telefono, email, genero;
           LocalDate fecha;
           Genero gen=Genero.MASCULINO;
           System.out.println("Dime nombre"); 
           nombre=teclado.nextLine();
           if(!nombre.toUpperCase().equals("Z")){
                System.out.println("Dime Telefono: ");
                telefono=teclado.nextLine();
                System.out.println("Dime Correo: ");
                email=teclado.nextLine();
                System.out.println("Dime fecha (aaaa-mm-dd): ");
                try{
                    fecha=LocalDate.parse(teclado.nextLine());
                }catch(Exception e){
                    return null;
                }
                System.out.println("Dime Sexo(M - F): ");
                do{
                    genero=teclado.nextLine().toUpperCase();
                    if(genero.charAt(0)=='M')
                        gen=Genero.MASCULINO;
                    else if(genero.charAt(0)=='F') gen=Genero.FEMENINO;
                }while(genero.charAt(0)!='M' && genero.charAt(0)!='F');
                
                return new Persona(nombre,telefono,email,fecha,gen);
           }
           else return new Persona("Z","","",LocalDate.now(),Genero.FEMENINO);
       }
}
