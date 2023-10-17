package org.example.controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TreeTableColumn;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class SalesReturn {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TreeTableColumn<?, ?> amount;

    @FXML
    private JFXButton backBtn;

    @FXML
    private JFXButton clearBtn;

    @FXML
    private TreeTableColumn<?, ?> date;

    @FXML
    private TreeTableColumn<?, ?> description;

    @FXML
    private TreeTableColumn<?, ?> discount;

    @FXML
    private TreeTableColumn<?, ?> itemCode;

    @FXML
    private Text orderIdLbl;

    @FXML
    private JFXButton placeOrderBtn;

    @FXML
    private TreeTableColumn<?, ?> qty;

    @FXML
    private JFXTextField qtyTxtFEild;

    @FXML
    private JFXButton saveBtn;

    @FXML
    private TreeTableColumn<?, ?> size;

    @FXML
    private Text totLbl;

    @FXML
    private TreeTableColumn<?, ?> tytpe;

    @FXML
    private TreeTableColumn<?, ?> unitPrice;

    @FXML
    void backBtnOnActionListner(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/dashboard.fxml"));
            Parent root = loader.load();

            Stage stage = new Stage();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();

            // Close the current window (Dashboard)
            ((Stage) backBtn.getScene().getWindow()).close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void clearBtnOnActionListner(ActionEvent event) {

    }

    @FXML
    void placeOrderBtnOnActionListner(ActionEvent event) {

    }

    @FXML
    void saveBtnOnActionListner(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert amount != null : "fx:id=\"amount\" was not injected: check your FXML file 'salesReturn.fxml'.";
        assert backBtn != null : "fx:id=\"backBtn\" was not injected: check your FXML file 'salesReturn.fxml'.";
        assert clearBtn != null : "fx:id=\"clearBtn\" was not injected: check your FXML file 'salesReturn.fxml'.";
        assert date != null : "fx:id=\"date\" was not injected: check your FXML file 'salesReturn.fxml'.";
        assert description != null : "fx:id=\"description\" was not injected: check your FXML file 'salesReturn.fxml'.";
        assert discount != null : "fx:id=\"discount\" was not injected: check your FXML file 'salesReturn.fxml'.";
        assert itemCode != null : "fx:id=\"itemCode\" was not injected: check your FXML file 'salesReturn.fxml'.";
        assert orderIdLbl != null : "fx:id=\"orderIdLbl\" was not injected: check your FXML file 'salesReturn.fxml'.";
        assert placeOrderBtn != null : "fx:id=\"placeOrderBtn\" was not injected: check your FXML file 'salesReturn.fxml'.";
        assert qty != null : "fx:id=\"qty\" was not injected: check your FXML file 'salesReturn.fxml'.";
        assert qtyTxtFEild != null : "fx:id=\"qtyTxtFEild\" was not injected: check your FXML file 'salesReturn.fxml'.";
        assert saveBtn != null : "fx:id=\"saveBtn\" was not injected: check your FXML file 'salesReturn.fxml'.";
        assert size != null : "fx:id=\"size\" was not injected: check your FXML file 'salesReturn.fxml'.";
        assert totLbl != null : "fx:id=\"totLbl\" was not injected: check your FXML file 'salesReturn.fxml'.";
        assert tytpe != null : "fx:id=\"tytpe\" was not injected: check your FXML file 'salesReturn.fxml'.";
        assert unitPrice != null : "fx:id=\"unitPrice\" was not injected: check your FXML file 'salesReturn.fxml'.";

    }

}
