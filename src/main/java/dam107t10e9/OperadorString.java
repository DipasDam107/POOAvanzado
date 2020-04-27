
package dam107t10e9;

public class OperadorString implements Operable <String>{

    @Override
    public String suma(String valor1, String valor2) {
        return valor1 + valor2;
    }

    @Override
    public String resta(String valor1, String valor2) {
        return valor1.replaceAll(valor2, "");
    }
    
}
