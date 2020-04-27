
package dam107t10e1;

import java.time.LocalDate;
import java.util.Objects;

public class Persona  implements Comparable{
    String nombre;
    String telefono;
    String email;
    LocalDate fecNac;
    Genero genero;
    
    public Persona(String nombre, String telefono, String email, LocalDate fecNac, Genero genero) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.email = email;
        this.fecNac = fecNac;
        this.genero=genero;
    }


    @Override
    public int hashCode() {
        int hash = 5;
        hash = 43 * hash + Objects.hashCode(this.nombre.toUpperCase());
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Persona other = (Persona) obj;
        if (!Objects.equals(this.nombre.toUpperCase(), other.nombre.toUpperCase())) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Nombre = " + nombre +", Sexo = " + genero + ", Telefono = " + telefono + ", Email = " + email + ", Fecha Nacimiento = " + fecNac;
    }

    @Override
    public int compareTo(Object o) {
        Persona p1 = (Persona) o; 
        return this.nombre.compareTo(p1.nombre);
    }

    public String getNombre() {
        return nombre;
    }
    
    
   
    
    
    
}
