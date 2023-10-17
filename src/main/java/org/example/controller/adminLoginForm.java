package org.example.controller;

import com.jfoenix.controls.JFXButton;
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
import javafx.scene.control.Hyperlink;
import javafx.stage.Stage;

public class adminLoginForm {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Hyperlink createaccTxtFeild;

    @FXML
    private JFXButton exitBtn;

    @FXML
    private Hyperlink forgetPwTxtFeild;

    @FXML
    private JFXButton loginBtn;

    @FXML
    private JFXPasswordField passwordTxtFeild;

    @FXML
    private JFXTextField userNameTxtFeild;

    @FXML
    void createaccTxtFeildOnActionListner(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/userRegForm.fxml"));
            Parent root = loader.load();

            Stage stage = new Stage();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();

            // Close the current window (Dashboard)
            ((Stage) createaccTxtFeild.getScene().getWindow()).close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void exitBtnOnActionListner(ActionEvent event) {
  try{
      FXMLLoader lorder=new FXMLLoader(getClass().getResource("/view/login_form.fxml"));
      Parent root=lorder.load();
      Stage stage=new Stage();
      Scene scene=new Scene(root);
      stage.setScene(scene);
      stage.show();

      ((Stage)exitBtn.getScene().getWindow()).close();

  }catch (IOException e){
      e.printStackTrace();
  }



    }

    @FXML
    void forgetPwTxtFeildOnActionListner(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/forgetPassword.fxml"));
            Parent root = loader.load();

            Stage stage = new Stage();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();

            // Close the current window (Dashboard)
            ((Stage) forgetPwTxtFeild.getScene().getWindow()).close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void loginBtnOnActionListner(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/dashboard.fxml"));
            Parent root = loader.load();

            Stage stage = new Stage();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();

            // Close the current window (Dashboard)
            ((Stage) forgetPwTxtFeild.getScene().getWindow()).close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void initialize() {
        assert createaccTxtFeild != null : "fx:id=\"createaccTxtFeild\" was not injected: check your FXML file 'adminLoginForm.fxml'.";
        assert exitBtn != null : "fx:id=\"exitBtn\" was not injected: check your FXML file 'adminLoginForm.fxml'.";
        assert forgetPwTxtFeild != null : "fx:id=\"forgetPwTxtFeild\" was not injected: check your FXML file 'adminLoginForm.fxml'.";
        assert loginBtn != null : "fx:id=\"loginBtn\" was not injected: check your FXML file 'adminLoginForm.fxml'.";
        assert passwordTxtFeild != null : "fx:id=\"passwordTxtFeild\" was not injected: check your FXML file 'adminLoginForm.fxml'.";
        assert userNameTxtFeild != null : "fx:id=\"userNameTxtFeild\" was not injected: check your FXML file 'adminLoginForm.fxml'.";

    }

}
