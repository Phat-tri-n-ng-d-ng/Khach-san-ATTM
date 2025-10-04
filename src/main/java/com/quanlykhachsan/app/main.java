package com.quanlykhachsan.app;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Hello World!");
        Scene scene = new Scene(new javafx.scene.control.Button("Hello, World!"), 400, 200);
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}
