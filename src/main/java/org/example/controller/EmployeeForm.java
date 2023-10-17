package org.example.controller;

import com.jfoenix.controls.JFXButton;
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
import javafx.scene.control.TreeTableColumn;
import javafx.stage.Stage;


public class EmployeeForm {
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private DatePicker DobBox;

    @FXML
    private JFXButton addBtn;

    @FXML
    private TreeTableColumn<?, ?> address;

    @FXML
    private JFXButton backBtn;

    @FXML
    private JFXTextField bankAccNo;

    @FXML
    private JFXTextField bankBranch;

    @FXML
    private JFXButton clearBtn;

    @FXML
    private JFXTextField contact;

    @FXML
    private TreeTableColumn<?, ?> dob;

    @FXML
    private JFXTextField empAddress;

    @FXML
    private JFXComboBox<?> empCmbBox;

    @FXML
    private JFXTextField empName;

    @FXML
    private JFXTextField empNic;

    @FXML
    private TreeTableColumn<?, ?> emp_id;

    @FXML
    private TreeTableColumn<?, ?> name;

    @FXML
    private TreeTableColumn<?, ?> nic;

    @FXML
    private JFXButton removeBtn;

    @FXML
    private JFXTextField searchEmp;

    @FXML
    private TreeTableColumn<?, ?> title;

    @FXML
    private JFXComboBox<?> titleCmbBox;

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
        assert DobBox != null : "fx:id=\"DobBox\" was not injected: check your FXML file 'employeeForm.fxml'.";
        assert addBtn != null : "fx:id=\"addBtn\" was not injected: check your FXML file 'employeeForm.fxml'.";
        assert address != null : "fx:id=\"address\" was not injected: check your FXML file 'employeeForm.fxml'.";
        assert backBtn != null : "fx:id=\"backBtn\" was not injected: check your FXML file 'employeeForm.fxml'.";
        assert bankAccNo != null : "fx:id=\"bankAccNo\" was not injected: check your FXML file 'employeeForm.fxml'.";
        assert bankBranch != null : "fx:id=\"bankBranch\" was not injected: check your FXML file 'employeeForm.fxml'.";
        assert clearBtn != null : "fx:id=\"clearBtn\" was not injected: check your FXML file 'employeeForm.fxml'.";
        assert contact != null : "fx:id=\"contact\" was not injected: check your FXML file 'employeeForm.fxml'.";
        assert dob != null : "fx:id=\"dob\" was not injected: check your FXML file 'employeeForm.fxml'.";
        assert empAddress != null : "fx:id=\"empAddress\" was not injected: check your FXML file 'employeeForm.fxml'.";
        assert empCmbBox != null : "fx:id=\"empCmbBox\" was not injected: check your FXML file 'employeeForm.fxml'.";
        assert empName != null : "fx:id=\"empName\" was not injected: check your FXML file 'employeeForm.fxml'.";
        assert empNic != null : "fx:id=\"empNic\" was not injected: check your FXML file 'employeeForm.fxml'.";
        assert emp_id != null : "fx:id=\"emp_id\" was not injected: check your FXML file 'employeeForm.fxml'.";
        assert name != null : "fx:id=\"name\" was not injected: check your FXML file 'employeeForm.fxml'.";
        assert nic != null : "fx:id=\"nic\" was not injected: check your FXML file 'employeeForm.fxml'.";
        assert removeBtn != null : "fx:id=\"removeBtn\" was not injected: check your FXML file 'employeeForm.fxml'.";
        assert searchEmp != null : "fx:id=\"searchEmp\" was not injected: check your FXML file 'employeeForm.fxml'.";
        assert title != null : "fx:id=\"title\" was not injected: check your FXML file 'employeeForm.fxml'.";
        assert titleCmbBox != null : "fx:id=\"titleCmbBox\" was not injected: check your FXML file 'employeeForm.fxml'.";
        assert updateBtn != null : "fx:id=\"updateBtn\" was not injected: check your FXML file 'employeeForm.fxml'.";

    }

}

