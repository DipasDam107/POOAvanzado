
package dam107t10e10;

import java.util.ArrayList;

public class NotasAlumnos {
    ArrayList <Float> notas;
    int valorMinimo;
    int valorMaximo;
    char nivel;
    
    NotasAlumnos(int valorMinimo, int valorMaximo){
        this.valorMinimo=valorMinimo;
        this.valorMaximo=valorMaximo;
        notas=new ArrayList<>();
    }
}
