package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.net.URL;

public class WindowOneFourController {
    public AnchorPane DashBoardContext04;

    public void OpenWindowTwo(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/WindowTwo.fxml");
        Parent load = FXMLLoader.load(resource);
        DashBoardContext04.getChildren().clear();
        DashBoardContext04.getChildren().add(load);
    }

    public void OpenOneThree(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/WindowOneThree.fxml");
        Parent load = FXMLLoader.load(resource);
        DashBoardContext04.getChildren().clear();
        DashBoardContext04.getChildren().add(load);
    }
}
