/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1tlp;
import javax.swing.JOptionPane;
/**
 *
 * @author nacho
 */
public class Ejercicio1TLPcorregido {
    private String nombre;
    private int edad;
    private String raza;
    
    public Ejercicio1TLPcorregido(){} 
   
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return this.nombre;
    }
   
    public void setEdad(int edad){
        this.edad = edad;
    }
    public int getEdad(){
        return this.edad;
    }

    public void setRaza(String raza){
       this.raza=raza;
    }
    public String getRaza(){
        return this.raza;
    }
    
    public static void main (String args[]){   
        int a = 1;
        int i;      
        Ejercicio1TLPcorregido labrador[] = new Ejercicio1TLPcorregido[a];
        for(i=0; i<labrador.length; i++){
            labrador[i] = new Ejercicio1TLPcorregido();
            labrador[i].setNombre(JOptionPane.showInputDialog("Ingrese el nombre del can"));
            labrador[i].setEdad(Integer.valueOf(JOptionPane.showInputDialog("Ingrese la edad de dicho canino (en años)")));
            labrador[i].setRaza(JOptionPane.showInputDialog("Ingrese su raza, por favor:"));
        }
        for(i=0; i<labrador.length; i++){
            JOptionPane.showMessageDialog(null, labrador[i].getNombre()+", "+labrador[i].getEdad()+" años, "+labrador[i].getRaza());
        }
    }
}
