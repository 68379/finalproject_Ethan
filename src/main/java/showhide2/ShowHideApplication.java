package showhide2;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class ShowHideApplication extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(showhide2.ShowHideApplication.class.getResource("showhide-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(),300,450);
        stage.setTitle("Number Guess");
        stage.setScene(scene);
        stage.show();
    }
}
