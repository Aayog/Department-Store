package com.controller;

import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;

public class BillControl {

    @FXML
    private AnchorPane changeGround;

    @FXML
    private TextField barcodeText;

    @FXML
    private TextField productIDText;

    @FXML
    private TextField productNameText;

    @FXML
    private TextField qtyText;

    @FXML
    private TextField supplierText;

    @FXML
    private TextField rateText;

    @FXML
    private TextField dateText;

    @FXML
    private Text billNo;

    @FXML
    private TableView<?> billTable;

    @FXML
    private TableColumn<?, ?> snCol;

    @FXML
    private TableColumn<?, ?> pIdCol;

    @FXML
    private TableColumn<?, ?> pNameCol;

    @FXML
    private TableColumn<?, ?> rateCol;

    @FXML
    private TableColumn<?, ?> qtyCol;

    @FXML
    private TableColumn<?, ?> amountCol;

    @FXML
    private TextField subTotal;

    @FXML
    private TextField discount;

    @FXML
    private TextField tax;

    @FXML
    private TextField grandTotal;

    @FXML
    void onClickProfile(MouseEvent event) {

    }

}
