package PizzaOrder;

import collegeplan.CollegePlanApplication;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class PizzaOrderApplication extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(PizzaOrderApplication.class.getResource("PizzaOrder-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(),640,400);
        primaryStage.setTitle("Pizza Order");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
