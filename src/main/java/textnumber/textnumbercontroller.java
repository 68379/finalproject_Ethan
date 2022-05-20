package textnumber;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.TextInputDialog;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Optional;

public class textnumbercontroller {

    @FXML
    private TextField txtField, txtWord;
    @FXML
    private TextArea txtArea, txtWordDisplay;


    textnumber tn;
    String display;
    WordWork ww;

    public textnumbercontroller() throws IOException {
        txtWord = new TextField();
        ww = new WordWork();
        txtWordDisplay = new TextArea();
        txtField = new TextField();
        txtArea = new TextArea();
        tn = new textnumber();
        display = " ";
    }

    public void onrclick(){
        if(!txtField.getText().isEmpty()){
            String z = txtField.getText();
            display = tn.textBackwards(z);
        }else {
            display = "Enter a text or a number: ";
        }
        txtArea.setText(display);
        }

    public void onCclick(){
    if(!txtField.getText().isEmpty()){
        int count = tn.countVowels(txtField.getText());
        display = "There are " + count + " vowels in " + txtField.getText();
    }else{
        display = "Enter a text or a number";
    }
    txtArea.setText(display);
    }

    public void onDclick(){
        boolean isANumber = tn.isANumber(txtField.getText());
        if(isANumber == true && !(txtField.getText().isEmpty() == true)){
            int num = Integer.valueOf(txtField.getText());
            String sum = tn.digitSum(num);
            display = "Sum of all digits for " + num + " is: " + sum;
        }else{
            display = "You did NOT enter a number";
        }
        txtArea.setText(display);
    }

    public void onResetClick(){
        txtField.setText("");
        txtArea.setText("");
    }
    public void btnWordWordClick(ActionEvent event) throws IOException {
    Parent wordWork = FXMLLoader.load(getClass().getResource("wordwork-view.fxml"));
    Scene scene = new Scene(wordWork);

    Stage stage = (Stage)((Node) event.getSource()).getScene().getWindow();
    stage.setTitle("Word Work");
    stage.setScene(scene);
    stage.show();
    }

    public void btnOpenTextNumber(ActionEvent event) throws IOException{
    Parent textnumber = FXMLLoader.load(getClass().getResource("textnumber-view.fxml"));
    Scene scene = new Scene(textnumber);

    Stage stage = (Stage)((Node) event.getSource()).getScene().getWindow();
    stage.setTitle("Text Number");
    stage.setScene(scene);
    stage.show();
}
public void btnLetterBox(){
        if(!txtWord.getText().isEmpty()){
            TextInputDialog dialog1 = new TextInputDialog();
            dialog1.setTitle("Rows");
            dialog1.setHeaderText("Number of rows");
            dialog1.setContentText("Please enter number of rows: ");
            Optional<String> row = dialog1.showAndWait();

            int rowNum = 0;
            if(row.isPresent()){
                rowNum = Integer.parseInt(row.get());
            }
            TextInputDialog dialog2 = new TextInputDialog();
            dialog2.setTitle("Columns");
            dialog2.setHeaderText("Number of columns");
            dialog2.setContentText("Please enter number of columns: ");
            Optional<String> col = dialog2.showAndWait();

            int colNum =0;
            if(col.isPresent()){
                colNum = Integer.parseInt(col.get());
            }
            String box = ww.printRectLetters(txtWord.getText(),rowNum,colNum);
            display = box;
        }
        txtWordDisplay.setText(display);
}
public void btnWWReset(){
        txtWord.setText(" ");
        txtWordDisplay.setText(" ");
}
public void btnSingleWord(){
    if(!txtWord.getText().isEmpty()){
        String z = txtWord.getText();
        display = ww.makeSingleWord(z);
    }else {
        display = "Enter a text or a number: ";
    }
    txtWordDisplay.setText(display);
}
public void btnAltText(){
    if(!txtWord.getText().isEmpty()){
        String z = txtWord.getText();
        display = ww.createAlternateText(z);
    }else {
        display = "Enter a text or a number: ";
    }
    txtWordDisplay.setText(display);
}
public void btnIsPalindrome(){
    if(!txtWord.getText().isEmpty()){
        String z = txtWord.getText();
        display = ww.isPalindrome(z);
    }else {
        display = "Enter a text or a number: ";
    }
    txtWordDisplay.setText(display);
}
}