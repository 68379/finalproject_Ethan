package numberGuess;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class NumberGuessApplication extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(numberGuess.NumberGuessApplication.class.getResource("NumberGuess-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(),400,500);
        stage.setTitle("Test");
        stage.setScene(scene);
        stage.show();

    }
}
