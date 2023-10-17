package org.example.controller;

import com.jfoenix.controls.JFXButton;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class LoginFormController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private JFXButton adminBtn;

    @FXML
    private JFXButton empBtn;

    @FXML
    void adminBtnOnActionListner(ActionEvent event) {
       try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/adminLoginForm.fxml"));
            Parent root = loader.load();

            Stage stage = new Stage();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();

            // Close the current window (Dashboard)
            ((Stage) adminBtn.getScene().getWindow()).close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void empBtnOnActionListner(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert adminBtn != null : "fx:id=\"adminBtn\" was not injected: check your FXML file 'login_form.fxml'.";
        assert empBtn != null : "fx:id=\"empBtn\" was not injected: check your FXML file 'login_form.fxml'.";

    }

}
