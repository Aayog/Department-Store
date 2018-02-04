package com.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import com.jfoenix.controls.JFXButton;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Circle;

public class CashierDashboardControl implements Initializable {
	AnchorPane homeAnchor, profileAnchor,billAnchor,stockAnchor,searchAnchor;
	
    @FXML
    private Circle circleImage;
    
    @FXML
    private JFXButton homeButton;

    @FXML
    private AnchorPane changeGround;

    @FXML
    void onClickBill(ActionEvent event) {
    		changeGround.getChildren().clear();
		changeGround.getChildren().add(billAnchor);
    }

    @FXML
    void onClickHome(ActionEvent event) {
    		changeGround.getChildren().clear();
    		changeGround.getChildren().add(homeAnchor);
    }

    @FXML
    void onClickProfile(ActionEvent event) {
    		changeGround.getChildren().clear();
		changeGround.getChildren().add(profileAnchor);
    }

    @FXML
    void onClickSearch(ActionEvent event) {

    }

    @FXML
    void onClickStock(ActionEvent event) {

    }

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		try {
			homeAnchor = FXMLLoader.load(getClass().getResource("/com/fxml/Home.fxml"));
			profileAnchor = FXMLLoader.load(getClass().getResource("/com/fxml/Profile.fxml"));
			billAnchor = FXMLLoader.load(getClass().getResource("/com/fxml/Bill.fxml"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		homeButton.fire();
	}

}
