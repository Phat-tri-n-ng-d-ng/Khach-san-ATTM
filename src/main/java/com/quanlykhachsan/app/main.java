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
        primaryStage.setTitle("Statistics");
        javafx.scene.layout.VBox vbox = new javafx.scene.layout.VBox(10);
        vbox.setPadding(new javafx.geometry.Insets(20));
        javafx.scene.control.Label title = new javafx.scene.control.Label("Statistics Dashboard");
        title.setStyle("-fx-font-size: 20px; -fx-font-weight: bold;");
        javafx.scene.control.Label stats = new javafx.scene.control.Label("Total Guests: 120\nTotal Rooms: 45\nRevenue: $12,000");
        vbox.getChildren().addAll(title, stats);
        Scene scene = new Scene(vbox, 400, 200);
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}
