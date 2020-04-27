/*
Diseña una clase llamada NotasAlumnos, que contenga un ArrayList de Float con las notas de
los alumnos de una escuela y unos atributos valor mínimo permitido, valor máximo permitido y
otro atributo de tipo char llamado nivel. Los dos primeros se determinan en el constructor de la
clase y el tercero se actualiza desde una clase interna llamada NivelEscuela. Esta clase interna tiene
un método llamado calcularNivel() que, en función de una serie de parámetros, calcula el nivel de
la escuela. Actualmente se calcula así:
    • LimiteAprobado es un atributo de la clase interna que se define en el constructor de la
    misma como la media aritmética entre el valor máximo y mínimo permitido. Será el valor
    que defina si una nota es un aprobado o no.
    • Una escuela es de nivel ‘A’ si aprueba más del 80% de la escuela.
    • Una escuela es de nivel ‘C’ si suspenden más del 50% de la escuela.
    • Una escuela es de nivel ‘B’ en cualquier otro caso.
Finalmente, la clase NotasAlumnos dispone de un método llamado añadirNota () al que se le
pasa como parámetro una nota y, si está entre los valores mínimo y máximo permitido, la
añade al ArrayList.
Haz un programa que cree una instancia de la clase NotasAlumnos , le añada unos valores
cualquiera a las notas de los alumnos y calcule y muestre el nivel de la escuela. 

 */
package dam107t10e10;

import java.util.Scanner;

public class Main {

    static NotasAlumnos notas;
    static Scanner teclado;

    public static void main(String[] args) {
        notas = new NotasAlumnos(1, 10);
        teclado = new Scanner(System.in);
        float nota = 0;
        boolean error;
        do {
            error = false;
            try {
                System.out.println("Dime nota (-1 salir): ");
                nota = teclado.nextFloat();
                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                if (nota!=-1 && notas.aniadirNota(nota)) {
                    System.out.println("Nota añadida con exito...");
                } else if (nota!=-1){
                    throw new Exception();
                }
            }catch (Exception e) {
                error = true;
                teclado.nextLine();
                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                System.out.println("Nota no valida");
            }
        } while (nota != -1 || error);

        System.out.println("El nivel del colegio es: " + notas.nivel);
    }
}
