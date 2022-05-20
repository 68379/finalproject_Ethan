package test;



import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;





public class testController {

    @FXML
    private ImageView image;

    @FXML
    private TextField textField;

    @FXML

    private Label text1,feedback;

    @FXML
    private TextArea lblMessage;

    testApplication app = new testApplication();


    @FXML
    protected void sum(){
        app.getHostServices().showDocument("https://www.independent.co.uk/topic/sumatra");
    }
    @FXML
    protected void jaw() {
        app.getHostServices().showDocument("https://www.jawapos.com/");
    }
    @FXML
    protected void kal() {
        app.getHostServices().showDocument("https://www.kalimantan-news.com/");
    }
    @FXML
    protected void sul() {
        app.getHostServices().showDocument("https://www.independent.co.uk/topic/sulawesi");
    }
    @FXML
    protected void mal() {
        app.getHostServices().showDocument("http://www.malukunews.co/");
    }
    @FXML
    protected void bal() {
        app.getHostServices().showDocument("https://thebalisun.com/");
    }
    @FXML
    protected void pap() {
        app.getHostServices().showDocument("https://www.kompas.com/tag/papua");
    }
    @FXML
    protected void ntt() {
        app.getHostServices().showDocument("https://www.kompas.com/tag/ntt");
    }
    @FXML
    protected void ntb() {
        app.getHostServices().showDocument("https://www.ntbprov.go.id/news");
    }

    @FXML
    protected void onlinkClick(){
        app.getHostServices().showDocument("https://www.youtube.com/watch?v=dQw4w9WgXcQ&ab_channel=RickAstley");
    }
    @FXML
    protected void submit(){
        feedback.setText("Feedback: " + lblMessage.getText() +"\n \n Rating: " + textField.getText());
        textField.setText(" ");
        lblMessage.setText(" ");
        text1.setText("Thank you!");

    }

}
