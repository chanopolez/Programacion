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
public class Ejercicio2TLP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a=1,i;
        
        Estudiante alumno[] = new Estudiante[a];
        
        for(i=0;i<alumno.length;i++){
            alumno[i]=new Estudiante();
            alumno[i].setLegajo(Integer.valueOf(JOptionPane.showInputDialog("Ingrese el legajo:")));
            alumno[i].setNombre(JOptionPane.showInputDialog("Ingrese el nombre:"));
            alumno[i].setEdad(Integer.valueOf(JOptionPane.showInputDialog("Ingrese la edad:")));
            alumno[i].setCurso(JOptionPane.showInputDialog("Ingrese el curso:"));
        }
        for(i=0;i<alumno.length;i++){
            JOptionPane.showMessageDialog(null, "Legajo: "+alumno[i].getLegajo()+"\nNombre: "+alumno[i].getNombre()+"\nEdad: "+alumno[i].getEdad()+"\nCurso: "+alumno[i].getCurso());
        }
    }
    
}
