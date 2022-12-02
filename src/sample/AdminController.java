package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;

import javax.swing.*;
import java.io.*;
import java.util.Scanner;

public class AdminController {
    @FXML
    private TextArea blood_ta;

    @FXML
    private TextArea clothes_ta;

    @FXML
    private TextArea food_ta;

    @FXML
    private TextArea money_ta;

    @FXML
    private TextArea study_ta;

    public void show_one(ActionEvent event)throws IOException{

        File show_one=new File("money.txt");
        try{
            Scanner input1=new Scanner(show_one);
            while(input1.hasNext()){
                money_ta.appendText(input1.nextLine());
                money_ta.appendText("\n");
            }
            input1.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void show_two(ActionEvent event)throws IOException{

        File show_two=new File("food.txt");
        try{
            Scanner input2=new Scanner(show_two);
            while(input2.hasNext()){
                food_ta.appendText(input2.nextLine());
                food_ta.appendText("\n");
            }
            input2.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void show_three(ActionEvent event)throws IOException{

        File show_three=new File("clothes.txt");
        try{
            Scanner input3=new Scanner(show_three);
            while(input3.hasNext()){
                clothes_ta.appendText(input3.nextLine());
                clothes_ta.appendText("\n");
            }
            input3.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void show_four(ActionEvent event)throws IOException{

        File show_four=new File("blood.txt");
        try{
            Scanner input4=new Scanner(show_four);
            while(input4.hasNext()){
                blood_ta.appendText(input4.nextLine());
                blood_ta.appendText("\n");
            }
            input4.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void show_fifth(ActionEvent event)throws IOException{

        File show_five=new File("study.txt");
        try{
            Scanner input5=new Scanner(show_five);
            while(input5.hasNext()){
                study_ta.appendText(input5.nextLine());
                study_ta.appendText("\n");
            }
            input5.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void logout_btn(ActionEvent event)throws IOException{
        Main back=new Main();
        back.changeScene("confirmation_page.fxml");
    }

    public void msg_client(ActionEvent event)throws IOException{
        Main msgs=new Main();
        msgs.changeScene("Chatbox_1.fxml");
    }
}
