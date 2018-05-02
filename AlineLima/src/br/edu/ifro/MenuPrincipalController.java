/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifro;

import com.jfoenix.controls.JFXTextField;
import com.jfoenix.skins.JFXButtonSkin;
import com.jfoenix.skins.JFXTextFieldSkin;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author 03822722260
 */
public class MenuPrincipalController implements Initializable {
    
    @FXML
    private TextField txtNum1, txtNum2, txtResultado;
    
    @FXML
    private Button btnSoma, btnDivide,btnMultiplica, btnSubtrai;
    
    @FXML
    
    private void soma(ActionEvent event) {
        Double num1 = Double.parseDouble(txtNum1.getText());
        Double num2 = Double.parseDouble(txtNum2.getText());
        Double resultado = num1 + num2;
        
        txtResultado.setText(resultado.toString());
    }
    
    @FXML
    
    private void divide(ActionEvent event) {
        Double num1 = Double.parseDouble(txtNum1.getText());
        Double num2 = Double.parseDouble(txtNum2.getText());
        Double resultado = num1 / num2;
        
        txtResultado.setText(resultado.toString());
    }
    
    @FXML
    
    private void subtrai(ActionEvent event) {
        Double num1 = Double.parseDouble(txtNum1.getText());
        Double num2 = Double.parseDouble(txtNum2.getText());
        Double resultado = num1 - num2;
        
        txtResultado.setText(resultado.toString());
    }
    
    @FXML
    
    private void multiplica(ActionEvent event) {
        Double num1 = Double.parseDouble(txtNum1.getText());
        Double num2 = Double.parseDouble(txtNum2.getText());
        Double resultado = num1 * num2;
        
        txtResultado.setText(resultado.toString());
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
