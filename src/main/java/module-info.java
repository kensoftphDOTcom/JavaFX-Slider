module com.kensoftph.slider {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.kensoftph.slider to javafx.fxml;
    exports com.kensoftph.slider;
}