/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.mycompany.nba;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;

/**
 * FXML Controller class
 *
 * @author usuario
 */
public class InicioController implements Initializable {

    NBA nba;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
    
    public void setNBA(NBA nba){
      this.nba=nba;  
    }
    
}
