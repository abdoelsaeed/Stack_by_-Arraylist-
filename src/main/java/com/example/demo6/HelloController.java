package com.example.demo6;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class HelloController {
Stack r1=new Stack();
    @FXML
    private Button delete;

    @FXML
    private Button display;

    @FXML
    private Button find;

    @FXML
    private Button insert;

    @FXML
    private TextField one;

    @FXML
    private Text result;

    @FXML
    private TextField three;

    @FXML
    private TextField two;

    @FXML
    void delete(ActionEvent event) {
        Integer c = Integer.parseInt(three.getText());
        r1.delete(c);
    }

    @FXML
    void display(ActionEvent event) {

        result.setText(r1.display());
    }

    @FXML
    void find(ActionEvent event) {
        Integer b = Integer.parseInt(two.getText());
result.setText(""+(r1.find(b)));

    }

    @FXML
    void insert(ActionEvent event) {

            Integer a = Integer.parseInt(one.getText());
            r1.insert(a);
            one.setText("");
        }
    }
