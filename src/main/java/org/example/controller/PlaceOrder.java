package org.example.controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXCheckBox;
import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXTextField;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Spinner;
import javafx.stage.Stage;

public class PlaceOrder {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private JFXButton addBtn;

    @FXML
    private JFXButton backBtn;

    @FXML
    private JFXTextField balanceTxtFeild;

    @FXML
    private JFXCheckBox cardCheckBox;

    @FXML
    private JFXCheckBox cashCheckBox;

    @FXML
    private JFXTextField cashRecievedTxtFeild;

    @FXML
    private JFXButton clearBtn;

    @FXML
    private JFXTextField cusContactTxtFeild;

    @FXML
    private JFXTextField cusEmailTxtFeild;

    @FXML
    private JFXTextField cusNAme;

    @FXML
    private DatePicker dateTxtFeild;

    @FXML
    private JFXTextField descriptionTxtFeild;

    @FXML
    private JFXTextField discountTxtFeild;

    @FXML
    private JFXComboBox<?> empCmbBox;

    @FXML
    private JFXTextField empName;

    @FXML
    private JFXComboBox<?> itemCodeCmbBox;

    @FXML
    private JFXTextField orderIdTxtBox;

    @FXML
    private Spinner<?> qtySpinner;

    @FXML
    private JFXButton removeBtn;

    @FXML
    private JFXComboBox<?> sizeCmbBox;

    @FXML
    private JFXTextField totTxtFeild;

    @FXML
    private JFXComboBox<?> typeCmbBox;

    @FXML
    private JFXButton updateBtn;

    @FXML
    void addBtnOnActionListner(ActionEvent event) {

    }

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
    void removeBtnOnActionListner(ActionEvent event) {

    }

    @FXML
    void updateBtnOnActionListner(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert addBtn != null : "fx:id=\"addBtn\" was not injected: check your FXML file 'order.fxml'.";
        assert backBtn != null : "fx:id=\"backBtn\" was not injected: check your FXML file 'order.fxml'.";
        assert balanceTxtFeild != null : "fx:id=\"balanceTxtFeild\" was not injected: check your FXML file 'order.fxml'.";
        assert cardCheckBox != null : "fx:id=\"cardCheckBox\" was not injected: check your FXML file 'order.fxml'.";
        assert cashCheckBox != null : "fx:id=\"cashCheckBox\" was not injected: check your FXML file 'order.fxml'.";
        assert cashRecievedTxtFeild != null : "fx:id=\"cashRecievedTxtFeild\" was not injected: check your FXML file 'order.fxml'.";
        assert clearBtn != null : "fx:id=\"clearBtn\" was not injected: check your FXML file 'order.fxml'.";
        assert cusContactTxtFeild != null : "fx:id=\"cusContactTxtFeild\" was not injected: check your FXML file 'order.fxml'.";
        assert cusEmailTxtFeild != null : "fx:id=\"cusEmailTxtFeild\" was not injected: check your FXML file 'order.fxml'.";
        assert cusNAme != null : "fx:id=\"cusNAme\" was not injected: check your FXML file 'order.fxml'.";
        assert dateTxtFeild != null : "fx:id=\"dateTxtFeild\" was not injected: check your FXML file 'order.fxml'.";
        assert descriptionTxtFeild != null : "fx:id=\"descriptionTxtFeild\" was not injected: check your FXML file 'order.fxml'.";
        assert discountTxtFeild != null : "fx:id=\"discountTxtFeild\" was not injected: check your FXML file 'order.fxml'.";
        assert empCmbBox != null : "fx:id=\"empCmbBox\" was not injected: check your FXML file 'order.fxml'.";
        assert empName != null : "fx:id=\"empName\" was not injected: check your FXML file 'order.fxml'.";
        assert itemCodeCmbBox != null : "fx:id=\"itemCodeCmbBox\" was not injected: check your FXML file 'order.fxml'.";
        assert orderIdTxtBox != null : "fx:id=\"orderIdTxtBox\" was not injected: check your FXML file 'order.fxml'.";
        assert qtySpinner != null : "fx:id=\"qtySpinner\" was not injected: check your FXML file 'order.fxml'.";
        assert removeBtn != null : "fx:id=\"removeBtn\" was not injected: check your FXML file 'order.fxml'.";
        assert sizeCmbBox != null : "fx:id=\"sizeCmbBox\" was not injected: check your FXML file 'order.fxml'.";
        assert totTxtFeild != null : "fx:id=\"totTxtFeild\" was not injected: check your FXML file 'order.fxml'.";
        assert typeCmbBox != null : "fx:id=\"typeCmbBox\" was not injected: check your FXML file 'order.fxml'.";
        assert updateBtn != null : "fx:id=\"updateBtn\" was not injected: check your FXML file 'order.fxml'.";

    }

}
