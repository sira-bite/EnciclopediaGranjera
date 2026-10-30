/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ucr.ac.cr.enciclopediagranjera.controller;
import ucr.ac.cr.enciclopediagranjera.view.MainFrame;
import ucr.ac.cr.enciclopediagranjera.view.MainMenu;
import ucr.ac.cr.enciclopediagranjera.view.PagePanel;
import ucr.ac.cr.enciclopediagranjera.modell.LibroInteractivo;
import ucr.ac.cr.enciclopediagranjera.modell.Animal;
/**
 *
 * @author Usuario
 */
public class ControllerGranja {
  MainFrame mainFrame;
    MainMenu mainMenu;
    PagePanel pagePanel;
    LibroInteractivo libroInteractivo;  
    
      int page = 0;
      
    public ControllerGranja() {
     libroInteractivo = new LibroInteractivo();

        mainFrame = new MainFrame();
        mainMenu = new MainMenu();

        mainFrame.setVisible(true);

        mainMenu = mainFrame.getMainMenu();
        pagePanel = mainFrame.getPagePanel1();

        pagePanel.setVisible(false);

        mainMenu.getSalitBtn().addActionListener(e -> System.exit(0));

        mainMenu.getPlayBtn().addActionListener(e -> {
            mainMenu.setVisible(false);
            pagePanel.setVisible(true);
            mostrarPagina(page);
        });
        
        pagePanel.getContinuarBtn().addActionListener(e -> {
        mostrarPagina(page++);
        });
        
        pagePanel.getRegresarBtn().addActionListener(e -> {
        mostrarPagina(page--);
        });      
    }
    
     public void mostrarPagina(int page) {
        Animal[] animales = libroInteractivo.getAnimales();

        pagePanel.getDescripcionLabel().setText(animales[page].getDescripcion());
        pagePanel.getOpcion1Btn().setText(animales[page].getOpcion1());
        pagePanel.getOpcion2Btn().setText(animales[page].getOpcion2());
        pagePanel.getOpcion3Btn().setText(animales[page].getOpcion3());
    }

    
    
}
