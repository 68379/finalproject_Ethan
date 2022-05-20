package collegeplan;

import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.ToggleGroup;

public class CollegePlanController {
    @FXML
    private TextArea txtAreaResult;
    @FXML
    private RadioButton radNA,radEU,radAS;
    @FXML
    private CheckBox chkIB, chkAP;
    @FXML
    private ToggleGroup collegeGroup;

    String programEnrolled = " ", targetLocation = " ";
    CollegePlan cPlan;

    public void radioGroup() {
        targetLocation = " ";
        radNA.setUserData("North America");
        radEU.setUserData("Europe");
        radAS.setUserData("Asia");

        if (collegeGroup.getSelectedToggle() != null) {
            targetLocation = collegeGroup.getSelectedToggle().getUserData().toString();
            textAreaResult();
        }
    }
        public void checkAPIB(){
            programEnrolled = " ";
            if(chkAP.isSelected()){
                programEnrolled += chkAP.getText() + "\n";
            }
            if(chkIB.isSelected()) {
                programEnrolled += chkIB.getText() + "\n";
            }
            textAreaResult();
        }

    private void textAreaResult() {
        if(programEnrolled != null){
            cPlan = new CollegePlan(programEnrolled, targetLocation);

        }
        if(targetLocation != null){
            cPlan = new CollegePlan(programEnrolled, targetLocation);
        }
        txtAreaResult.setText(cPlan.toString());
    }



    @FXML
    public void onIBCheck(){
        checkAPIB();
    }
    @FXML
    public void onAPCheck(){
        checkAPIB();
    }
    @FXML
    public void onNAClick(){
        radioGroup();
    }
    @FXML
    public void onEUClick(){
        radioGroup();
    }
    @FXML
    public void onASClick(){
        radioGroup();
    }

}
