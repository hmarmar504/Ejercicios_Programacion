package com.mycompany.nba;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.Marshaller;
import java.io.File;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.nio.file.Files;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
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
   private PrincipalController controllerPrincipal;
   private final ObservableList datosPartidos = FXCollections.observableArrayList();
   private final ObservableList listaEquipos = FXCollections.observableArrayList();
   private final ObservableList listaTemporadas = FXCollections.observableArrayList();
   private final ObservableList listaConferencias = FXCollections.observableArrayList();
   
   
   private final File archivoXML= new File("archivo.xml");
   private final File archivoINI = new File("archivo.ini");

    @Override
    public void start(Stage stage) throws IOException {
        
        cargarConfiguracion();
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
        } 
        catch (Exception ex) {
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
            archivoINI.delete();
            archivoXML.createNewFile();
            JAXBContext context = JAXBContext.newInstance(ConfigConexion.class);
            Marshaller m = context.createMarshaller();
            m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            m.marshal(conexion, archivoXML);
        } 
        catch (Exception ex) {
            Alert alerta = new Alert(Alert.AlertType.ERROR);
            alerta.setTitle("Error");
            alerta.setHeaderText("No se puede guardar en el archivo " + archivoXML.getPath());
            alerta.setContentText(ex.toString());
            alerta.showAndWait();
        }
    }

    public void guardarConfigINI(){
        
        try {
            archivoXML.delete();
            archivoINI.createNewFile();

            StringBuilder contenido = new StringBuilder();
            contenido.append("[Configuracion]").append(System.lineSeparator());
            contenido.append("Puerto=").append(conexion.getPuerto()).append(System.lineSeparator());
            contenido.append("Usuario=").append(conexion.getUsuario()).append(System.lineSeparator());
            contenido.append("Contraseña=").append(conexion.getContraseña()).append(System.lineSeparator());
            contenido.append("IP=").append(conexion.getIp()).append(System.lineSeparator());
            contenido.append("BaseDeDatos=").append(conexion.getBd()).append(System.lineSeparator());

            Files.write(archivoINI.toPath(), contenido.toString().getBytes());

        } 
        catch (IOException ex) {
            Alert alerta = new Alert(Alert.AlertType.ERROR);
            alerta.setTitle("Error");
            alerta.setHeaderText("No se puede guardar en el archivo " + archivoINI.getPath());
            alerta.setContentText(ex.toString());
            alerta.showAndWait();
        }
    }
    public void cargarConfiguracion(){
        
        if (archivoXML.exists()) {
            
            try {
                JAXBContext context = JAXBContext.newInstance(ConfigConexion.class);
                conexion = (ConfigConexion) context.createUnmarshaller().unmarshal(archivoXML);
            } 
            catch (Exception ex) {
                Alert alerta = new Alert(Alert.AlertType.ERROR);
                alerta.setTitle("Error");
                alerta.setHeaderText("No se puede cargar la configuración desde XML");
                alerta.setContentText(ex.toString());
                alerta.showAndWait();
            }
        } 
        else if (archivoINI.exists()) {
            
            try {
                java.util.List<String> lineas = Files.readAllLines(archivoINI.toPath());
                for (String linea : lineas) {
                    
                    if (linea.startsWith("Puerto=")) {
                        conexion.setPuerto(linea.substring("Puerto=".length()));
                    } 
                    else if (linea.startsWith("Usuario=")) {
                        conexion.setUsuario(linea.substring("Usuario=".length()));
                    } 
                    else if (linea.startsWith("Contraseña=")) {
                        conexion.setContraseña(linea.substring("Contraseña=".length()));
                    } 
                    else if (linea.startsWith("IP=")) {
                        conexion.setIp(linea.substring("IP=".length()));
                    } 
                    else if (linea.startsWith("BaseDeDatos=")) {
                        conexion.setBd(linea.substring("BaseDeDatos=".length()));
                    }
                }
            } 
            catch (Exception ex) {
                Alert alerta = new Alert(Alert.AlertType.ERROR);
                alerta.setTitle("Error");
                alerta.setHeaderText("No se puede cargar la configuración desde INI");
                alerta.setContentText(ex.toString());
                alerta.showAndWait();
            }
        }
    }

    public static void main(String[] args){
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

            //Llenar las listas de la pantalla principal
            datosPartidos.clear();
            datosPartidos.addAll(conexionSQL.getPartidos());
            listaEquipos.clear();
            listaEquipos.addAll(conexionSQL.getEquipos());
            listaConferencias.clear();
            listaConferencias.addAll(conexionSQL.getConferencia());
            listaTemporadas.clear();
            listaTemporadas.addAll(conexionSQL.getTemporada());

            controllerPrincipal = vista.getController();
            controllerPrincipal.setConfig(conexion);
            controllerPrincipal.setNBA(this);
        } 
        catch (Exception ex){
            Logger.getLogger(NBA.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public ObservableList getDatosPartidos(){
        return datosPartidos;
    }

    public ObservableList getListaEquipos() {
        return listaEquipos;
    }

    public ObservableList getListaTemporadas() {
        return listaTemporadas;
    }

    public ObservableList getListaConferencias() {
        return listaConferencias;
    }
    
}