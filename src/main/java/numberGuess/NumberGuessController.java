package numberGuess;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

public class NumberGuessController {

    @FXML
    Button btnCheck = new Button();
    @FXML
    TextField txtGuess = new TextField();
    @FXML
    Label lblAlert = new Label();
    @FXML
    VBox vBox = new VBox();

    NumberGuess ng = new NumberGuess();
    int guess = 0;
    int tries = 0;

    public void checkGuess(){
        guess = Integer.parseInt(txtGuess.getText());
        lblAlert.setText("");

        Label nLabel1 = new Label();
        Label nLabel2 = new Label();

        if(guess < 9 || guess > 100){
            lblAlert.setTextFill(Color.RED);
            lblAlert.setText("Enter a 2-digit number!");
        }else{
            tries++;
            nLabel1.setFont(new Font("Arial", 24));
            nLabel2.setFont(new Font("Arial", 24));

        }
        if(ng.getNumber() == guess){
            lblAlert.setTextFill(Color.GREEN);
            lblAlert.setText("You Won! That's the secret number!");
            nLabel2.setTextFill(Color.YELLOWGREEN);
            nLabel1.setTextFill(Color.YELLOWGREEN);
        }else{
            if(ng.onesCorrect(guess)){
                nLabel2.setTextFill(Color.YELLOWGREEN);
            }else if(ng.onesExist(guess)){
                nLabel2.setTextFill(Color.ORANGE);
            }else{
                nLabel1.setTextFill(Color.BLACK);
            }
            if (tries == 5){
                lblAlert.setTextFill(Color.RED);
                lblAlert.setText("GAME OVER");
                btnCheck.setDisable(true);
            }else{
                lblAlert.setTextFill(Color.BLACK);
                lblAlert.setText("Green: Correct number and Correct position. \n" +
                        "Orange: Correct number but not position. \n" +
                        "Black: no match, keep trying!");
            }
        }

        nLabel1.setText(guess/ 10 + " ");
        nLabel2.setText(" " + guess % 10);

        HBox hBox = new HBox();
        hBox.getChildren().add(nLabel1);
        hBox.getChildren().add(nLabel2);
        vBox.getChildren().add(hBox);

    }
}
