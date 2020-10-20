package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.io.IOException;

public class Controller {
    Model model = new Model();

    @FXML
    private TextField login;

    @FXML
    private PasswordField pass;

    @FXML
    private Label status;

    @FXML
    public void pressReg(ActionEvent event) throws IOException {
        model.reg(login.getText(), pass.getText());
        status.setText(login + ", Вы успешно зарегистрировались☻");
    }
    @FXML
    public void pressIn(ActionEvent event) throws IOException{
        model.sign(login.getText(), pass.getText());
        status.setText(login + ", Вы успешно авторизированы♥");
    }
}