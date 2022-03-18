package com.sample.lab2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

public class Controller {
    public AnchorPane ap, dodajKontoAP, przegladKontAP;
    public TabPane tabPane;
    public Tab dodajKonto, przegladKont;
    public ImageView logoApp;
    public TextField logField, wwwField, opisField;
    public PasswordField pasField;
    public Button enterBtn;
    public String sLogField, sWwwField, sOpisField, sPasField;
    public Label ifEmptyLabel;

    private boolean iSEmpty() {
        if (logField.toString().isEmpty()) {
            return false;
        }
        if (wwwField.toString().isEmpty()) {
            return false;
        }
        if (pasField.toString().isEmpty()) {
            return false;
        }
        return true;
    }

    public void EnterBtnOnAction(ActionEvent actionEvent) {
        if (iSEmpty()){
            ifEmptyLabel.setText("Pole: \"E-mail\" lub \"Strona WWW\" lub \"Hasło\" jest puste!");
            return;
        }
        ifEmptyLabel.setText(" ");
        sLogField = logField.toString();
        sWwwField = wwwField.toString();
        sOpisField = opisField.toString();
        sPasField = pasField.toString();
    }
}