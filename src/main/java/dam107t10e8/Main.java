/*
 Crea una clase de tipo genérica (cualquier tipo que herede de Number) que describa un
cuadrado.
    • Tiene un único atributo llamado “lado” de tipo genérico.
    • Tiene un constructor al que se le pasa también un valor genérico y lo asigna a lado.
    • Tiene un método que calcule el área del cuadrado, multiplicando lado.doubleValue() *
    lado.doubleValue() y devolviendo un tipo de dato Number.
Haz un programa que instancie cuadrados de tipo Integer, Long y Double de distintos tamaños
y muestra el área de todos ellos. 
 */
package dam107t10e8;

public class Main {
    static Numerico <Integer> entero;
    static Numerico <Long> largo;
    static Numerico <Double> doble;
    
    public static void main(String[] args){
      entero = new Numerico(5);  
      largo = new Numerico(6);  
      doble = new Numerico(7);  
      
      System.out.println("Area entero: " +entero.calcularArea());
      System.out.println("Area double: " +doble.calcularArea());
      System.out.println("Area long: " +largo.calcularArea());
      
    }
}
