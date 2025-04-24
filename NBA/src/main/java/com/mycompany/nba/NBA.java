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
import java.sql.SQLException;
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
   
   private ConectorSQL conexionSQL;
   private InicioController controllerInicio;
   
   
   private File archivoXML= new File("archivo.xml");
   private File archivoINI = new File("archivo.ini");

    @Override
    public void start(Stage stage) throws IOException {
        
        
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
    //Configuracion de la pestaña de conexion
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
    public void cargarConfig() throws SQLException{
        conexionSQL = new ConectorSQL(conexion.getIp(),conexion.getPuerto(),conexion.getBd(),conexion.getUsuario(),conexion.getContraseña());
        controllerInicio.mostrarConfig();
    }
    
    //
    //PRUEBAS DE GUARDADO
    //  
    public void guardarConfigXML(){
       try {
           //Boorra el .INI y crea el .XML
           archivoINI.deleteOnExit();
           archivoXML.createNewFile();
           //Empaqueta la informacion de la configuracion y la mete en el archivo .XML
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
    public void guardarConfigINI(){
        //Recoger los datos de configuracion y meterlos a un archivo INI
        //Borra el .XML y crea el .INI
        archivoXML.deleteOnExit();
    }

    public static void main(String[] args) {
        launch();
    }
    
    public void muestraInicio(){
        
        try {
             FXMLLoader vista = new FXMLLoader(NBA.class.getResource("Inicio.fxml"));
             vistaPartidos=vista.load();
             contenedorPrincipal.setCenter(vistaPartidos);

            
            controllerInicio = vista.getController();
            controllerInicio.setConfig(conexion);
            controllerInicio.setNBA(this);
            
         } catch (Exception ex) {
             System.out.println(ex.getMessage());
                     
         } 
    }
    public void muestraPrincipal(){
       try {
           FXMLLoader vista = new FXMLLoader(NBA.class.getResource("Principal.fxml"));
           vistaPartidos=vista.load();
           contenedorPrincipal.setCenter(vistaPartidos);
           
           
           controllerInicio = vista.getController();
           controllerInicio.setConfig(conexion);
           controllerInicio.setNBA(this);
       } catch (IOException ex) {
           Logger.getLogger(NBA.class.getName()).log(Level.SEVERE, null, ex);
       }
    }
}