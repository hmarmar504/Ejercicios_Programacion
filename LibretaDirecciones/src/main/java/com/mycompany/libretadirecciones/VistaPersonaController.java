/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.mycompany.libretadirecciones;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import javafx.fxml.FXML;

import javafx.scene.control.TableView;

import javafx.scene.control.Label;

import javafx.scene.control.TableColumn;
import javafx.scene.control.cell.PropertyValueFactory;



public class VistaPersonaController implements Initializable 
{
    @FXML

    private TableView tablaPersonas;

    @FXML

    private TableColumn nombreColumn;

    @FXML

    private TableColumn apellidosColumn;

    @FXML

    private Label nombreLabel;

    @FXML

    private Label apellidosLabel;

    @FXML

    private Label direccionLabel;

    @FXML

    private Label codigoPostalLabel;

    @FXML

    private Label ciudadLabel;

    @FXML

    private Label fechaDeNacimientoLabel;

    // Referencia a la clase principal
    private LibretaDirecciones libretaDirecciones;

    //El constructor es llamado ANTES del método initialize
    public VistaPersonaController() {
        
    }

    //Inicializa la clase controller y es llamado justo después de cargar el archivo FXML
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        //Inicializo la tabla con las dos primera columnas
        String nombre = "nombre";
        String apellidos = "apellidos";

        nombreColumn.setCellValueFactory(new PropertyValueFactory<>(nombre));
        apellidosColumn.setCellValueFactory(new PropertyValueFactory<>(apellidos));
        
        //Borro los detalles de la persona
        mostrarDetallesPersona(null);
    }    
    
    //Es llamado por la aplicación principal para inicializar valores de la tabla
    //a través de una referencia recibida como argumento (mirar el método muestraVistaPersona() de la clase LibretaDirecciones)
    public void setLibretaDirecciones(LibretaDirecciones libretaDirecciones) 
    {
        this.libretaDirecciones = libretaDirecciones;

        //Añado la lista obervable a la tabla
        //Si en el método initialize no usamos los métodos setCellValueFactory, ahora tendríamos que recorrer la lista e
        //insertar los valores uno a uno en la tabla

        tablaPersonas.setItems(libretaDirecciones.getDatosPersona());
    }
}