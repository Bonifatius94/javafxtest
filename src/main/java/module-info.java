module de.mtswe.javafxtest {
    requires javafx.controls;
    requires javafx.fxml;

    opens de.mtswe.javafxtest to javafx.fxml;
    opens de.mtswe.javafxtest.main to javafx.fxml;
    exports de.mtswe.javafxtest;
}