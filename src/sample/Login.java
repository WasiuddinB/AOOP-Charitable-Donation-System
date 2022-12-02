package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Login {

    @FXML
    private Label error_lbl;

    @FXML
    private PasswordField password_tf;

    @FXML
    private TextField username_tf;

    public void login_page(ActionEvent event) throws IOException{
        checkLogin();

    }
    private void checkLogin() throws IOException{
        Main mn=new Main();
        boolean matched=false;

        String user1= username_tf.getText();
        String user2= password_tf.getText();

        FileReader fr=new FileReader("login.txt");
        BufferedReader br=new BufferedReader(fr);
        String line;
        while((line=br.readLine())!=null){
            if(line.equals(user1+"\t"+user2)){
                matched=true;
                break;
            }
        }
        fr.close();
        if(matched){
            mn.changeScene("LoggedIn.fxml");
        }
        else if(username_tf.getText().isEmpty() && password_tf.getText().isEmpty()){
            error_lbl.setText("Please provide us your data.");
        }
        else{
            error_lbl.setText("Sorry! Wrong Username or Wrong Password!");
        }
    }

    public void sign_but(ActionEvent event) throws IOException{
        Main signn=new Main();
        signn.changeScene("SignUp.fxml");
    }

    public void prev_btn(ActionEvent event) throws IOException{
        Main pre=new Main();
        pre.changeScene("confirmation_page.fxml");
    }




}
