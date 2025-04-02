package com.mycompany.libretadirecciones; //modifica esto según tus necesidades (ojo con mayúsculas y minúsculas)



import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import javafx.fxml.FXMLLoader;

import javafx.scene.Scene;

import javafx.stage.Stage;

import javafx.scene.layout.AnchorPane;

import javafx.scene.layout.BorderPane;


public class LibretaDirecciones extends Application 
{
    private static Scene escenaPrincipal;

    private BorderPane contenedorPrincipal;

    private AnchorPane vistaPersona;
    
    private ObservableList datosPersona = FXCollections.observableArrayList();

    public LibretaDirecciones(){
        
        datosPersona.add(new Persona("Jairo", "García Rincón"));

        datosPersona.add(new Persona("Juan", "Pérez Martínez"));

        datosPersona.add(new Persona("Andrea", "Chenier López"));

        datosPersona.add(new Persona("Emilio", "González Pla"));

        datosPersona.add(new Persona("Mónica", "de Santos Sánchez"));
    }
    
        public ObservableList getDatosPersona() {

        return datosPersona;

    }
    
    @Override
    public void start(Stage escenarioPrincipal) {
         try {
            FXMLLoader vista = new FXMLLoader(LibretaDirecciones.class.getResource("VistaPrincipal.fxml"));
            
            escenaPrincipal = new Scene(vista.load());
            
            escenarioPrincipal.setScene(escenaPrincipal);
            escenarioPrincipal.setTitle("Libreta de direcciones");
            escenarioPrincipal.show();
        
            muestraVistaPersona();
            
         } catch (Exception ex) {
              System.out.println(ex.getMessage());
         }
    }


    


    public void muestraVistaPersona() 
    {
     
         try {
             FXMLLoader vista = new FXMLLoader(LibretaDirecciones.class.getResource("VistaPersona.fxml"));
             
             vistaPersona = vista.load();
            
             contenedorPrincipal.setCenter(vistaPersona);
              

         } catch (Exception ex) {
             System.out.println(ex.getMessage());
                     
         }      
    }



    //Método main

    public static void main(String[] args) {

        launch(args);

    }


}
