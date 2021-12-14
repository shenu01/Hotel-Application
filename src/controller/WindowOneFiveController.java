package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.net.URL;

public class WindowOneFiveController {
    public AnchorPane DashBoardContext05;

    public void OpenWindowTwo(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/WindowTwo.fxml");
        Parent load = FXMLLoader.load(resource);
        DashBoardContext05.getChildren().clear();
        DashBoardContext05.getChildren().add(load);
    }





    public void OpenOneThree(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/WindowOneThree.fxml");
        Parent load = FXMLLoader.load(resource);
        DashBoardContext05.getChildren().clear();
        DashBoardContext05.getChildren().add(load);
    }

    public void Delete(ActionEvent actionEvent) {
        new Alert(Alert.AlertType.CONFIRMATION," Guest Delete has been  successfully", ButtonType.CLOSE).show();
    }
}
