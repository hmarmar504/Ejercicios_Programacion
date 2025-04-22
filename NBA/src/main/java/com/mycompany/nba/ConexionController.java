/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.mycompany.nba;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

/**
 * FXML Controller class
 *
 * @author usuario
 */
public class ConexionController implements Initializable {
    
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
    private RadioButton rbtnini;
    
    private ToggleGroup radioGroup;
    
    private ConfigConexion config;
    
    private NBA nba;
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        rbtnxml.setToggleGroup(radioGroup);
        rbtnini.setToggleGroup(radioGroup);
        
    }
    public void setNBA(NBA nba){
        this.nba=nba;
    }
    public void setConfig(ConfigConexion config){
        this.config=config;
    }
    public void cargar(){
        config.setValores(txtpuerto.getText(), txtusuario.getText(), txtcontraseña.getText(), txtip.getText(), txtbd.getText());
        nba.cargarConfig();
        nba.cerrarConexion();
    }
    
    
    public void guardar() throws Throwable{
        if(radioGroup.getSelectedToggle()==rbtnxml){
            
        }
        
    }
}
