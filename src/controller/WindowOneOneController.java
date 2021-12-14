package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.net.URL;

public class WindowOneOneController {
    public AnchorPane DashBoardContext;

    public void OpenOneTwo(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/WindowOneTwo.fxml");
        Parent load = FXMLLoader.load(resource);
        DashBoardContext.getChildren().clear();
        DashBoardContext.getChildren().add(load);
    }




    public void OpenOneFive(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/WindowOneFour.fxml");
        Parent load = FXMLLoader.load(resource);
        DashBoardContext.getChildren().clear();
        DashBoardContext.getChildren().add(load);
    }

    public void OpenOneFour(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/WindowOneFive.fxml");
        Parent load = FXMLLoader.load(resource);
        DashBoardContext.getChildren().clear();
        DashBoardContext.getChildren().add(load);
    }


    public void OpenOneThree(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/WindowOneThree.fxml");
        Parent load = FXMLLoader.load(resource);
        DashBoardContext.getChildren().clear();
        DashBoardContext.getChildren().add(load);
    }

    public void OpenWindowTwo(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/WindowTwo.fxml");
        Parent load = FXMLLoader.load(resource);
        DashBoardContext.getChildren().clear();
        DashBoardContext.getChildren().add(load);
    }
}
