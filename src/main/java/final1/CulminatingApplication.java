package final1;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class CulminatingApplication extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(final1.CulminatingApplication.class.getResource("Culminating-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(),420,557);
        stage.setTitle("Online Shop");
        stage.setScene(scene);
        stage.show();

    }
}
