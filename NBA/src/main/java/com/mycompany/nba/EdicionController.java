/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.mycompany.nba;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author marti
 */
public class EdicionController implements Initializable {

    Partido partido;
      @FXML
    private TextField txtEquipoLocal;
    @FXML
    private TextField txtEquipoVisitante;
    @FXML
    private TextField txtConferenciaLocal;
    @FXML
    private TextField txtConferenciaVisitante;
    @FXML
    private TextField txtTemporada;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }
    public void setPartido(Partido partido){
        this.partido=partido;
    }

}
