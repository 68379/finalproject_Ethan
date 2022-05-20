package finale;

import indomaret.Indomaret;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import test.testApplication;

import java.io.IOException;
import java.util.Locale;

public class CulminatingController {
    private Culminating[] cul;
    private int index;

    public CulminatingController() {
        this.cul = new Culminating[1000];
        this.index = 0;
        cul[0] = new Culminating("balls",100,"https://store.innersloth.com/","among");
        cul[1] = new Culminating("balls",100,"https://www.tokopedia.com/p/komputer-laptop/aksesoris-komputer-laptop/mouse","among");
        cul[2] = new Culminating("balls",100,"https://www.tokopedia.com/p/elektronik/audio/headphone","among");
        cul[3] = new Culminating("balls",100,"gay","among");
        cul[4] = new Culminating("balls",100,"gay","among");
        cul[5] = new Culminating("balls",100,"gay","among");
        cul[6] = new Culminating("balls",100,"gay","among");
        cul[7] = new Culminating("balls",100,"gay","among");
        cul[8] = new Culminating("balls",100,"gay","among");
        cul[9] = new Culminating("balls",100,"gay","among");
        cul[10] = new Culminating("balls",100,"gay","among");
        cul[11] = new Culminating("balls",100,"gay","among");
        cul[12] = new Culminating("balls",100,"gay","among");
        cul[13] = new Culminating("balls",100,"gay","among");
        cul[14] = new Culminating("balls",100,"gay","among");
        cul[15] = new Culminating("balls",100,"gay","among");
        cul[16] = new Culminating("balls",100,"gay","among");
        cul[17] = new Culminating("balls",100,"gay","among");
        cul[18] = new Culminating("balls",100,"gay","among");
        cul[19] = new Culminating("balls",100,"gay","among");
        cul[20] = new Culminating("balls",100,"gay","among");
    }

    @FXML
    TextField search, inpam = new TextField();
    @FXML
    Label balances = new Label();
    @FXML
    ImageView tv, gv, bv, kv, sv1, sv2, sv3 = new ImageView();

    Culminating cg;
    String display;

    CulminatingApplication app = new CulminatingApplication();
//    CulminatingController cu = new CulminatingController();


    public void add(Culminating cu) {
        if (index < cul.length) {
            cul[index] = cu;
            index++;
        }
    }
    public void searchbtn() {
        if (search.getText().isEmpty()) {
            display = "Enter a text or a number";
        } else {
            for (int i = 0; i < 18; i++) {
                if (search.getText().toLowerCase(Locale.ROOT).equals(cul[i].getName())) {
                    display = cul[i].getUrl();
                }
            }
        }
        search.setText(display);
    }

    public void topupclick() {
        if (!inpam.getText().isEmpty()){ // ask how to only get numbers
            display = inpam.getText();
            inpam.setText("");
        } else {
            display = "Enter a number";
        }
        balances.setText(display);
    }

     public void saleclick() {
//         int s1 = (int) (Math.random() * (cul.length - 0 + 1) + 0);
//         sv1.setImage(cul[s1].getUrl());
//         int s2 = (int) (Math.random() * (cul.length - 0 + 1) + 0);
//         sv2.setImage(cul[s2].getUrl());
//         int s3 = (int) (Math.random() * (cul.length - 0 + 1) + 0);
//         sv3.setImage(cul[s3].getUrl());

     }

    public void gobackclick(ActionEvent event) throws IOException {
        Parent finale = FXMLLoader.load(getClass().getResource("Culminating-view.fxml"));
        Scene scene = new Scene(finale);

        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Online Shop");
        stage.setScene(scene);
        stage.show();
    }

    public void gadgetsclick(ActionEvent event) throws IOException {
        Parent finale = FXMLLoader.load(getClass().getResource("gadget-view.fxml"));
        Scene scene = new Scene(finale);

        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Gadgets");
        stage.setScene(scene);
        stage.show();
    }

    public void booksclick(ActionEvent event) throws IOException {
        Parent finale = FXMLLoader.load(getClass().getResource("books-view.fxml"));
        Scene scene = new Scene(finale);

        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Books");
        stage.setScene(scene);
        stage.show();
    }

    public void toyclick(ActionEvent event) throws IOException {
        Parent finale = FXMLLoader.load(getClass().getResource("toys-view.fxml"));
        Scene scene = new Scene(finale);

        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Toys");
        stage.setScene(scene);
        stage.show();
    }

    public void kitchenclick(ActionEvent event) throws IOException {
        Parent finale = FXMLLoader.load(getClass().getResource("kitchen-view.fxml"));
        Scene scene = new Scene(finale);

        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Kitchen");
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    protected void go1(){
        int s1 = (int) (Math.random() * (cul.length + 1) + 0);
        app.getHostServices().showDocument(cul[0].getUrl());
    }
    @FXML
    protected void go2(){
        int s2 = (int) (Math.random() * (cul.length + 1) + 0);
        app.getHostServices().showDocument(cul[1].getUrl());
    }
    @FXML
      protected void go3() {
        int s3 = (int) (Math.random() * (cul.length + 1) + 0);
        app.getHostServices().showDocument(cul[3].getUrl());
    }
}

