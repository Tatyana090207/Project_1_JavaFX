package sample;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert;

public class Controller {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField Field_X;

    @FXML
    private TextField Field_A;

    @FXML
    private TextField Field_B;

    @FXML
    private Button Resolve;

    @FXML
    private Button onClickMethod;

    @FXML
    private Button Exit_;

    @FXML
    private TextField rez;

    @FXML
    void Ochistka(ActionEvent event) {
        Field_X.setText("");
        Field_A.setText("");
        Field_B.setText("");

    }
    @FXML
    void Close_(ActionEvent event) {
        System.exit(0);
    }
    @FXML
    void Vvod(ActionEvent event) {
        double x=Double.parseDouble(Field_X.getText());
        double a=Double.parseDouble(Field_A.getText());
        double b=Double.parseDouble(Field_B.getText());
        double y=0;
        Alert alert = new Alert(Alert.AlertType.INFORMATION);

        alert.setTitle("Error");
        alert.setHeaderText(null);
        if ((a==0) && (b==0)) {alert.setContentText("А и В немогут одновременно быть равными нулю!");
        alert.showAndWait();
        }
        else if (x<=7) {
            y=(x+4)/(a*a+b*b);
        }
        else y=x*(a+b)*(a+b);
        rez.setText(Double.toString(y));
        }


    @FXML
    void initialize() {
        assert Field_X != null : "fx:id=\"Field_X\" was not injected: check your FXML file 'sample.fxml'.";
        assert Field_A != null : "fx:id=\"Field_A\" was not injected: check your FXML file 'sample.fxml'.";
        assert Field_B != null : "fx:id=\"Field_B\" was not injected: check your FXML file 'sample.fxml'.";
        assert Resolve != null : "fx:id=\"Resolve\" was not injected: check your FXML file 'sample.fxml'.";
        assert onClickMethod != null : "fx:id=\"onClickMethod\" was not injected: check your FXML file 'sample.fxml'.";
        assert Exit_ != null : "fx:id=\"Exit_\" was not injected: check your FXML file 'sample.fxml'.";
        assert rez != null : "fx:id=\"rez\" was not injected: check your FXML file 'sample.fxml'.";

    }
}
