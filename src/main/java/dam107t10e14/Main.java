/*
    Crear “a mano” un fichero de tipo properties que mantenga el nombre del sitio web de una
    empresa, la IP del mismo y el puerto de conexión. Realizar un programa que lea ese fichero y
    compruebe mediante expresiones regulares que la IP tiene 4 bloques de entre 1 y 3 dígitos
    separados por puntos. Luego extrae de la expresión regular esos 4 bloques y verifica que todos
    tienen un valor menor que 256. Finalmente crea una clase inmutable llamada WebSite con los
    valores leídos.
 */
package dam107t10e14;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    static String separador = System.getProperty("file.separator");
    static String ruta = "." + separador + "src" + separador + "main" + separador + "java" + separador + "archivos" + separador + "web.config";
    static Properties config;
    
    static String web, ip;
    static int puerto;
    
    public static void main(String [] args){
    String expIp="(\\d{1,3})\\.(\\d{1,3})\\.(\\d{1,3})\\.(\\d{1,3})";  
        config = new Properties();
        if(comprobarFichero()){
            if(ip.matches(expIp)){
                Pattern patron = Pattern.compile(expIp);
                Matcher matcher = patron.matcher(ip);
                matcher.find();
                int num1=Integer.valueOf(matcher.group(1));
                int num2=Integer.valueOf(matcher.group(2));
                int num3=Integer.valueOf(matcher.group(3));
                int num4=Integer.valueOf(matcher.group(4));
                if(num1<256 && num2<256 && num3<256 && num4<256 && num1>=0 && num2>=0 && num3>=0 && num4>=0){
                    System.out.println("Valores de la IP correctos");
                    WebSite fich = new WebSite(ip, web, puerto);
                    System.out.println(fich.toString());
                }
                else System.out.println("Valor de la IP Incorrecto (0,255)");
                }
            else System.out.println("No cumple");
            
        }
        else System.out.println("Se ha producido un error");
    }
    
    public static boolean comprobarFichero(){
        
        try {
            config.load(new FileInputStream(ruta));
            web = config.getProperty("dominio");
            ip = config.getProperty("ip");
            puerto = Integer.valueOf(config.getProperty("puerto"));

        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado");
            return false;
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
        return true;
    }
}
