module com.mycompany.libretadirecciones {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;
    requires javafx.base;
    requires javafx.graphics;
    requires jakarta.xml.bind;
    requires org.apache.pdfbox.io;
    
    opens com.mycompany.libretadirecciones to javafx.fxml;
    exports com.mycompany.libretadirecciones; 
}
