package controller;

import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.layout.AnchorPane;
import view.tm.LoggingTM;

import java.io.IOException;
import java.net.URL;

public class WindowOneeController {
    public JFXTextField userPassword;
    public JFXTextField userName;
    public AnchorPane loguserrContext;





    public void AddminDashBoard(ActionEvent actionEvent) throws IOException {
        if (userName.getText().equals(LoggingTM.GetAddminName()) && userPassword.getText().equals(LoggingTM.GetAddminPassword())) {
            URL resource = getClass().getResource("../view/AddminWindowOne.fxml");
            Parent load = FXMLLoader.load(resource);
            loguserrContext.getChildren().clear();
            loguserrContext.getChildren().add(load);
        } else {
            new Alert(Alert.AlertType.WARNING, "The user name or password that you entered is incorrect.Try Again.. ", ButtonType.CLOSE).show();
        }
    }

    public void DashBoardForm(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/DashBoardForm.fxml");
        Parent load = FXMLLoader.load(resource);
        loguserrContext.getChildren().clear();
        loguserrContext.getChildren().add(load);
    }
}
