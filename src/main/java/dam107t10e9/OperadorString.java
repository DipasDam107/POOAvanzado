
package dam107t10e9;

public class OperadorString implements Operable{

    @Override
    public String suma(Object valor1, Object valor2) {
        return ((String) valor1) + ((String) valor2);
    }

    @Override
    public String resta(Object valor1, Object valor2) {
        return ((String) valor1).replaceAll(((String)valor2), "");
    }
    
}
