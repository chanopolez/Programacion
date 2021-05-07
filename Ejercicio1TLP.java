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
public class Ejercicio1TLP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a=1,i;
        
        Perro labrador[] = new Perro[a];
        
        for(i=0;i<labrador.length;i++){
            labrador[i]=new Perro();
            labrador[i].setNombre(JOptionPane.showInputDialog("Ingrese el nombre del can:"));
            labrador[i].setEdad(Integer.valueOf(JOptionPane.showInputDialog("Ingrese la edad del can:")));
            labrador[i].setRaza(JOptionPane.showInputDialog("Ingrese la raza del can:"));
        }
        for(i=0;i<labrador.length;i++){
            JOptionPane.showMessageDialog(null, labrador[i].getNombre()+", "+labrador[i].getEdad()+" años\nRaza: "+labrador[i].getRaza());
        }
    }
    
}
