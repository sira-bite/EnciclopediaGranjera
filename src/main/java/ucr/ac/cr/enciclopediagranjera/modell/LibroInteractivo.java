/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ucr.ac.cr.enciclopediagranjera.modell;
import java.util.ArrayList;
import ucr.ac.cr.enciclopediagranjera.modell.Animal;
import ucr.ac.cr.enciclopediagranjera.modell.Cerdo;
import ucr.ac.cr.enciclopediagranjera.modell.Caballo;
import ucr.ac.cr.enciclopediagranjera.modell.Gallina;
import ucr.ac.cr.enciclopediagranjera.modell.Pato;
import ucr.ac.cr.enciclopediagranjera.modell.Vaca;
/**
 *
 * @author Usuario
 */
public class LibroInteractivo {
    
    
 private boolean[] resultadosPag=new boolean[5]; 
 private ArrayList<String> resultadosPartida=new ArrayList<>();
 
  private Animal[] animales = new Animal[5];

    public LibroInteractivo( ) {
        animales[0]=new Cerdo("Cerdo","Animal que le gusta el barro","IMAGEN","Caballo","Yegua","Cerdo");
        animales[1]=new Caballo("Caballo","Muy rapido","IMAGEN","Caballo","Velociraptor","cabra");
        animales[2]=new Pato("Pato", "Ave acuatica de patas palmeadas", "imagen", "gallina", "pato", "garza");
        animales[3]=new Gallina("gallina","Ave terrestre con patas de garra","imagen","Caballo","Gallina","Cerdo");
        animales[4]=new  Vaca("Vaca","Animal que da leche que consumimos","IMAGEN","Vaca","pez","canario");
        
    }

    public Animal[] getAnimales() {
        return animales;
    }
  
    public void registrarRespuesta(int pagina, boolean respuesta){
        
    resultadosPag[pagina]=respuesta;
    //se almancena en el arays
    if(respuesta){
    resultadosPartida.add( "acerto en la pagina"+ pagina);
    }else{
    resultadosPartida.add( "fallaste en la pagina"+ pagina);
    }
    }
    
  public int totalAciertos(){
  int aciertos=0;
  for(Boolean estado: resultadosPag){
  if(estado!=null && estado==true){
  aciertos++;
  }
  }
  return aciertos;
  }
 
 public int totalFallos(){
  int fallos=0;
  for(Boolean estado: resultadosPag){
  if(estado!=null && estado==false){
  fallos++;
  }
  }
  return fallos;
  } 
 
public ArrayList<String>mostrarResultados(){
return resultadosPartida;
} 

 
}
