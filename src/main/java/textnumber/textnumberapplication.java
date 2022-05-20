package textnumber;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class textnumberapplication extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(textnumberapplication.class.getResource("textnumber-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(),450,550);
        stage.setTitle("Test");
        stage.setScene(scene);
        stage.show();

    }
}