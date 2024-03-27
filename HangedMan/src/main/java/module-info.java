module com.example.hangedman {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.hangedman to javafx.fxml;
    exports com.example.hangedman;
}