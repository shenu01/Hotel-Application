package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.net.URL;

public class AddminWindowOneController {
    public AnchorPane AdminOneContext;

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

    public void AddRooms(ActionEvent actionEvent) {
        new Alert(Alert.AlertType.CONFIRMATION,"New  Room Added has been  successfully", ButtonType.CLOSE).show();

    }

    public void AddMeals(ActionEvent actionEvent) {
        new Alert(Alert.AlertType.CONFIRMATION,"New  meals Added has been  successfully", ButtonType.CLOSE).show();
    }

    public void DeleteRoom(ActionEvent actionEvent) {
        new Alert(Alert.AlertType.CONFIRMATION,"Room  Deleted has been  successfully", ButtonType.CLOSE).show();
    }

    public void DeleteMeals(ActionEvent actionEvent) {
        new Alert(Alert.AlertType.CONFIRMATION,"Meals  Deleted has been  successfully", ButtonType.CLOSE).show();
    }
}
