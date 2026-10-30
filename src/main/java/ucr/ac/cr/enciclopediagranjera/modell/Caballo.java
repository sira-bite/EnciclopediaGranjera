/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ucr.ac.cr.enciclopediagranjera.modell;

/**
 *
 * @author Usuario
 */
public class Caballo extends Animal{
   private String[][] pistaCaballo ={ {"facil:","Es un animal grande que tiene cuatro patas, cola y crin"},
           {"dificil:", "mamífero herbívoro que se caracteriza por su fuerza y velocidad"}};
           
    public Caballo(String nombre, String descripcion, String imagen, String opcion1, String opcion2, String opcion3) {
        super("Caballo","Muy rapido","IMAGEN","Caballo","Velociraptor","cabra");
    }
    
    //busca la posicion y muestra la pista
    public String pistaCab(int fila, int columna){
    return pistaCaballo[fila][columna];
    }
    
}
