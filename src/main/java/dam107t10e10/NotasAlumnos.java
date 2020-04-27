
package dam107t10e10;

import java.util.ArrayList;

public class NotasAlumnos {
    ArrayList <Float> notas;
    int valorMinimo;
    int valorMaximo;
    char nivel;
    NivelEscuela niv;
    
    NotasAlumnos(int valorMinimo, int valorMaximo){
        this.valorMinimo=valorMinimo;
        this.valorMaximo=valorMaximo;
        notas=new ArrayList<>();
        niv = new NivelEscuela();
    }

    public char getNivel() {
        return nivel;
    }
    
    public boolean aniadirNota(float nota){
        if(nota>=valorMinimo && nota<=valorMaximo){
            notas.add(nota); 
            this.nivel=niv.calcularNivel();
            return true;
        }
        else return false;
    }
    
    public class NivelEscuela {
        float limiteAprobado;
        
        NivelEscuela(){
            limiteAprobado = (valorMinimo+valorMaximo)/2f;
            System.out.println("La nota necesaria para aprobar es: " + limiteAprobado);
        }
        public char calcularNivel(){
            int aprobados=0;
            int totalAlumnos = notas.size();
            for(Float nota : notas){
                if(nota>=limiteAprobado)
                    aprobados++;
            }
            
            float porcentaje = (100f*aprobados)/totalAlumnos;
            if(porcentaje>80) return 'A';
            else if(porcentaje>50) return 'B';
            else return 'C';
        }
    }
}
