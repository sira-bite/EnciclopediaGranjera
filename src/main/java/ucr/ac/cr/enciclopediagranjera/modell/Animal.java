/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ucr.ac.cr.enciclopediagranjera.modell;

/**
 *
 * @author Admin
 */
public class Animal {
    String nombre;
    String descripcion;
    String imagen;
    String opcion1;
    String opcion2;
    String opcion3;

    public Animal(String nombre, String descripcion, String imagen, String opcion1, String opcion2, String opcion3) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.imagen = imagen;
        this.opcion1 = opcion1;
        this.opcion2 = opcion2;
        this.opcion3 = opcion3;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getImagen() {
        return imagen;
    }

    public String getOpcion1() {
        return opcion1;
    }

    public String getOpcion2() {
        return opcion2;
    }

    public String getOpcion3() {
        return opcion3;
    }

    @Override
    public String toString() {
        return "Animal{" + "nombre=" + nombre + ", descripcion=" + descripcion + ", imagen=" + imagen + ", opcion1=" + opcion1 + ", opcion2=" + opcion2 + ", opcion3=" + opcion3 + '}';
    }
    
    
    
}
