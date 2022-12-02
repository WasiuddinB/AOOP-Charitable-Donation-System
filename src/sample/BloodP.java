package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;

import javax.swing.*;
import java.io.FileWriter;
import java.io.IOException;

public class BloodP {

    @FXML
    private CheckBox AB_neg;

    @FXML
    private CheckBox AB_pos;

    @FXML
    private CheckBox A_neg;

    @FXML
    private CheckBox A_pos;

    @FXML
    private CheckBox B_neg;

    @FXML
    private CheckBox B_pos;

    @FXML
    private CheckBox O_neg;

    @FXML
    private CheckBox O_pos;

    @FXML
    private TextField blood_email;

    @FXML
    private TextField blood_name;

    @FXML
    private void blood_done(ActionEvent event) throws IOException {

        String A_positive = "";
        String B_positive = "";
        String AB_positive = "";
        String O_positive = "";
        String A_negative = "";
        String B_negative = "";
        String AB_negative = "";
        String O_negative = "";

        if(A_pos.isSelected()){
            A_positive=A_pos.getText();
        }
        if(B_pos.isSelected()){
            B_positive=B_pos.getText();
        }
        if(AB_pos.isSelected()){
            AB_positive=AB_pos.getText();
        }
        if(O_pos.isSelected()){
            O_positive=O_pos.getText();
        }
        if(A_neg.isSelected()){
            A_negative=A_neg.getText();
        }
        if(B_neg.isSelected()){
            B_negative=B_neg.getText();
        }
        if(AB_neg.isSelected()){
            AB_negative=AB_neg.getText();
        }
        if(O_neg.isSelected()){
            O_negative=O_neg.getText();
        }


        FileWriter bloodw=new FileWriter("blood.txt",true);
        bloodw.write(blood_name.getText()+"\t"+blood_email.getText()+"\t"+A_positive+"\t"+B_positive+"\t"+AB_positive+"\t"+O_positive+"\t"+A_negative+"\t"+B_negative+"\t"+AB_negative+"\t"+O_negative+"\n");
        bloodw.close();

        JFrame blon=new JFrame();
        JOptionPane.showMessageDialog(blon,"💖Thank you for your contribution!!💖");
        blon.dispose();
        JFrame blo=new JFrame();
        JOptionPane.showMessageDialog(blo,"You will soon get connected with our organization's server.");
        blo.dispose();

        Main fourth=new Main();
        fourth.changeScene("LoggedIn.fxml");
    }

    public void blood_back(ActionEvent event)throws IOException{
        Main blb=new Main();
        blb.changeScene("LoggedIn.fxml");
    }
}
