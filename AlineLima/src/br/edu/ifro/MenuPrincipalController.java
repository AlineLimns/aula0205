/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifro;

import com.jfoenix.controls.JFXTextField;
import com.jfoenix.skins.JFXButtonSkin;
import com.jfoenix.skins.JFXTextFieldSkin;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

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
    private Label lblNum1;
    @FXML
    private Label lblNum2;
    @FXML
    private Label lblResultado;
    
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

    @FXML
    private void abrirCadastroAluno(ActionEvent event) {
        
        try{
                FXMLLoader fxmlLoader = new FXMLLoader();
                fxmlLoader.setLocation(getClass().getResource("Aluno.fxml"));
                Scene scene = new Scene(fxmlLoader.load(),900,682);
                Stage stage = new Stage();
                stage.setTitle("Cadastrar Aluno");
                stage.setScene(scene);
                stage.show();
            }
        catch(IOException e){

         }
    }

    @FXML
    private void fecharProjeto(ActionEvent event) {
    }
    
}
