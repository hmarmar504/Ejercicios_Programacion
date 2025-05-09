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
import javafx.scene.control.Label;

/**
 * FXML Controller class
 *
 * @author usuario
 */
public class InicioController implements Initializable {

    private NBA nba;
    @FXML
    private Label lblpuerto;
    @FXML
    private Label lblusuario;
    @FXML
    private Label lblcontraseña;
    @FXML
    private Label lblip;
    @FXML
    private Label lblbd;
    
    private ConfigConexion config;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        
    }    
    
    public void setNBA(NBA nba){
        this.nba=nba;
    }
    public void config(){
        nba.muestraConexion();
    }
    
    public void setConfig(ConfigConexion config){
        this.config=config;
        this.mostrarConfig();
    }
    public void mostrarConfig(){
        lblpuerto.setText(config.getPuerto());
        lblusuario.setText(config.getUsuario());
        lblcontraseña.setText(config.getContraseña());
        lblip.setText(config.getIp());
        lblbd.setText(config.getBd());
    }
    public void seguir(){
        
        try {
            nba.cargarConfig();
            nba.muestraPrincipal();
        } catch (SQLException ex) {
            Alert alerta = new Alert(Alert.AlertType.ERROR);
            alerta.setTitle("Error");
            alerta.setHeaderText("No es posible conectar con la base de datos");
            alerta.setContentText(ex.toString());
            alerta.showAndWait();
        }
    }
}
