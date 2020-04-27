/*
    Realizar un programa que muestre el valor máximo y mínimo de los Integer y los Long y
    también cuantos bytes ocupa en memoria uno y otro. 
 */
package dam107t10e3;

public class Main {
    public static void main(String[] args){
        System.out.println("Valor maximo Integer : " + Integer.MAX_VALUE);
        System.out.println("Valor minimo Integer : " + Integer.MIN_VALUE);
        System.out.println("Bytes en memoria Integer : " + Integer.SIZE/8d);
        
        System.out.println("Valor maximo Long : " + Long.MAX_VALUE);
        System.out.println("Valor minimo Long : " + Long.MIN_VALUE);
        System.out.println("Bytes en memoria Long : " + Long.SIZE/8d);
    }
}
