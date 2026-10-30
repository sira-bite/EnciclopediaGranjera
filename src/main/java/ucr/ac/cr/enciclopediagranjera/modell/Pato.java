/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ucr.ac.cr.enciclopediagranjera.modell;

/**
 *
 * @author Usuario
 */
public class Pato extends Animal {

     private String[][] pistaPato ={ {"facil:","ave que tiene pico plano, plumas y patas cortas"},
           {"dificil:", "ave acuática"}};
    
    public Pato(String nombre, String descripcion, String imagen, String opcion1, String opcion2, String opcion3) {
        super("Pato", "Ave acuatica de patas palmeadas", imagen, "gallina", "pato", "garza");
    }
    
    
 public String pistapat(int fila, int columna){
    return pistaPato[fila][columna];
    }
    
}
