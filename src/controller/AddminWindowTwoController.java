package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.net.URL;

public class AddminWindowTwoController {
    public AnchorPane AdminOneContext;

    public void OpenMealsDeteils(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/AddminWindowOne.fxml");
        Parent load = FXMLLoader.load(resource);
        AdminOneContext.getChildren().clear();
        AdminOneContext.getChildren().add(load);
    }

    public void openHotelInvoice(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/AddminWindowTwo.fxml");
        Parent load = FXMLLoader.load(resource);
        AdminOneContext.getChildren().clear();
        AdminOneContext.getChildren().add(load);
    }

    public void OpenWindowOnee(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/WindowOnee.fxml");
        Parent load = FXMLLoader.load(resource);
        AdminOneContext.getChildren().clear();
        AdminOneContext.getChildren().add(load);
    }

    public void openIncome(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/AddminWindowThree.fxml");
        Parent load = FXMLLoader.load(resource);
        AdminOneContext.getChildren().clear();
        AdminOneContext.getChildren().add(load);
    }
}
