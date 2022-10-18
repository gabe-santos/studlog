module com.ex {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.ex to javafx.fxml;
    exports com.ex;
}
