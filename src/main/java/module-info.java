module com.sample.lab2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.sample.lab2 to javafx.fxml;
    exports com.sample.lab2;
}