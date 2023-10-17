package org.example.controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXCheckBox;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class UserRegForm {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private JFXPasswordField adminPasswordTxtFeild;

    @FXML
    private JFXCheckBox adminPwCheckBox;

    @FXML
    private JFXTextField adminUserNameTxtFeild;

    @FXML
    private JFXButton backBtn;

    @FXML
    private JFXCheckBox cmfermPwCheckBox;

    @FXML
    private JFXPasswordField comfirmPwTxtFeild;

    @FXML
    private JFXButton createBtn;

    @FXML
    private JFXTextField emailTxtFeild;

    @FXML
    private JFXTextField newUserNameTxtFeild;

    @FXML
    private JFXTextField otpTxtFeild;

    @FXML
    private JFXPasswordField pwTxtFeild;

    @FXML
    private JFXButton sendbtn;

    @FXML
    void backBtnOnActionListner(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/login_form.fxml"));
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
    void createBtnOnActionListner(ActionEvent event) {

    }

    @FXML
    void sendBtnOnActionListner(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert adminPasswordTxtFeild != null : "fx:id=\"adminPasswordTxtFeild\" was not injected: check your FXML file 'userRegForm.fxml'.";
        assert adminPwCheckBox != null : "fx:id=\"adminPwCheckBox\" was not injected: check your FXML file 'userRegForm.fxml'.";
        assert adminUserNameTxtFeild != null : "fx:id=\"adminUserNameTxtFeild\" was not injected: check your FXML file 'userRegForm.fxml'.";
        assert backBtn != null : "fx:id=\"backBtn\" was not injected: check your FXML file 'userRegForm.fxml'.";
        assert cmfermPwCheckBox != null : "fx:id=\"cmfermPwCheckBox\" was not injected: check your FXML file 'userRegForm.fxml'.";
        assert comfirmPwTxtFeild != null : "fx:id=\"comfirmPwTxtFeild\" was not injected: check your FXML file 'userRegForm.fxml'.";
        assert createBtn != null : "fx:id=\"createBtn\" was not injected: check your FXML file 'userRegForm.fxml'.";
        assert emailTxtFeild != null : "fx:id=\"emailTxtFeild\" was not injected: check your FXML file 'userRegForm.fxml'.";
        assert newUserNameTxtFeild != null : "fx:id=\"newUserNameTxtFeild\" was not injected: check your FXML file 'userRegForm.fxml'.";
        assert otpTxtFeild != null : "fx:id=\"otpTxtFeild\" was not injected: check your FXML file 'userRegForm.fxml'.";
        assert pwTxtFeild != null : "fx:id=\"pwTxtFeild\" was not injected: check your FXML file 'userRegForm.fxml'.";
        assert sendbtn != null : "fx:id=\"sendbtn\" was not injected: check your FXML file 'userRegForm.fxml'.";

    }


}

