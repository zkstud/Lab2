package com.sample.lab2;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    private Button enterButton;

    @FXML
    private TableColumn<Account, String> notesColumn;

    @FXML
    private TextField notesField;

    @FXML
    private TableColumn<Account, String> passwordColumn;

    @FXML
    private PasswordField passwordField;

    @FXML
    private TableView<Account> tableView;

    @FXML
    private TableColumn<Account, String> titleColumn;

    @FXML
    private TextField titleField;

    @FXML
    private TableColumn<Account, String> urlColumn;

    @FXML
    private TextField urlField;

    @FXML
    private TableColumn<Account, String> usernameColumn;

    @FXML
    private TextField usernameField;

    @FXML
    private Label fieldEmptyLabel;


    public boolean notEmpty() {
        if (titleField.getText().isEmpty()) return false;
        if (usernameField.getText().isEmpty()) return false;
        if (passwordField.getText().isEmpty()) return false;
        if (urlField.getText().isEmpty()) return false;
        if (notesField.getText().isEmpty()) return false;
        return true;
    }

    @FXML
    void enterButtonOnAction(ActionEvent event) {
        if (!notEmpty()) {
            fieldEmptyLabel.setText("Warning: one or more field are empty!");
            return;
        }
            fieldEmptyLabel.setVisible(false);
            Account acc = new Account(titleField.getText(), usernameField.getText(),
                    passwordField.getText(), urlField.getText(), notesField.getText());
            ObservableList<Account> accounts = tableView.getItems();
            accounts.add(acc);
            tableView.setItems(accounts);
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        titleColumn.setCellValueFactory(new PropertyValueFactory<Account, String>("title"));
        usernameColumn.setCellValueFactory(new PropertyValueFactory<Account, String>("username"));
        passwordColumn.setCellValueFactory(new PropertyValueFactory<Account, String>("password"));
        urlColumn.setCellValueFactory(new PropertyValueFactory<Account, String>("url"));
        notesColumn.setCellValueFactory(new PropertyValueFactory<Account, String>("notes"));
    }
}
