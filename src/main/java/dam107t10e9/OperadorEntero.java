package dam107t10e9;

public class OperadorEntero implements Operable {


    @Override
    public Integer suma(Object valor1, Object valor2) {
        return ((Integer) valor1) + ((Integer) valor2);
    }

    @Override
    public Integer resta(Object valor1, Object valor2) {
        return ((Integer) valor1) - ((Integer) valor2);
    }
    
}
