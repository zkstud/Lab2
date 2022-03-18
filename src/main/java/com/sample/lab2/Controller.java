package com.sample.lab2;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

import java.util.List;

public class Controller {
    public AnchorPane ap, dodajKontoAP, przegladKontAP;
    public TabPane tabPane;
    public Tab dodajKonto, przegladKont;
    public ImageView logoApp;
    public TextField logField, wwwField, opisField;
    public PasswordField pasField;
    public Button enterBtn, copyBtn, insertBtn, deleteBtn;
    public Label ifEmptyLabel;
    public TableColumn logColumn, pasColumn, wwwColumn, opisColumn;
    public TableView daneTableView;

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
        if (iSEmpty()) {
            ifEmptyLabel.setText("Pole: \"E-mail\" lub \"Strona WWW\" lub \"Hasło\" jest puste!");
            return;
        }

    }
}