/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import javax.swing.JOptionPane;
/**
 *
 * @author pc14
 */
public class Perro {
    int n=1;
    private String nombre;
    private int edad;
    private String raza;

    public Perro(String nombre,int edad,String raza){
        this.nombre=nombre;
        this.edad=edad;
        this.raza=raza;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
    
    perro Labrador[]=new Perro(n);
    for(int i=0;i<labrador.lenght;i++){
        Labrador[i]=new Perro();
        Labrador[i]=setNombre(JOptionPane.showInputDialog("Ingrese el nombre:"));
        Labrador[i]=setEdad(Integer.valueOf(JOptionPane.showInputDialog("Ingrese la edad:")));
        Labrador[i]=setRaza(JOptionPane.showInputDialog("Ingrese la raza:"));
    }
    for(int i=0;i<labrador.lenght();i++){
        JOptionPane.showMessageDialog(null,labrador)
    }
}
