/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.mycompany.nba;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author marti
 */
public class EdicionController implements Initializable {

    private Partido partido;
    private NBA nba;
    @FXML
    private ChoiceBox cbEquipoLocal;
    @FXML
    private ChoiceBox cbEquipoVisitante;
    @FXML
    private ChoiceBox cbConferenciaLocal;
    @FXML
    private ChoiceBox cbConferenciaVisitante;
    @FXML
    private ChoiceBox cbTemporada;
    @FXML
    private TextField txtPuntosLocal;
    @FXML
    private TextField txtPuntosVisitante;
    private ObservableList listaEquipos = FXCollections.observableArrayList();
    private ObservableList listaConferencias = FXCollections.observableArrayList();
    private ObservableList listaTemporadas = FXCollections.observableArrayList();
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }
    public void setPartido(Partido partido){
        this.partido=partido;
        cbEquipoLocal.setValue(partido.getEquipoLocal());
        cbEquipoVisitante.setValue(partido.getEquipoVisitante());
        cbConferenciaLocal.setValue(partido.getConferenciaLocal());
        cbConferenciaVisitante.setValue(partido.getConferenciaVisitante());
        cbTemporada.setValue(partido.getTemporada());
        txtPuntosLocal.setText(String.valueOf(partido.getPuntosLocal()));
        txtPuntosVisitante.setText(String.valueOf(partido.getPuntosVisitante()));
    }
    public void setNBA(NBA nba){
        this.nba=nba;
        
        listaEquipos.addAll(nba.getListaEquipos());
        listaEquipos.remove("TODOS");
        listaConferencias.addAll(nba.getListaConferencias());
        listaConferencias.remove("TODOS");
        listaTemporadas.addAll(nba.getListaTemporadas());
        listaTemporadas.remove("TODOS");

        cbEquipoLocal.setItems(listaEquipos);
        cbEquipoVisitante.setItems(listaEquipos);
        cbConferenciaLocal.setItems(listaConferencias);
        cbConferenciaVisitante.setItems(listaConferencias);
        cbTemporada.setItems(listaTemporadas);
    }
    public void guardar(){
        partido.setEquipoLocal((String)cbEquipoLocal.getValue());
        partido.setEquipoVisitante((String)cbEquipoVisitante.getValue());
        partido.setPuntosLocal(Integer.parseInt(txtPuntosLocal.getText()));
        partido.setPuntosVisitante(Integer.parseInt(txtPuntosVisitante.getText()));
        partido.setConferenciaLocal((String)cbConferenciaLocal.getValue());
        partido.setConferenciaVisitante((String)cbConferenciaVisitante.getValue());
        partido.setTemporada((String)cbTemporada.getValue());
        nba.cerrarEdicion();
    }
    public void cancelar(){
        nba.cerrarEdicion();
    }
}
