package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;

import javax.swing.*;
import java.io.FileWriter;
import java.io.IOException;

public class StudyP {

    @FXML
    private CheckBox Bags_ch;

    @FXML
    private CheckBox Books_ch;

    @FXML
    private CheckBox Calcs_ch;

    @FXML
    private CheckBox Erase_ch;

    @FXML
    private CheckBox Notes_ch;

    @FXML
    private CheckBox Pens_ch;

    @FXML
    private CheckBox Sharpners_ch;

    @FXML
    private CheckBox Staplers_ch;

    @FXML
    private TextField study_email;

    @FXML
    private TextField study_name;

    @FXML
    private void study_done(ActionEvent event) throws IOException {

        String Books_cha = "";
        String Notes_cha = "";
        String Pens_cha = "";
        String Erase_cha = "";
        String Sharpners_cha = "";
        String Staplers_cha = "";
        String Calcs_cha = "";
        String Bags_cha = "";

        if(Books_ch.isSelected()){
            Books_cha=Books_ch.getText();
        }
        if(Notes_ch.isSelected()){
            Notes_cha=Notes_ch.getText();
        }
        if(Pens_ch.isSelected()){
            Pens_cha=Pens_ch.getText();
        }
        if(Erase_ch.isSelected()){
            Erase_cha=Erase_ch.getText();
        }
        if(Sharpners_ch.isSelected()){
            Sharpners_cha=Sharpners_ch.getText();
        }
        if(Staplers_ch.isSelected()){
            Staplers_cha=Staplers_ch.getText();
        }
        if(Calcs_ch.isSelected()){
            Calcs_cha=Calcs_ch.getText();
        }
        if(Bags_ch.isSelected()){
            Bags_cha=Bags_ch.getText();
        }



        if(Books_ch.isSelected() && Notes_ch.isSelected() && Pens_ch.isSelected() && Erase_ch.isSelected() && Sharpners_ch.isSelected() && Staplers_ch.isSelected() && Calcs_ch.isSelected() && Bags_ch.isSelected()){
            FileWriter stuw= new FileWriter("study.txt",true);
            stuw.write(study_name.getText()+"\t"+study_email.getText()+"\t"+Books_cha+"\t"+Notes_cha+"\t"+Pens_cha+"\t"+Erase_cha+"\t"+Sharpners_cha+"\t"+Staplers_cha+"\t"+Calcs_cha+"\t"+Bags_cha+"\n");
            stuw.close();


            JFrame ston=new JFrame();
            JOptionPane.showMessageDialog(ston,"You are a big hearted person!! 💟");
            ston.dispose();
            JFrame sto=new JFrame();
            JOptionPane.showMessageDialog(sto,"You Deserve an award for the good deed you did! ❤");
            sto.dispose();

            Main fourth_award=new Main();
            fourth_award.changeScene("Award.fxml");
        }

        else{
            FileWriter stuw= new FileWriter("study.txt",true);
            stuw.write(study_name.getText()+"\t"+study_email.getText()+"\t"+Books_cha+"\t"+Notes_cha+"\t"+Pens_cha+"\t"+Erase_cha+"\t"+Sharpners_cha+"\t"+Staplers_cha+"\t"+Calcs_cha+"\t"+Bags_cha+"\n");
            stuw.close();

            JFrame ston=new JFrame();
            JOptionPane.showMessageDialog(ston,"💖Thank you for your contribution!!💖");
            ston.dispose();
            JFrame sto=new JFrame();
            JOptionPane.showMessageDialog(sto,"You will soon get connected with our organization's server.");
            sto.dispose();

            Main fifth=new Main();
            fifth.changeScene("LoggedIn.fxml");
        }
    }

    public void study_back(ActionEvent event)throws IOException{
        Main slb=new Main();
        slb.changeScene("LoggedIn.fxml");
    }
}
