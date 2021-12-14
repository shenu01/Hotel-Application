package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.net.URL;

public class AddminWindowThreeController {
    public AnchorPane AdminThreeContext;

    public void openHotelInvoice(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/AddminWindowTwo.fxml");
        Parent load = FXMLLoader.load(resource);
        AdminThreeContext.getChildren().clear();
        AdminThreeContext.getChildren().add(load);
    }

    public void OpenWindowOnee(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/WindowOnee.fxml");
        Parent load = FXMLLoader.load(resource);
        AdminThreeContext.getChildren().clear();
        AdminThreeContext.getChildren().add(load);
    }



    public void MealsDeteils(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/AddminWindowOne.fxml");
        Parent load = FXMLLoader.load(resource);
        AdminThreeContext.getChildren().clear();
        AdminThreeContext.getChildren().add(load);
    }
}
