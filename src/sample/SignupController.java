package sample;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import javax.swing.*;
import java.io.FileWriter;
import java.io.IOException;

public class SignupController {
    @FXML
    private TextField s_email_tf;

    @FXML
    private TextField s_name_tf;

    @FXML
    private TextField s_pass_tf;

    @FXML
    private TextField s_pass_tf1;

    @FXML
    private Label err_lb;

    @FXML
    public void Submit_btn(ActionEvent event) throws IOException{

        if(s_pass_tf.getText().equals(s_pass_tf1.getText())){

            FileWriter fw= new FileWriter("login.txt",true);
            fw.write(s_name_tf.getText()+"\t"+s_pass_tf.getText()+"\n");
            fw.close();

            JFrame f=new JFrame();
            JOptionPane.showMessageDialog(f,"Registration Complete");
            f.dispose();
            JFrame rt=new JFrame();
            JOptionPane.showMessageDialog(rt,"Your User ID was created.");
            rt.dispose();

            Main m3=new Main();
            m3.changeScene("sample.fxml");
        }
        else if(s_pass_tf1.getText().isEmpty()){
            err_lb.setText("Please Confirm Your Password");
        }
        else if(s_pass_tf.getText()!=s_pass_tf1.getText()){
            err_lb.setText("Passwords Do not Match. Please Retry.");
        }
    }

    public void prev_but(ActionEvent event) throws IOException{
        Main prev=new Main();
        prev.changeScene("confirmation_page.fxml");
    }
}
