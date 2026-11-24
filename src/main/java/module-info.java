module com.mycompany.examenjava {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.examenjava to javafx.fxml;
    exports com.mycompany.examenjava;
}
