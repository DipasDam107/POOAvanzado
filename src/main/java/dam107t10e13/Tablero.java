
package dam107t10e13;

public class Tablero {
    int[][] casillas;
    
    private static Tablero instance = null;
    
    private Tablero(){
        casillas = new int[20][20];
        inicializar();
    }
    
    public static Tablero getInstance() {
        if (instance == null)
         instance = new Tablero();
         return instance;
    }

    
    private void inicializar(){
        for (int i = 0; i < casillas.length; i++) {
            for (int j = 0; j < casillas[i].length; j++) {
                casillas[i][j]=0;
            }
        }
    }
}
