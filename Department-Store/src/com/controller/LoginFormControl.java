package com.controller;

import java.net.URL;
import java.util.ResourceBundle;

import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import com.services.ErrorHandling;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;

public class LoginFormControl implements Initializable {

    @FXML
    private JFXTextField userText;

    @FXML
    private JFXPasswordField passText;

    @FXML
    private ComboBox<String> accountType;

    @FXML
    void onClickLogin(ActionEvent event) {
    		ErrorHandling error = new ErrorHandling();
    		if (userText.getText().isEmpty()) {
    			error.getMessage("Empty Field", "User Name cannot be empty", "E");
    		}else if(passText.getText().isEmpty()) {
    			error.getMessage("Empty Field", "Password cannot be empty", "E");
    		}else if(accountType.getSelectionModel().isEmpty()) {
    			error.getMessage("Empty Field", "Account Type cannot be empty", "E");
    		}else {
    			if(true) {
        			error.getMessage("Empty Field", "Done", "C");
    			}
    		}
    }

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		accountType.getItems().clear();
		ObservableList<String> list = FXCollections.observableArrayList("ADMIN","CASHIER");
		accountType.getItems().addAll(list);
		accountType.setPromptText("Account Type");
	}
    

}
