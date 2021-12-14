package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class DashBoardFormController {
    public AnchorPane logReceptionContext;



    public void ReceptionDashboard(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/WindowTwo.fxml");
        Parent load = FXMLLoader.load(resource);
        logReceptionContext.getChildren().clear();
        logReceptionContext.getChildren().add(load);
    }




    public void ReceptionAdmin(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/WindowOnee.fxml");
        Parent load = FXMLLoader.load(resource);
        logReceptionContext.getChildren().clear();
        logReceptionContext.getChildren().add(load);
    }
}
