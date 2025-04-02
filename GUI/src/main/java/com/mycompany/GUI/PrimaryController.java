package com.mycompany.GUI;

import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;

import java.util.List;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import static javafx.collections.FXCollections.observableArrayList;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

public class PrimaryController implements Initializable
{
    ObservableList<String> opciones = FXCollections.observableArrayList("Manolo","Pedrito","Francisco","Pepito");
    
    @FXML
    private Label lblNombre;
    
    @FXML
    private ImageView image;
    
    @FXML
    private ChoiceBox chbx;
    
    @FXML
    private Button btn;
    
    @FXML
    private TextField txt;
    
    public PrimaryController()
    //constructor del controlador
    {
        //en el constructor se puede ejecutar código que NO interactúe con la interfaz ya que los
        //controles todavía no están creados. Por ejemplo:
        
        List<Integer> l = new ArrayList<>();
        
        l.add(8);
        l.add(3);
        l.add(5);
        
        l.remove(0); //eliminamos el elemento en la posición 0
        
        System.out.println("Tamaño de la lista: " + l.size());
        
    }
    @FXML
    void getOpciones (MouseEvent event){
        String opciones=(String) chbx.getSelectionModel().getSelectedItem();
        lblNombre.setText("La opcion seleccionada es: "+opciones);

    }
    @Override
    public void initialize(URL location, ResourceBundle resources)
    //location - The location used to resolve relative paths for the root object, or null if the location is not known.
    //resources - The resources used to localize the root object, or null if the root object was not localized. 
    //
    //Este método es llamado internamente justo después del constructor
    //En el constructor NO SE tiene acceso a las variables enlazadas con @FXML
    //En initialize() ya están las variables creadas y son accesibles
    {
        
        chbx.setValue("opciones");
        chbx.setItems(opciones);
        
        
        //la raíz de nuestro proyecto es donde están las carpetas 'src' y 'target'
        //Ahí existe una carpeta 'imagenes' que contiene una imagen de muestra
        image.setImage(new Image("file:.//imagenes//muestra.png"));
    }
    
}
