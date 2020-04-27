/*
 Crea una clase de tipo genérica llamada ListaPequeña que tendrá como atributos privados un
ArrayList de tipo genérico llamado valores y un entero (qué será final, piensa el porqué) con el
tamaño de la lista, llamado tamañoMax.
    • Al constructor de esta clase le pasaremos un entero positivo que se asignará a
    tamañoMax. El constructor instanciará también el ArrayList valores.
    • Tendrá un método llamado añadir que se le pasa un objeto de tipo genérico y si el arraylist
    aún tiene un tamaño menor que tamañoMax, lo añadirá, pero si el arraylist ha llegado a
    ese tamaño, añadirá objeto pasado en la última posición del ArrayList, sustituyendo el
    elemento que allí hubiera (así conseguimos que el ArrayList no crezca por encima del
    tamaño máximo)
    • Tiene un método llamado clear(), que simplemente hace un clear() del ArrayList valores.
    • Tiene un método llamado getValores() que devuelve el ArrayList privado valores.
    Haz un programa que cree una ListaPequeña de tipo String de 5 elementos. Añadele 6 ó 7 String
    a la lista y muestra su contenido, para ver si ha crecido por encima de esos 5 elementos.
 */
package dam107t10e7;

import java.util.Scanner;


public class Main {
    static ListaPequenia <String> lista;
    static Scanner teclado;
    public static void main(String[] args){
        teclado = new Scanner(System.in);
        System.out.println("Dime limite de valores: ");
        lista = new ListaPequenia<>(teclado.nextInt());
        
        lista.aniadir("Hola");
        lista.aniadir("Adios");
        lista.aniadir("Hasta Luego");
        lista.aniadir("Hasta Mañana");
        lista.aniadir("Como estas");
        lista.aniadir("Doval no me copies");
        lista.aniadir("He dicho que no me copies");
        
        for(String x : lista.getValores()){
            System.out.println(x);
        }
    }
}
