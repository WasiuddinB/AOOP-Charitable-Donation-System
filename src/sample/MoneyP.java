package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import javax.swing.*;
import java.io.FileWriter;
import java.io.IOException;


public class MoneyP {

    @FXML
    private TextField money_amount;

    @FXML
    private TextField money_email;

    @FXML
    private TextField money_name;


    @FXML
    private void Done_btn(ActionEvent event) throws IOException {

        if(Integer.parseInt(money_amount.getText())<50000){
            FileWriter mw= new FileWriter("money.txt",true);
            mw.write(money_name.getText()+"\t"+money_email.getText()+"\t"+money_amount.getText()+"\n");
            mw.close();

            JFrame monn=new JFrame();
            JOptionPane.showMessageDialog(monn,"Thank you for your contribution!!");
            monn.dispose();
            JFrame mo=new JFrame();
            JOptionPane.showMessageDialog(mo,"You will soon get connected with our organization's server.");
            mo.dispose();

            Main first=new Main();
            first.changeScene("LoggedIn.fxml");

        }

        else if(Integer.parseInt(money_amount.getText())>=50000){

            FileWriter mw= new FileWriter("money.txt",true);
            mw.write(money_name.getText()+"\t"+money_email.getText()+"\t"+money_amount.getText()+"\n");
            mw.close();

            JFrame monn=new JFrame();
            JOptionPane.showMessageDialog(monn,"You are a big hearted person!! 💟");
            monn.dispose();
            JFrame mo=new JFrame();
            JOptionPane.showMessageDialog(mo,"You Deserve an award for the good deed you did! 🏆");
            mo.dispose();

            Main first_award =new Main();
            first_award.changeScene("Award.fxml");

        }




    }

    public void money_back(ActionEvent event)throws IOException{
        Main mlb=new Main();
        mlb.changeScene("LoggedIn.fxml");
    }
}
