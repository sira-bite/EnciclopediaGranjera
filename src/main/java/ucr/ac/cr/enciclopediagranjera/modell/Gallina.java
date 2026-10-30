/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ucr.ac.cr.enciclopediagranjera.modell;

/**
 *
 * @author Usuario
 */
public class Gallina extends Animal {
 private String[][] pistaGallina ={ {"facil:","ave que tiene plumas, dos patas y pone huevos"},
           {"dificil:", "se alimenta de semillas, insectos y otros pequeños alimentos"}};
 
    //gallina, pato
    public Gallina(String nombre, String descripcion, String imagen, String opcion1, String opcion2, String opcion3) {
        super("gallina","Ave terrestre con patas de garra", imagen,"Caballo","Gallina","Cerdo");
        
    }
    
     public String pistaGa(int fila, int columna){
    return pistaGallina[fila][columna];
    }
  
}
