/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ucr.ac.cr.enciclopediagranjera.modell;

/**
 *
 * @author Usuario
 */
 public class Vaca extends Animal{

     
     private String[][] pistaVaca ={ {"facil:","animal grande que tiene cuatro patas"},
           {"dificil:", "mamífero herbívoro que se alimenta principalmente de pasto"}};
    
     
    public Vaca(String nombre, String descripcion, String imagen, String opcion1, String opcion2, String opcion3) {
        
        super("Vaca","Animal que da leche que consumimos","IMAGEN","Vaca","pez","canario");
    }

     public String pistaVac(int fila, int columna){
    return pistaVaca[fila][columna];
    }
     
     
    }

    
  
     

