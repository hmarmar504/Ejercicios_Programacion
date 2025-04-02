module com.mycompany.proyectoenblanco {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.GUI to javafx.fxml;
    exports com.mycompany.GUI;
}
