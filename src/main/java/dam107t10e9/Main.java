/*
Define una interfaz llamada Operable, que sea genérica et tipo ‘T’. Tiene que declarar los
métodos suma y resta. Ambos métodos recibirán dos parámetros de tipo genérico ‘T’ y devolverán
un genérico del mismo tipo.
• Crea una clase (no génerica) llamada OperadorEntero que implemente la interfaz anterior
con Integer (ya sabemos cómo es la suma y resta de enteros)
• Crea una clase (no génerica) llamada OperadorString que implemente la interfaz anterior
con Strings. Lla suma de Strings es la concatenación de la primera cadena pasada como
parámetro con la segunda. La resta de String será eliminar todas las ocurrencias de la
cadena segundo operando que se encuentren en la cadena primer operando, por ejemplo
resta (“AbcDDxxDD”,”DD”) devolvería “Abcxx”.
• Finalmente, haz un programa que instancie ambas clases creadas y opere con ellas. 
 */
package dam107t10e9;

public class Main {
    public static void main(String[] args){
        OperadorEntero opInt = new OperadorEntero();
        OperadorString opStr = new OperadorString();
        
        System.out.println("Suma: " + opInt.suma(5, 3));
        System.out.println("Resta: " + opInt.resta(5, 3));
        
        System.out.println("Concatenacion: " + opStr.suma("No se que esta pasando", " aqui"));
        System.out.println("Resta: " + opStr.resta("AbcDDxxDD", "DD"));
    }
}
