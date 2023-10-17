package org.example.controller;


import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXTextField;
import com.jfoenix.controls.JFXTreeTableView;

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


public class Item {
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TreeTableColumn<?, ?> BuyingPriceColumn;

    @FXML
    private JFXButton addBtn;

    @FXML
    private JFXComboBox<?> addQtymbox;

    @FXML
    private JFXButton backBtn;

    @FXML
    private JFXTextField buyingPriceTxtFeild;

    @FXML
    private JFXButton clearBtn;

    @FXML
    private TreeTableColumn<?, ?> desColum;

    @FXML
    private JFXTextField descriptionTxtFeild;

    @FXML
    private TreeTableColumn<?, ?> itemCodeClum;

    @FXML
    private JFXComboBox<?> itemCodeCmbBox;

    @FXML
    private JFXTreeTableView<?> itemTbl;

    @FXML
    private TreeTableColumn<?, ?> profitColunm;

    @FXML
    private JFXTextField profitTxtFeild;

    @FXML
    private JFXComboBox<?> qtyCmbBox;

    @FXML
    private TreeTableColumn<?, ?> qtyColunm;

    @FXML
    private JFXButton saveBtn;

    @FXML
    private TreeTableColumn<?, ?> selligPriceColunm;

    @FXML
    private JFXTextField sellingPriceTxtFeild;

    @FXML
    private JFXComboBox<?> sizeCmbBox;

    @FXML
    private TreeTableColumn<?, ?> sizeColunm;

    @FXML
    private JFXComboBox<?> supplierIdCmbBox;

    @FXML
    private JFXComboBox<?> typeCmbBox;

    @FXML
    private TreeTableColumn<?, ?> typeColunm;

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
    void saveBtnOnActionListner(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert BuyingPriceColumn != null : "fx:id=\"BuyingPriceColumn\" was not injected: check your FXML file 'item.fxml'.";
        assert addBtn != null : "fx:id=\"addBtn\" was not injected: check your FXML file 'item.fxml'.";
        assert addQtymbox != null : "fx:id=\"addQtymbox\" was not injected: check your FXML file 'item.fxml'.";
        assert backBtn != null : "fx:id=\"backBtn\" was not injected: check your FXML file 'item.fxml'.";
        assert buyingPriceTxtFeild != null : "fx:id=\"buyingPriceTxtFeild\" was not injected: check your FXML file 'item.fxml'.";
        assert clearBtn != null : "fx:id=\"clearBtn\" was not injected: check your FXML file 'item.fxml'.";
        assert desColum != null : "fx:id=\"desColum\" was not injected: check your FXML file 'item.fxml'.";
        assert descriptionTxtFeild != null : "fx:id=\"descriptionTxtFeild\" was not injected: check your FXML file 'item.fxml'.";
        assert itemCodeClum != null : "fx:id=\"itemCodeClum\" was not injected: check your FXML file 'item.fxml'.";
        assert itemCodeCmbBox != null : "fx:id=\"itemCodeCmbBox\" was not injected: check your FXML file 'item.fxml'.";
        assert itemTbl != null : "fx:id=\"itemTbl\" was not injected: check your FXML file 'item.fxml'.";
        assert profitColunm != null : "fx:id=\"profitColunm\" was not injected: check your FXML file 'item.fxml'.";
        assert profitTxtFeild != null : "fx:id=\"profitTxtFeild\" was not injected: check your FXML file 'item.fxml'.";
        assert qtyCmbBox != null : "fx:id=\"qtyCmbBox\" was not injected: check your FXML file 'item.fxml'.";
        assert qtyColunm != null : "fx:id=\"qtyColunm\" was not injected: check your FXML file 'item.fxml'.";
        assert saveBtn != null : "fx:id=\"saveBtn\" was not injected: check your FXML file 'item.fxml'.";
        assert selligPriceColunm != null : "fx:id=\"selligPriceColunm\" was not injected: check your FXML file 'item.fxml'.";
        assert sellingPriceTxtFeild != null : "fx:id=\"sellingPriceTxtFeild\" was not injected: check your FXML file 'item.fxml'.";
        assert sizeCmbBox != null : "fx:id=\"sizeCmbBox\" was not injected: check your FXML file 'item.fxml'.";
        assert sizeColunm != null : "fx:id=\"sizeColunm\" was not injected: check your FXML file 'item.fxml'.";
        assert supplierIdCmbBox != null : "fx:id=\"supplierIdCmbBox\" was not injected: check your FXML file 'item.fxml'.";
        assert typeCmbBox != null : "fx:id=\"typeCmbBox\" was not injected: check your FXML file 'item.fxml'.";
        assert typeColunm != null : "fx:id=\"typeColunm\" was not injected: check your FXML file 'item.fxml'.";

    }

}
