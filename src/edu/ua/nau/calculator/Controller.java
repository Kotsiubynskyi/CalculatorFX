package edu.ua.nau.calculator;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import java.io.IOException;

public class Controller {

    @FXML
    private TextField textField;

    @FXML
    public void calculate() throws ScriptException, IOException {
        String formula = textField.getText()
                .replaceAll("x", "*")
                .replaceAll("-", "-");
        ScriptEngineManager manager = new ScriptEngineManager();
        ScriptEngine engine = manager.getEngineByName("JavaScript");
        String result;
        try {
            result = String.valueOf(engine.eval(formula));
        } catch (Exception e) {
            textField.setText("Evaluation error");
            return;
        }
        if (result.length() > 12) {
            textField.setText(result.substring(0, 15));
        } else {
            textField.setText(result);
        }
    }

    @FXML
    public void inSign(MouseEvent evt) {
        Button button = (Button) evt.getSource();
        String sign = button.getText();
        textField.setText(textField.getText() + sign);
    }

    @FXML
    public void clear() {
        textField.clear();
    }
}