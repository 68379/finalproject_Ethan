package test;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;



import java.io.IOException;


public class testApplication extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(testApplication.class.getResource("test-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 620,550);
        primaryStage.setTitle("Indonesia map");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
