package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.net.URL;

public class WindowOneTwocontroller {
    public AnchorPane DashBoardContext02;

    public void OpenOneOne(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/WindowOneOne.fxml");
        Parent load = FXMLLoader.load(resource);
        DashBoardContext02.getChildren().clear();
        DashBoardContext02.getChildren().add(load);
    }

    public void OpenOneThree(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/WindowOneThree.fxml");
        Parent load = FXMLLoader.load(resource);
        DashBoardContext02.getChildren().clear();
        DashBoardContext02.getChildren().add(load);

    }

    public void OpenWindowTwo(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/WindowTwo.fxml");
        Parent load = FXMLLoader.load(resource);
        DashBoardContext02.getChildren().clear();
        DashBoardContext02.getChildren().add(load);
    }

    public void OpenOneFour(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/WindowOneFour.fxml");
        Parent load = FXMLLoader.load(resource);
        DashBoardContext02.getChildren().clear();
        DashBoardContext02.getChildren().add(load);
    }

    public void OpenOneFive(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/WindowOneFive.fxml");
        Parent load = FXMLLoader.load(resource);
        DashBoardContext02.getChildren().clear();
        DashBoardContext02.getChildren().add(load);
    }
}
