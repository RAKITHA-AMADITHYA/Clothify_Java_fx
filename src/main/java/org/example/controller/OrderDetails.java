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
import javafx.stage.Stage;

public class OrderDetails {
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TreeTableColumn<?, ?> amount;

    @FXML
    private TreeTableColumn<?, ?> arreas;

    @FXML
    private JFXButton backBtn;

    @FXML
    private TreeTableColumn<?, ?> contact;

    @FXML
    private TreeTableColumn<?, ?> cusName;

    @FXML
    private TreeTableColumn<?, ?> date;

    @FXML
    private TreeTableColumn<?, ?> description;

    @FXML
    private TreeTableColumn<?, ?> discount;

    @FXML
    private TreeTableColumn<?, ?> email;

    @FXML
    private TreeTableColumn<?, ?> employee;

    @FXML
    private TreeTableColumn<?, ?> itemCode;

    @FXML
    private TreeTableColumn<?, ?> orderDate;

    @FXML
    private JFXTextField orderSearchTxtFeild;

    @FXML
    private TreeTableColumn<?, ?> order_id;

    @FXML
    private TreeTableColumn<?, ?> qty;

    @FXML
    private JFXButton refreshBtn;

    @FXML
    private JFXButton searchBtn;

    @FXML
    private TreeTableColumn<?, ?> size;

    @FXML
    private TreeTableColumn<?, ?> total;

    @FXML
    private TreeTableColumn<?, ?> type;

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
    void refreshBtnOnActionListner(ActionEvent event) {

    }

    @FXML
    void searchBtnOnActionListner(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert amount != null : "fx:id=\"amount\" was not injected: check your FXML file 'orderDetails.fxml'.";
        assert arreas != null : "fx:id=\"arreas\" was not injected: check your FXML file 'orderDetails.fxml'.";
        assert backBtn != null : "fx:id=\"backBtn\" was not injected: check your FXML file 'orderDetails.fxml'.";
        assert contact != null : "fx:id=\"contact\" was not injected: check your FXML file 'orderDetails.fxml'.";
        assert cusName != null : "fx:id=\"cusName\" was not injected: check your FXML file 'orderDetails.fxml'.";
        assert date != null : "fx:id=\"date\" was not injected: check your FXML file 'orderDetails.fxml'.";
        assert description != null : "fx:id=\"description\" was not injected: check your FXML file 'orderDetails.fxml'.";
        assert discount != null : "fx:id=\"discount\" was not injected: check your FXML file 'orderDetails.fxml'.";
        assert email != null : "fx:id=\"email\" was not injected: check your FXML file 'orderDetails.fxml'.";
        assert employee != null : "fx:id=\"employee\" was not injected: check your FXML file 'orderDetails.fxml'.";
        assert itemCode != null : "fx:id=\"itemCode\" was not injected: check your FXML file 'orderDetails.fxml'.";
        assert orderDate != null : "fx:id=\"orderDate\" was not injected: check your FXML file 'orderDetails.fxml'.";
        assert orderSearchTxtFeild != null : "fx:id=\"orderSearchTxtFeild\" was not injected: check your FXML file 'orderDetails.fxml'.";
        assert order_id != null : "fx:id=\"order_id\" was not injected: check your FXML file 'orderDetails.fxml'.";
        assert qty != null : "fx:id=\"qty\" was not injected: check your FXML file 'orderDetails.fxml'.";
        assert refreshBtn != null : "fx:id=\"refreshBtn\" was not injected: check your FXML file 'orderDetails.fxml'.";
        assert searchBtn != null : "fx:id=\"searchBtn\" was not injected: check your FXML file 'orderDetails.fxml'.";
        assert size != null : "fx:id=\"size\" was not injected: check your FXML file 'orderDetails.fxml'.";
        assert total != null : "fx:id=\"total\" was not injected: check your FXML file 'orderDetails.fxml'.";
        assert type != null : "fx:id=\"type\" was not injected: check your FXML file 'orderDetails.fxml'.";

    }

}
