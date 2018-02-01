package com.services;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class ErrorHandling {

	public void getMessage(String title, String message, String type) {
		Alert alert = new Alert(null);
		AlertType alertType = AlertType.NONE;
		if(type.equals("E")) {
			alertType = AlertType.ERROR;
		}else if(type.equals("I")) {
			alertType = AlertType.INFORMATION;
		}else if(type.equals("W")) {
			alertType = AlertType.WARNING;
		}else if(type.equals("C")) {
			alertType = AlertType.CONFIRMATION;
		}
		alert.setAlertType(alertType);
		alert.setTitle(title);
		alert.setContentText(message);
		alert.showAndWait();
	}
}
