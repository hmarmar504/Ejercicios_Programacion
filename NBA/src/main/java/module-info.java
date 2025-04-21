module com.mycompany.nba {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens com.mycompany.nba to javafx.fxml;
    exports com.mycompany.nba;
}
