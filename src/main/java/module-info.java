module com.example.pr12 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.pr12 to javafx.fxml;
    exports com.example.pr12;
}