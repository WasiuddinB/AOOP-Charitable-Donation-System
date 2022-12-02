package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import javax.swing.*;
import java.io.FileWriter;
import java.io.IOException;

public class ClothesP {
    @FXML
    private TextField blan_q;

    @FXML
    private TextField clothe_email;

    @FXML
    private TextField clothe_name;

    @FXML
    private TextField foot_q;

    @FXML
    private TextField pant_q;

    @FXML
    private TextField shirt_q;

    @FXML
    private TextField tshirt_q;

    @FXML
    private void cloth_done(ActionEvent event) throws IOException {

        if(Integer.parseInt(tshirt_q.getText())>=5 && Integer.parseInt(shirt_q.getText())>=5 && Integer.parseInt(pant_q.getText())>=5 && Integer.parseInt(foot_q.getText())>=5 && Integer.parseInt(blan_q.getText())>=5){

            FileWriter clothw=new FileWriter("clothes.txt",true);
            clothw.write(clothe_name.getText()+"\t"+clothe_email.getText()+"\t"+tshirt_q.getText()+" "+shirt_q.getText()+" "+pant_q.getText()+" "+foot_q.getText()+" "+blan_q.getText()+"\n");
            clothw.close();

            JFrame clon=new JFrame();
            JOptionPane.showMessageDialog(clon,"You are a big hearted person!! 💟");
            clon.dispose();
            JFrame clo=new JFrame();
            JOptionPane.showMessageDialog(clo,"You Deserve an award for the good deed you did! ❤");
            clo.dispose();

            Main third_award=new Main();
            third_award.changeScene("Award.fxml");
        }

        else{

            FileWriter clothw=new FileWriter("clothes.txt",true);
            clothw.write(clothe_name.getText()+"\t"+clothe_email.getText()+"\t"+tshirt_q.getText()+" "+shirt_q.getText()+" "+pant_q.getText()+" "+foot_q.getText()+" "+blan_q.getText()+"\n");
            clothw.close();

            JFrame clon=new JFrame();
            JOptionPane.showMessageDialog(clon,"💖Thank you for your contribution!!💖");
            clon.dispose();
            JFrame clo=new JFrame();
            JOptionPane.showMessageDialog(clo,"You will soon get connected with our organization's server.");
            clo.dispose();

            Main third=new Main();
            third.changeScene("LoggedIn.fxml");
        }
    }

    public void cloth_back(ActionEvent event)throws IOException{
        Main clb=new Main();
        clb.changeScene("LoggedIn.fxml");
    }
}
