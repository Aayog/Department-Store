package com.controller;

import java.net.URL;
import java.util.ResourceBundle;

import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import com.services.ErrorHandling;
import com.services.LoginValidate;

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
    		LoginValidate login = new LoginValidate();
    		if (userText.getText().isEmpty()) {
    			error.getMessage("Empty Field", "User Name cannot be empty", "E");
    		}else if(passText.getText().isEmpty()) {
    			error.getMessage("Empty Field", "Password cannot be empty", "E");
    		}else if(accountType.getSelectionModel().isEmpty()) {
    			error.getMessage("Empty Field", "Account Type cannot be empty", "E");
    		}else {
    			if(login.getLoginStatus(userText.getText().trim().toString(), passText.getText().trim().toString(), accountType.getValue().toString())) {
        			error.getMessage("Logged In", "Done", "C");
    			}else {
    				error.getMessage("Login Failed", "Your username or password is incorrect.\nMaybe you selected the wrong account type.\nTry again!!", "E");

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
