module com.example.texteditor {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;

    opens com.example.texteditor to javafx.fxml;
    exports com.example.texteditor;

    opens texteditor to javafx.fxml;
    exports texteditor;

    opens test to javafx.fxml;
    exports test;

    opens showhide2 to javafx.fxml;
    exports showhide2;

    opens numberGuess to javafx.fxml;
    exports numberGuess;

    opens collegeplan to javafx.fxml;
    exports collegeplan;

    opens PizzaOrder to javafx.fxml;
    exports PizzaOrder;

    opens textnumber to javafx.fxml;
    exports textnumber;

    opens PhotoAlbum to javafx.fxml;
    exports PhotoAlbum;

    opens final1 to javafx.fxml;
    exports final1;
}