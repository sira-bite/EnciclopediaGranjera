/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ucr.ac.cr.enciclopediagranjera.modell;

/**
 *
 * @author Usuario
 */
public class Cerdo extends Animal {
   
 
     private String[][] pistaCerdo ={ {"facil:","tiene cuatro patas, hocico y una cola pequeña"},
           {"dificil:", "mamífero doméstico de cuerpo robusto"}};
         
    public Cerdo(String nombre, String descripcion, String imagen, String opcion1, String opcion2, String opcion3) {
        super("Cerdo","Animal que le gusta el barro","IMAGEN","Caballo","Yegua","Cerdo");
    }
    
    public String pistaCerd(int fila, int columna){
    return pistaCerdo[fila][columna];
    }
    
}
