/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2tlp;

/**
 *
 * @author nacho
 */
public class Estudiante {
    private int legajo;
    private String nombre;
    private int edad;
    private String curso;

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String w) {
        this.nombre = w;
    }

    public int getLegajo() {
        return legajo;
    }
    public void setLegajo(int e) {
        this.legajo = e;
    }

    public int getEdad() {
        return edad;
    }
    public void setEdad(int e) {
        this.edad = e;
    }
    
    public String getCurso() {
        return curso;
    }
    public void setCurso(String eeee) {
        this.curso = eeee;
    }
}
