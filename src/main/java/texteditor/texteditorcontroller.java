package texteditor;

import javafx.fxml.FXML;
import javafx.application.Platform;
import javafx.scene.control.TextArea;


public class texteditorcontroller {
    @FXML
    private TextArea txtAreaPad;

    TextEditorApplication app = new TextEditorApplication();

    @FXML
    protected void onCloseItemClick(){
        Platform.exit();
    }
    @FXML
    protected void onDeleteItemClick(){
        txtAreaPad.setText(" ");
    }
    @FXML
    protected void onCitationItemClick(){
        app.getHostServices().showDocument("https://www.bbc.com/");
    }
    @FXML
    protected void onSearchItemClick(){
        app.getHostServices().showDocument("https://www.bbc.com/");
    }

}
