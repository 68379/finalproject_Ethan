package PizzaOrder;

import collegeplan.CollegePlan;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import net.synedra.validatorfx.Check;

public class PizzaOrderController {
    @FXML
    private TextArea txtAreaResults = new TextArea();
    @FXML
    private RadioButton radsp = new RadioButton();
    @FXML
    private RadioButton radmp = new RadioButton();
    @FXML
    private RadioButton radlp = new RadioButton();
    @FXML
    private RadioButton radsd = new RadioButton();
    @FXML
    private RadioButton radmd = new RadioButton();
    @FXML
    private RadioButton radld = new RadioButton();
    @FXML
    private RadioButton radsf = new RadioButton();
    @FXML
    private RadioButton radmf = new RadioButton();
    @FXML
    private RadioButton radlf = new RadioButton();
    @FXML
    private CheckBox chkp = new CheckBox();
    @FXML
    private CheckBox chkd = new CheckBox();
    @FXML
    private CheckBox chkf = new CheckBox();
    @FXML
    private ToggleGroup Pizza = new ToggleGroup();
    @FXML
    private ToggleGroup Drink = new ToggleGroup();
    @FXML
    private ToggleGroup Fries = new ToggleGroup();
    @FXML
    private ImageView image;


    String foodsize = " ", order= " ";
    double cost = 0;
    PizzaOrder pc;

    private void textAreaResult() {
        if (foodsize != null) {
            pc = new PizzaOrder(foodsize, order,cost);
        } if(order != null){
            pc = new PizzaOrder(foodsize,order, cost);
        }
        txtAreaResults.setText(pc.toString());
    }

    public void checkbox() {
        order = " ";
        if (chkp.isSelected()) {
            order += "Pizza" + "\n";
        }
        if (chkd.isSelected()) {
            order += "Drink" + "\n";
        }
        if (chkf.isSelected()) {
            order += "Fries" + "\n";
        }
        textAreaResult();
    }

    public void Size() {
        foodsize = " ";
        radsp.setUserData("Small(13.0)");
        radmp.setUserData("Medium(15.5)");
        radlp.setUserData("Large(17.0)");
        radsd.setUserData("Small(1.5)");
        radmd.setUserData("Medium(2.0)");
        radld.setUserData("Large(2.5)");
        radsf.setUserData("Small(1.0)");
        radmf.setUserData("Medium(1.5)");
        radlf.setUserData("Large(2.0)");

        if (Pizza.getSelectedToggle() != null) {
            foodsize += "Size for pizza " + Pizza.getSelectedToggle().getUserData().toString() + "\n";

        }
        if (Drink.getSelectedToggle() != null) {
            foodsize += " Size for drinks " + Drink.getSelectedToggle().getUserData().toString() + "\n";


        } if (Fries.getSelectedToggle() != null) {
            foodsize += " Size for fries " + Fries.getSelectedToggle().getUserData().toString() + "\n";

        }
        textAreaResult();
    }

    @FXML
    protected void click(){
        txtAreaResults.setText("Thank You");
    }

    public void onpc(){checkbox();}
    @FXML
    public void ondc(){checkbox();}
    @FXML
    public void onfc(){checkbox();}
    @FXML
    public void onspc(){Size();}
    @FXML
    public void onmpc(){Size();}
    @FXML
    public void onlpc(){Size();}
    @FXML
    public void onsdc(){Size();}
    @FXML
    public void onmdc(){Size();}
    @FXML
    public void onldc(){Size();}
    @FXML
    public void onsfc(){Size();}
    @FXML
    public void onmfc(){Size();}
    @FXML
    public void onlfc(){Size();}
    @FXML
    public void onbtnclick(){click();}

}