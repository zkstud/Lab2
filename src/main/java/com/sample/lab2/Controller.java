package com.sample.lab2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {
    public Button btnMain;
    int clickCounter = 0;
    public TextField txtLicznik, txtLicznikRe;

    public void onBtnAction(ActionEvent actionEvent) {
        txtLicznikRe.setText(" ");
        txtLicznik.setText("Klikniecie nr: " + ++clickCounter);
        if (clickCounter == 1 || clickCounter == 5) {
            txtLicznikRe.setText("I jeszcze raz!");
        }
    }
}