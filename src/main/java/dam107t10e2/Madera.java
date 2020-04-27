/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dam107t10e2;

/**
 *
 * @author User
 */
public enum Madera {
    //ROBLE 40€, SAPELLY 50 €, NOGAL 60€, CEREZO 70 € y BAMBÚ 100 €
    ROBLE(40),
    SAPELLY(50),
    NOGAL(60),
    CEREZO(70),
    BAMBU(100);
    
    int precio;
    static double CANTIDAD_CAJA = 2.5;
    
    Madera(int precio){
        this.precio=precio;
    }
    
    
    double calcularPrecio(double alto, double ancho){
        int cajas = (int)calcularCajas(alto,ancho);
        return cajas * this.precio;
        
    }
    double calcularCajas(double alto, double ancho){
        double total = alto*ancho;
        return Math.ceil(total);
    }
    
    
}
