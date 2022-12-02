package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import javax.swing.*;
import java.io.FileWriter;
import java.io.IOException;

public class FoodP {
    @FXML
    private TextField food_email;

    @FXML
    private TextField food_name;

    @FXML
    private TextField meat_q;

    @FXML
    private TextField oil_q;

    @FXML
    private TextField rice_q;

    @FXML
    private TextField spice_q;

    @FXML
    private TextField veg_q;

    @FXML
    private void food_done(ActionEvent event) throws IOException{

        if(Integer.parseInt(rice_q.getText())>=10 && Integer.parseInt(oil_q.getText())>=10 && Integer.parseInt(veg_q.getText())>=10 && Integer.parseInt(meat_q.getText())>=10 && Integer.parseInt(spice_q.getText())>=10){
            FileWriter foodw=new FileWriter("food.txt",true);
            foodw.write(food_name.getText()+"\t"+food_email.getText()+"\t"+rice_q.getText()+" "+oil_q.getText()+" "+veg_q.getText()+" "+meat_q.getText()+" "+spice_q.getText()+"\n");
            foodw.close();

            JFrame fonn=new JFrame();
            JOptionPane.showMessageDialog(fonn,"You are a big hearted person!! 💟");
            fonn.dispose();
            JFrame fo=new JFrame();
            JOptionPane.showMessageDialog(fo,"You Deserve an award for the good deed you did! ❤");
            fo.dispose();

            Main second_award=new Main();
            second_award.changeScene("Award.fxml");
        }
        else{
            FileWriter foodw=new FileWriter("food.txt",true);
            foodw.write(food_name.getText()+"\t"+food_email.getText()+"\t"+rice_q.getText()+" "+oil_q.getText()+" "+veg_q.getText()+" "+meat_q.getText()+" "+spice_q.getText()+"\n");
            foodw.close();

            JFrame fonn=new JFrame();
            JOptionPane.showMessageDialog(fonn,"💖Thank you for your contribution!!💖");
            fonn.dispose();
            JFrame fo=new JFrame();
            JOptionPane.showMessageDialog(fo,"You will soon get connected with our organization's server.");
            fo.dispose();

            Main second=new Main();
            second.changeScene("LoggedIn.fxml");
        }

    }
    public void food_back(ActionEvent event)throws IOException{
        Main flb=new Main();
        flb.changeScene("LoggedIn.fxml");
    }

}
