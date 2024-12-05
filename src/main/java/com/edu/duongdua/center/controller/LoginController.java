package com.edu.duongdua.center.controller;

import com.edu.duongdua.center.App;
import com.edu.duongdua.center.model.Accounts;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import java.io.IOException;
import java.sql.ResultSet;

public class LoginController
{
    @FXML
    private TextField txtEmail;
    @FXML
    private TextField txtPassword;

    @FXML
    public void btnLoginSubmit(ActionEvent event)
    {
        String email = txtEmail.getText();
        String password = txtPassword.getText();
        int check = 0;

        Accounts accounts = new Accounts();
        ResultSet login = accounts.login(email, password);

        try {
            while (login.next())
            {
                check++;
                if (check > 0)
                {
                    FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("view/index.fxml"));
                    Parent root = fxmlLoader.load();
                    Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                    Scene indexScene = new Scene(root, 1280, 720);
                    stage.setScene(indexScene);
                    stage.show();
                }
                return;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
