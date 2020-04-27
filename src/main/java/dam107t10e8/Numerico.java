
package dam107t10e8;

public class Numerico <t extends Number>{
    t lado;
    
    Numerico(t lado){
        this.lado=lado;
    }
    
    public Number calcularArea(){
        return lado.doubleValue() * lado.doubleValue();
    }
}
