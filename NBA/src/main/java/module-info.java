module com.mycompany.nba {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;
    requires java.sql;
    requires jakarta.xml.bind;

    opens com.mycompany.nba to javafx.fxml, jakarta.xml.bind;
    exports com.mycompany.nba;
}
