/*
Haz una nueva versión del programa 1.17 (Implementación de Comparator) empleando una
clase anónima en Collections.sort () para ordenar por nombre la lista de Persona_v3. 
 */

package dam107t10e12;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

public class Main_1 {
    static ArrayList <Persona> listaPersonas;
    public static void main(String [] args){
        ComparaEdad compEdad = new ComparaEdad ();
        listaPersonas = new ArrayList<>();
        listaPersonas.add(new Persona("Pepe", "981622222", "soypepe@pepe", LocalDate.parse("1990-01-01")));
        listaPersonas.add(new Persona("Zacarias", "981622227", "zaca@zaca", LocalDate.parse("1997-01-01")));
        listaPersonas.add(new Persona("Jose", "981622224", "Jose@Jose", LocalDate.parse("1991-01-01")));
        listaPersonas.add(new Persona("Fran", "981622221", "isFran@isFran", LocalDate.parse("1992-01-01")));
        listaPersonas.add(new Persona("Maria", "981622220", "Maria@Maria", LocalDate.parse("1993-01-01")));
        listaPersonas.add(new Persona("Antonio", "981622227", "zanto@anto", LocalDate.parse("1998-01-01")));
        
        Collections.sort(listaPersonas, compEdad);
        
        System.out.println("----------------------");
        System.out.println("EDAD");
        System.out.println("----------------------");
          
        for(Persona x : listaPersonas){
            System.out.println(x);
        }
        
        ComparaEmail compEmail = new ComparaEmail();
        Collections.sort(listaPersonas, compEmail);
        System.out.println("----------------------");
        System.out.println("EMAIL");
        System.out.println("----------------------");
       
        
        for(Persona x : listaPersonas){
            System.out.println(x);
        }
        
        System.out.println("----------------------");
        System.out.println("NOMBRE (CLASE ANONIMA)");
        System.out.println("----------------------");
        Collections.sort(listaPersonas, new Comparator<Persona>(){
            @Override
            public int compare(Persona o1, Persona o2) {
                return o1.nombre.compareTo(o2.nombre);
            }
        });
        
        for(Persona x : listaPersonas){
            System.out.println(x);
        }
        
        System.out.println(mayor());
        System.out.println("La edad media es : " + media());
    }
    
    public static String mayor(){
        String nombre = null;
        int edadMayor=0;
        for(Persona x : listaPersonas){
            int edad = (int) ChronoUnit.YEARS.between(x.fecNac, LocalDate.now());
            if(nombre==null || edad > edadMayor){
                nombre=x.nombre;
                edadMayor=edad;
            }
        }
        
        return "El mayor es " + nombre + ". Edad: " + edadMayor;
    }
    public static double media(){
        int total=0;
        for(Persona x : listaPersonas){
            total+=(int) ChronoUnit.YEARS.between(x.fecNac, LocalDate.now());
        }
        return (double)total/(double)listaPersonas.size();
    }   
    
   
}
