package com.mycompany.nba;

import java.io.File;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;

/**
 * JavaFX NBA
 */
public class NBA extends Application {

   private static Scene escenaPrincipal;

   private BorderPane contenedorPrincipal;

   private AnchorPane vistaPartidos;
   
   private AnchorPane vistaConexion;
   
   File archivoXML= new File("archivo.xml");
   File archivoINI = new File("archivo.ini");

    @Override
    public void start(Stage stage) throws IOException {
        
        if(!archivoXML.exists()&&!archivoINI.exists()){
            muestraConexion();
        }
        
        FXMLLoader vista = new FXMLLoader(NBA.class.getResource("VistaPrincipal.fxml"));
        contenedorPrincipal = vista.load();
        VistaPrincipalController controller = vista.getController();
            
        //Acceso al controlador a NBA
        controller.setNBA(this);
        escenaPrincipal = new Scene(contenedorPrincipal);
        stage.setScene(escenaPrincipal);
        stage.show();
        
        muestraPartidos();
        
        
    }

    public static void main(String[] args) {
        launch();
    }
    public void muestraConexion(){
        try {
            Stage stage=new Stage();
            FXMLLoader vista = new FXMLLoader (NBA.class.getResource("Conexion.fxml"));
            vistaConexion=vista.load();
            Scene escenaConexion = new Scene(vistaConexion);
            stage.setScene(escenaConexion);
            stage.show();
         } catch (Exception ex) {
             System.out.println(ex.getMessage());
                     
         } 
    }
    public void muestraPartidos(){
        
        try {
             FXMLLoader vista = new FXMLLoader(NBA.class.getResource("Inicio.fxml"));
             vistaPartidos=vista.load();
             contenedorPrincipal.setCenter(vistaPartidos);

              //Doy acceso al controlador VistaPersonaCOntroller a LibretaDirecciones
            InicioController controller = vista.getController();
            controller.setNBA(this);
            
         } catch (Exception ex) {
             System.out.println(ex.getMessage());
                     
         } 
    }
}