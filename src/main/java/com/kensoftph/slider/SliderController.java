package com.kensoftph.slider;

import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;

import java.net.URL;
import java.util.ResourceBundle;

public class SliderController implements Initializable {

    @FXML
    private Slider slider;

    @FXML
    private Label temp;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        slider.valueProperty().addListener((ObservableValue<? extends Number> num, Number oldVal, Number newVal)->{
            float value = Float.parseFloat(String.format("%.1f",newVal));

            if(value <= 37.2){
                temp.setText("Body Temperature: "+value+"\n"+"Normal Body Temperature");
            }else if(value >= 37.3){
                temp.setText("Body Temperature: "+value+"\n"+"You have a fever");
            }
        });
    }
}