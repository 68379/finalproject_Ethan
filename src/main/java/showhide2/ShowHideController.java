package showhide2;

import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.io.File;

public class ShowHideController {

    @FXML
    private Label lblMessage;
    @FXML
    private Button btnShowHide;
    @FXML
    private ImageView ImageShowHide = new ImageView();

    public void showImage()
    {
        File file = new File("/Users/68379/IdeaProjects/texteditor/src/main/resources/showhide2/s.png");
        Image image = new Image(file.toURI().toString());
        ImageShowHide.setImage(image);
    }
    @FXML
    public void OnShowHIdeButtonClick(){
        if(btnShowHide.getText().equals("HIDE")) {
            btnShowHide.setText("SHOW");
            lblMessage.setText("");
            ImageShowHide.setVisible(false);
        }else {
            btnShowHide.setText("HIDE");
            lblMessage.setText("Hey You!");
            showImage();
            ImageShowHide.setVisible(true);
        }
        }

    }

