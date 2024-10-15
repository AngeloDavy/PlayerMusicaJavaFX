package org.example.playermusica;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;

public class HelloApplication extends Application {

    private double eixoX = 0;
    private double eixoY = 0;

    @Override
    public void start(Stage stage) throws IOException{
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            stage.setTitle("Hello!");
            stage.setScene(scene);
            stage.initStyle(StageStyle.UNDECORATED);
            stage.show();


            scene.setOnMousePressed(new EventHandler<MouseEvent>() {
                @Override
                public void handle(MouseEvent mouseEvent) {
                    eixoX = mouseEvent.getSceneX();
                    eixoY = mouseEvent.getSceneY();
                }
            });

            scene.setOnMouseDragged(new EventHandler<MouseEvent>() {
                @Override
                public void handle(MouseEvent mouseEvent) {
                    stage.setX(mouseEvent.getScreenX() - eixoX);
                    stage.setY(mouseEvent.getScreenY() - eixoY);
                }
            });

        } catch (Exception e) {
            e.printStackTrace();
        }



    }

    public static void main(String[] args) {
        launch(args);
    }
}