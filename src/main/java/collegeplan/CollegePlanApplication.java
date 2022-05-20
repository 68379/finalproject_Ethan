package collegeplan;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class CollegePlanApplication extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(CollegePlanApplication.class.getResource("collegeplan-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(),410,600);
        primaryStage.setTitle("College Plan");
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}
