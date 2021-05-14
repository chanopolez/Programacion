/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2tlp;
import javax.swing.JOptionPane;
/**
 *
 * @author nacho
 */
public class Ejercicio2TLPcorregido {
    private int legajo;
    private String nombre;
    private int edad;
    private int curso;
    
    public Ejercicio2TLPcorregido(){} 
   
    public void setLegajo(int legajo){
        this.legajo = legajo;
    }
    public int getLegajo(){
        return this.legajo;
    }
    
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

    public void setCurso(int curso){
       this.curso=curso; 
    } 
    public int getCurso() {
        return this.curso;
    }
    
    public static void main (String args[]){   
        int a = 1;
        int i;      
        Ejercicio2TLPcorregido alumno[] = new Ejercicio2TLPcorregido[a];
        for(i=0; i<alumno.length; i++){
            alumno[i] = new Ejercicio2TLPcorregido();
            alumno[i].setLegajo(Integer.valueOf(JOptionPane.showInputDialog("Ingrese el legajo:")));
            alumno[i].setNombre(JOptionPane.showInputDialog("Ingrese el nombre:"));
            alumno[i].setEdad(Integer.valueOf(JOptionPane.showInputDialog("Ingrese la edad:")));
            alumno[i].setCurso(Integer.valueOf(JOptionPane.showInputDialog("Ingrese su curso, por favor:")));
        }
        for(i=0; i<alumno.length; i++){
            JOptionPane.showMessageDialog(null, "Legajo: "+alumno[i].getLegajo()+"\nNombre: "+alumno[i].getNombre()+"\nEdad: "+alumno[i].getEdad()+"\nCurso: "+alumno[i].getCurso());
        }
    }
}
