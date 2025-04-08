module com.mycompany.libretadirecciones {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;
    requires javafx.base;
    requires javafx.graphics;
    requires jakarta.xml.bind;
    requires org.apache.pdfbox;
    
    opens com.mycompany.libretadirecciones to javafx.fxml, jakarta.xml.bind;
    exports com.mycompany.libretadirecciones; 
    
}
