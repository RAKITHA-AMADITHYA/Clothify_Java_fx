package org.example.controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXTextField;

import java.io.IOException;
import java.net.URL;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;

import crudUtil.CrudUtil;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.TreeTableColumn;
import javafx.stage.Stage;



public class Suppliers implements Initializable {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private JFXTextField SearchTxtFeild;

    @FXML
    private JFXButton backBtn;

    @FXML
    private JFXButton clearBtn;

    @FXML
    private JFXTextField company;

    @FXML
    private TreeTableColumn<?, ?> companyColunm;

    @FXML
    private JFXTextField contact;

    @FXML
    private TreeTableColumn<?, ?> contactColunm;

    @FXML
    private JFXButton deleteBtn;

    @FXML
    private JFXTextField email;

    @FXML
    private TreeTableColumn<?, ?> name;

    @FXML
    private TreeTableColumn<?, ?> nic1;

    @FXML
    private JFXTextField lblSuppId;

    @FXML
    private JFXButton printBtn;

    @FXML
    private JFXButton saveBtn;

    @FXML
    private JFXTextField suppName;

    @FXML
    private TreeTableColumn<?, ?> supp_id;



    @FXML
    private TreeTableColumn<?, ?> title;

    @FXML
    private JFXComboBox<?> typeCmbBox;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        generateId();
    }
private void generateId(){
    ResultSet resultSet= null;
    try {
        resultSet = CrudUtil.execute(
                "SELECT supplier_id FROM suppliers  ORDER BY supplier_id DESC LIMIT 1"
        );


        if (resultSet.next()) {
          int supId=Integer.parseInt(resultSet.getString(1).split("[C]")[1]);
          supId++;
          lblSuppId.setText(String.format("S%03d",supId));
        }else {
            lblSuppId.setText("S001");
        }

    } catch (SQLException e) {
        throw new RuntimeException(e);
    } catch (ClassNotFoundException e) {
        throw new RuntimeException(e);
    }

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
    void deleteBtnOnActionListner(ActionEvent event) {

    }

    @FXML
    void printBtnOnActionListner(ActionEvent event) {

    }

    @FXML
    void saveBtnOnActionListner(ActionEvent event) {


    }

    @FXML
    void initialize() {
        assert SearchTxtFeild != null : "fx:id=\"SearchTxtFeild\" was not injected: check your FXML file 'suppliers.fxml'.";
        assert backBtn != null : "fx:id=\"backBtn\" was not injected: check your FXML file 'suppliers.fxml'.";
        assert clearBtn != null : "fx:id=\"clearBtn\" was not injected: check your FXML file 'suppliers.fxml'.";
        assert company != null : "fx:id=\"company\" was not injected: check your FXML file 'suppliers.fxml'.";
        assert companyColunm != null : "fx:id=\"companyColunm\" was not injected: check your FXML file 'suppliers.fxml'.";
        assert contact != null : "fx:id=\"contact\" was not injected: check your FXML file 'suppliers.fxml'.";
        assert contactColunm != null : "fx:id=\"contactColunm\" was not injected: check your FXML file 'suppliers.fxml'.";
        assert deleteBtn != null : "fx:id=\"deleteBtn\" was not injected: check your FXML file 'suppliers.fxml'.";
        assert email != null : "fx:id=\"email\" was not injected: check your FXML file 'suppliers.fxml'.";
        assert name != null : "fx:id=\"name\" was not injected: check your FXML file 'suppliers.fxml'.";
        assert nic1 != null : "fx:id=\"nic1\" was not injected: check your FXML file 'suppliers.fxml'.";
        assert printBtn != null : "fx:id=\"printBtn\" was not injected: check your FXML file 'suppliers.fxml'.";
        assert saveBtn != null : "fx:id=\"saveBtn\" was not injected: check your FXML file 'suppliers.fxml'.";
        assert suppName != null : "fx:id=\"suppName\" was not injected: check your FXML file 'suppliers.fxml'.";
        assert supp_id != null : "fx:id=\"supp_id\" was not injected: check your FXML file 'suppliers.fxml'.";
       // assert suppilierIdCmbBox != null : "fx:id=\"suppilierIdCmbBox\" was not injected: check your FXML file 'suppliers.fxml'.";
        assert title != null : "fx:id=\"title\" was not injected: check your FXML file 'suppliers.fxml'.";
        assert typeCmbBox != null : "fx:id=\"typeCmbBox\" was not injected: check your FXML file 'suppliers.fxml'.";
        assert lblSuppId != null : "fx:id=\"lblSuppId\" was not injected: check your FXML file 'suppliers.fxml'.";
    }


}
