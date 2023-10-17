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
import javafx.scene.chart.BubbleChart;
import javafx.stage.Stage;

public class SalseReport {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private JFXButton annualReportBtn;

    @FXML
    private JFXButton backBtn;

    @FXML
    private BubbleChart<?, ?> chart;

    @FXML
    private JFXButton dailyReportrBtn;

    @FXML
    private JFXButton dailyReturnsBtn;

    @FXML
    private JFXButton monthlyReportrBtn;

    @FXML
    void annualReportBtnOnActionListner(ActionEvent event) {

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
    void dailyReportrBtnOnActionListner(ActionEvent event) {

    }

    @FXML
    void dailyReturnsBtnOnActionListner(ActionEvent event) {

    }

    @FXML
    void monthlyReportrBtnOnActionListner(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert annualReportBtn != null : "fx:id=\"annualReportBtn\" was not injected: check your FXML file 'salseReport.fxml'.";
        assert backBtn != null : "fx:id=\"backBtn\" was not injected: check your FXML file 'salseReport.fxml'.";
        assert chart != null : "fx:id=\"chart\" was not injected: check your FXML file 'salseReport.fxml'.";
        assert dailyReportrBtn != null : "fx:id=\"dailyReportrBtn\" was not injected: check your FXML file 'salseReport.fxml'.";
        assert dailyReturnsBtn != null : "fx:id=\"dailyReturnsBtn\" was not injected: check your FXML file 'salseReport.fxml'.";
        assert monthlyReportrBtn != null : "fx:id=\"monthlyReportrBtn\" was not injected: check your FXML file 'salseReport.fxml'.";

    }

}
