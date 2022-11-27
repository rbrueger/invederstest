module com.example.invenders {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.invenders to javafx.fxml;
    exports com.example.invenders;
}