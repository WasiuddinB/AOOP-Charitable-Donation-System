package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Confirm {

    @FXML
    private PasswordField admin_pass;

    @FXML
    private TextField admin_tf;

    @FXML
    private Label error2_lbl;

    @FXML
    private void admin_login(ActionEvent event) throws IOException {
        checkAdmin();
    }
    private void checkAdmin()throws IOException{
        Main ad=new Main();
        boolean matched=false;

        String admin1= admin_tf.getText();
        String admin2= admin_pass.getText();

        FileReader adr=new FileReader("admin.txt");
        BufferedReader brad=new BufferedReader(adr);
        String line;
        while((line=brad.readLine())!=null){
            if(line.equals(admin1+"\t"+admin2)){
                matched=true;
                break;
            }
        }
        adr.close();
        if(matched){
            ad.changeScene("Adminpage.fxml");
        }
        else if(admin_tf.getText().isEmpty() && admin_pass.getText().isEmpty()){
            error2_lbl.setText("Please provide us your data. ");
        }
        else{
            error2_lbl.setText("Sorry! Wrong Username or Wrong Password! ");
        }
    }

    @FXML
    private void login_first(ActionEvent event) throws IOException{
        Main m1=new Main();
        m1.changeScene("sample.fxml");
    }

    @FXML
    private void Sign_page(ActionEvent event) throws IOException{
        Main m2=new Main();
        m2.changeScene("SignUp.fxml");
    }


}
