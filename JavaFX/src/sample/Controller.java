package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.TextField;

public class Controller {
    public TextField number1;
    public TextField number2;
    public TextField resultField;

    public void calculate(ActionEvent actionEvent) {
        try {
            double num1 = Double.valueOf(number1.getText());
            double num2 = Double.valueOf(number2.getText());
            double result = num1 + num2;
            resultField.setText(String.valueOf(result));
        } catch (Exception e) {
            resultField.setText("Error");
        }
    }
}
