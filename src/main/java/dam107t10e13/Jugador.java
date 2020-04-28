
package dam107t10e13;

public class Jugador {
    int id;
    int fila;
    int columna;
    static int idActual = 1;
    
    Jugador(){
        this.id=idActual;
        this.asignarPos();
        idActual++;
    }
    
    void asignarPos(){
        Tablero tab = Tablero.getInstance();
        boolean estado;
        int f,c;
        do{
        estado=true;
        f = (int)(Math.random()*20);
        c = (int)(Math.random()*20);
        if(tab.casillas[fila][columna]!=0)
            estado=false;
        }while(!estado);
        
        this.fila=f;
        this.columna=c;
        tab.casillas[fila][columna]=this.id;
    }

    @Override
    public String toString() {
        return "id=" + id + ", fila=" + fila + ", columna=" + columna;
    }
    
}
