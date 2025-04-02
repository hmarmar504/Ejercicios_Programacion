module com.mycompany.libretadirecciones {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;
    requires javafx.base;
    requires javafx.graphics;

    opens com.mycompany.libretadirecciones to javafx.fxml;
    exports com.mycompany.libretadirecciones;
}
