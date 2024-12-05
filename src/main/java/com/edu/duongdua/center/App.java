package com.edu.duongdua.center;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class App extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("view/LoginScene.fxml"));
        Parent root = fxmlLoader.load();
        Scene loginScene = new Scene(root, 1280, 720);
        stage.setTitle("Đuông dừa Education");
        stage.setScene(loginScene);
        stage.show();
    }

    public static void main(String[] args)
    {
        launch();
    }
}