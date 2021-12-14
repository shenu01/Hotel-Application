package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.net.URL;

public class WindowOneThreeController {
    public AnchorPane DashBoardContext03;

    public void OpenOneOne(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/WindowOneOne.fxml");
        Parent load = FXMLLoader.load(resource);
        DashBoardContext03.getChildren().clear();
        DashBoardContext03.getChildren().add(load);
    }

    public void OpenWindowTwo(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/WindowTwo.fxml");
        Parent load = FXMLLoader.load(resource);
        DashBoardContext03.getChildren().clear();
        DashBoardContext03.getChildren().add(load);
    }

    public void OpenOneFour(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/WindowOneFour.fxml");
        Parent load = FXMLLoader.load(resource);
        DashBoardContext03.getChildren().clear();
        DashBoardContext03.getChildren().add(load);
    }

    public void OpenOneFive(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/WindowOneFive.fxml");
        Parent load = FXMLLoader.load(resource);
        DashBoardContext03.getChildren().clear();
        DashBoardContext03.getChildren().add(load);
    }

    public void OpenOneTwo(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/WindowOneTwo.fxml");
        Parent load = FXMLLoader.load(resource);
        DashBoardContext03.getChildren().clear();
        DashBoardContext03.getChildren().add(load);
    }

    public void Submit(ActionEvent actionEvent) {
        new Alert(Alert.AlertType.CONFIRMATION,"Customer has been added successfully", ButtonType.CLOSE).show();
    }
}
