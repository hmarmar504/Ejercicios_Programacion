package com.mycompany.nba;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;
import jakarta.xml.bind.PropertyException;
import java.io.File;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.control.Alert;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;

/**
 * JavaFX NBA
 */
public class NBA extends Application {

   private static Scene escenaPrincipal;
   
   private Stage stageConexion;
   
   private BorderPane contenedorPrincipal;

   private AnchorPane vistaPartidos;
   
   private AnchorPane vistaConexion;
   
   private ConfigConexion conexion = new ConfigConexion();
   
   private File archivoXML= new File("archivo.xml");
   private File archivoINI = new File("archivo.ini");

    @Override
    public void start(Stage stage) throws IOException {
        //!archivoXML.exists()&&!archivoINI.exists()
        if(false){
            muestraConexion();
        }
        else{
        FXMLLoader vista = new FXMLLoader(NBA.class.getResource("VistaPrincipal.fxml"));
        contenedorPrincipal = vista.load();
        VistaPrincipalController controller = vista.getController();
            
        //Acceso al controlador a NBA
        controller.setNBA(this);
        escenaPrincipal = new Scene(contenedorPrincipal);
        stage.setScene(escenaPrincipal);
        stage.show();
        
        muestraInicio();
        }
        
    }
    public void cargarConfig(){
        
    }
    
    //
    //PRUEBAS DE GUARDADO
    //  
    public void guardarConfigXML(){
        
       
       try {
           archivoXML.createNewFile();
           JAXBContext context = JAXBContext.newInstance(ConfigConexion.class);
           Marshaller m = context.createMarshaller();
           m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
           m.marshal(conexion, archivoXML);
           
       } catch (Exception ex) {
           Alert alerta = new Alert(Alert.AlertType.ERROR);
            alerta.setTitle("Error");
            alerta.setHeaderText("No se puede guardar en el archivo "+ archivoXML.getPath());
            alerta.setContentText(ex.toString());
            alerta.showAndWait();
       }
       
    }

    public static void main(String[] args) {
        launch();
    }
    public void muestraConexion(){
        try {
            stageConexion=new Stage();
            FXMLLoader vista = new FXMLLoader (NBA.class.getResource("Conexion.fxml"));
            vistaConexion=vista.load();
            Scene escenaConexion = new Scene(vistaConexion);
            stageConexion.setScene(escenaConexion);
            stageConexion.show();
            stageConexion.setAlwaysOnTop(true);
            
            ConexionController controller = vista.getController();
            controller.setConfig(conexion);
            controller.setNBA(this);
         } catch (Exception ex) {
             System.out.println(ex.getMessage());
                     
         } 
    }
    public void cerrarConexion(){
        stageConexion.close();
    }
    public void muestraInicio(){
        
        try {
             FXMLLoader vista = new FXMLLoader(NBA.class.getResource("Inicio.fxml"));
             vistaPartidos=vista.load();
             contenedorPrincipal.setCenter(vistaPartidos);

            
            InicioController controller = vista.getController();
            controller.setConfig(conexion);
            controller.setNBA(this);
            
         } catch (Exception ex) {
             System.out.println(ex.getMessage());
                     
         } 
    }
}