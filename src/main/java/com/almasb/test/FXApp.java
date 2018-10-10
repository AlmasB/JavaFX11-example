package com.almasb.test;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 * @author Almas Baimagambetov (almaslvl@gmail.com)
 */
public class FXApp extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        stage.setScene(new Scene(new Pane(), 800, 600));
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
