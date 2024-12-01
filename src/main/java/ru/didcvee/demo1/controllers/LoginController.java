package ru.didcvee.demo1.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import ru.didcvee.demo1.utils.DBHelper;
import ru.didcvee.demo1.models.User;

public class LoginController {
    @FXML
    private TextField usernameField;
    @FXML
    private PasswordField passwordField;
    @FXML
    private Label errorLabel;

    @FXML
    protected void onLoginButtonClick() {
        String username = usernameField.getText();
        String password = passwordField.getText();

        User user = DBHelper.users.stream()
                .filter(u -> u.getUsername().equals(username) && u.getPassword().equals(password))
                .findFirst()
                .orElse(null);

        if (user != null) {
            // Переключение на экран товаров
            errorLabel.setText("Успешно!");
        } else {
            errorLabel.setText("Неверный логин или пароль");
        }
    }
}
