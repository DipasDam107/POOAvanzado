package dam107t10e9;

public class OperadorEntero implements Operable <Integer> {


    @Override
    public Integer suma(Integer valor1, Integer valor2) {
        return valor1 +  valor2;
    }

    @Override
    public Integer resta(Integer valor1, Integer valor2) {
        return valor1 -  valor2;
    }
    
}
