/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dam107t10e7;

import java.util.ArrayList;

public class ListaPequenia <t> {
    private final int tamanioMax;
    private ArrayList <t> valores;
    
    ListaPequenia(int tamanio){
        this.tamanioMax=tamanio;
        valores=new ArrayList<>();
    }
    
    public void aniadir(t param){
        if(this.valores.size()==this.tamanioMax) valores.remove(tamanioMax-1);
        valores.add(param);          
    }
    
    public void clear(){
        this.valores.clear();
    }
    
    public ArrayList<t> getValores(){
        return this.valores;
    }
}
