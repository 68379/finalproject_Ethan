package finale;

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
        FXMLLoader fxmlLoader = new FXMLLoader(finale.CulminatingApplication.class.getResource("Culminating-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(),418,500);
        stage.setTitle("Online Shop");
        stage.setScene(scene);
        stage.show();

    }
}
