/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.mycompany.nba;

import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.CheckBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

/**
 * FXML Controller class
 *
 * @author usuario
 */
public class ConexionController implements Initializable {
    
    
    //Conexion con la pantalla
    @FXML
    private TextField txtpuerto;
    @FXML
    private TextField txtusuario;
    @FXML
    private TextField txtcontraseña;
    @FXML
    private TextField txtip;
    @FXML
    private TextField txtbd;
    @FXML
    private RadioButton rbtnxml;
    @FXML
    private CheckBox chckVictoria;
    @FXML
    private RadioButton rbtnini;
    private ToggleGroup radioGroup;
    
    //Conexion con el resto del programa
    private ConfigConexion config;
    private InicioController inicio;
    private NBA nba;
    
    //Variables locales
    boolean guardado=false;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        radioGroup = new ToggleGroup();
        rbtnxml.setToggleGroup(radioGroup);
        rbtnini.setToggleGroup(radioGroup);
    }
    
    public void setNBA(NBA nba){
        this.nba=nba;
    }
    public void setInicio(InicioController inicio){
        this.inicio=inicio;
    }
    
    public void setConfig(ConfigConexion config){
        this.config=config;
    }
    
    public void cargar(){
        try {
            config.setValores(txtpuerto.getText(), txtusuario.getText(), txtcontraseña.getText(), txtip.getText(), txtbd.getText(), chckVictoria.isSelected());
            nba.cargarConfig();
            
            if (!guardado){
                nba.muestraInicio();
                nba.cerrarConexion();
            }
        } catch (SQLException ex) {
            Alert alerta = new Alert(Alert.AlertType.ERROR);
            alerta.setTitle("Error");
            alerta.setHeaderText("No es posible conectar con la base de datos");
            alerta.setContentText(ex.toString());
            alerta.showAndWait();
        }
    }
    
    
    public void guardar() throws Throwable{
        guardado=true;
        this.cargar();
        if(radioGroup.getSelectedToggle().equals(rbtnxml)){
            nba.guardarConfigXML();
        }
        else{
            nba.guardarConfigINI();
        }
        nba.muestraInicio();
        nba.cerrarConexion();
    }
    
}
