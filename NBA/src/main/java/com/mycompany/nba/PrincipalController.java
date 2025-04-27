/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.mycompany.nba;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

/**
 * FXML Controller class
 *
 * @author usuario
 */
public class PrincipalController implements Initializable {

    @FXML
    private TableView tablaPartidos;
    @FXML
    private TableColumn equipoLocalColumn;
    @FXML
    private TableColumn equipoVisitanteColumn;
    @FXML
    private TableColumn conferenciaLocalColumn;
    @FXML
    private TableColumn conferenciaVisitanteColumn;    
    @FXML
    private TableColumn puntosLocalColumn;
    @FXML
    private TableColumn puntosVisitanteColumn;
    @FXML
    private TableColumn temporadaColumn;
    
    @FXML
    private Label totalPartidosLabel;
    @FXML
    private Label puntosLocalLabel;
    @FXML
    private Label puntosVisitanteLabel;
    @FXML
    private Label mediaLocalLabel;
    @FXML
    private Label mediaVisitanteLabel;
    
    @FXML
    private ChoiceBox equipoLocalCB;
    @FXML
    private ChoiceBox equipoVisitanteCB;
    @FXML
    private ChoiceBox temporadaInicialCB;
    @FXML
    private ChoiceBox temporadaFinalCB;
    @FXML
    private ChoiceBox conferenciaLocalCB;
    @FXML
    private ChoiceBox conferenciaVisitanteCB;
    
    private NBA nba;
    private ConfigConexion config;
    private FilteredList<Partido> listaPartidos;

    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        String equipoL = "equipoLocal";
        String equipoV = "equipoVisitante";
        String conferenciaL = "conferenciaLocal";
        String conferenciaV = "conferenciaVisitante";
        String puntosL = "puntosLocal";
        String puntosV = "puntosVisitante";
        String temporada = "temporada";
        
        equipoLocalColumn.setCellValueFactory(new PropertyValueFactory<>(equipoL));
        equipoVisitanteColumn.setCellValueFactory(new PropertyValueFactory<>(equipoV));
        conferenciaLocalColumn.setCellValueFactory(new PropertyValueFactory<>(conferenciaL));
        conferenciaVisitanteColumn.setCellValueFactory(new PropertyValueFactory<>(conferenciaV));
        puntosLocalColumn.setCellValueFactory(new PropertyValueFactory<>(puntosL));
        puntosVisitanteColumn.setCellValueFactory(new PropertyValueFactory<>(puntosV));
        temporadaColumn.setCellValueFactory(new PropertyValueFactory<>(temporada));
    }
   
    public void setNBA(NBA nba){
        this.nba=nba;
        listaPartidos= new FilteredList(nba.getDatosPartidos());
        tablaPartidos.setItems(listaPartidos);
      
        equipoLocalCB.setItems(nba.getListaEquipos());
        equipoVisitanteCB.setItems(nba.getListaEquipos());
        conferenciaLocalCB.setItems(nba.getListaConferencias());
        conferenciaVisitanteCB.setItems(nba.getListaConferencias());
        temporadaInicialCB.setItems(nba.getListaTemporadas());
        temporadaFinalCB.setItems(nba.getListaTemporadas());
        
        equipoLocalCB.setValue("TODOS");
        equipoVisitanteCB.setValue("TODOS");
        conferenciaLocalCB.setValue("TODOS");
        conferenciaVisitanteCB.setValue("TODOS");
        temporadaInicialCB.setValue("TODOS");
        temporadaFinalCB.setValue("TODOS");
        
        actualizarEstadisticas();
    }
    
    public void setConfig(ConfigConexion config){
        this.config=config;
    }
    
    public void buscar() {
        
        String equipoLocal = equipoLocalCB.toString();
        String equipoVisitante =  equipoVisitanteCB.toString();
        String conferenciaLocal =  conferenciaLocalCB.toString();
        String conferenciaVisitante =  conferenciaVisitanteCB.toString();
        String temporadaInicio =  temporadaInicialCB.toString();
        String temporadaFinal =  temporadaFinalCB.toString();

        listaPartidos.setPredicate(partido -> {
            boolean matchEquipoLocal = equipoLocal.equals("TODOS") || partido.getEquipoLocal().equals(equipoLocal);
            boolean matchEquipoVisitante = equipoVisitante.equals("TODOS") || partido.getEquipoVisitante().equals(equipoVisitante);
            boolean matchConferenciaLocal = conferenciaLocal.equals("TODOS") || partido.getConferenciaLocal().equals(conferenciaLocal);
            boolean matchConferenciaVisitante = conferenciaVisitante.equals("TODOS") || partido.getConferenciaVisitante().equals(conferenciaVisitante);
            boolean matchTemporada = true;

            if (!temporadaInicio.equals("TODOS") && !temporadaFinal.equals("TODOS")) {
                int añoInicio = temporadaAño(temporadaInicio);
                int añoFinal = temporadaAño(temporadaFinal);
                int añoPartido = temporadaAño(partido.getTemporada());

                matchTemporada = añoPartido >= añoInicio && añoPartido <= añoFinal;
            }

            return matchEquipoLocal &&
                   matchEquipoVisitante &&
                   matchConferenciaLocal &&
                   matchConferenciaVisitante &&
                   matchTemporada;
            });
        
        actualizarEstadisticas();
    }

    public void actualizarEstadisticas(){
        
        int totalPartidos = listaPartidos.size();
        int sumaPuntosLocal = 0;
        int sumaPuntosVisitante = 0;

        for (Partido partido : listaPartidos){
            sumaPuntosLocal += partido.getPuntosLocal();
            sumaPuntosVisitante += partido.getPuntosVisitante();
        }

        double mediaPuntosLocal = totalPartidos > 0 ? (double) sumaPuntosLocal / totalPartidos : 0;
        double mediaPuntosVisitante = totalPartidos > 0 ? (double) sumaPuntosVisitante / totalPartidos : 0;

        totalPartidosLabel.setText("Partidos: " + totalPartidos);
        puntosLocalLabel.setText("Puntos Locales: " + sumaPuntosLocal);
        puntosVisitanteLabel.setText("Puntos Visitantes: " + sumaPuntosVisitante);
        mediaLocalLabel.setText(String.format("Media Local: %.2f", mediaPuntosLocal));
        mediaVisitanteLabel.setText(String.format("Media Visitante: %.2f", mediaPuntosVisitante));
    }
    
    private int temporadaAño(String temporada) {
        String[] partes = temporada.split("/");
        int año = Integer.parseInt(partes[0]);
        return (año < 50) ? 2000 + año : 1900 + año;
    }
}
