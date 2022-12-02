package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import java.io.IOException;

public class LoggedIn {

    @FXML
    private Button logout_btn;


    public void logout_page(ActionEvent event) throws IOException{
        Main mx=new Main();
        mx.changeScene("sample.fxml");
    }

    @FXML
    void blood_btn(ActionEvent event) throws IOException{
        Main bld=new Main();
        bld.changeScene("BloodOrg.fxml");

    }

    @FXML
    void clothes_btn(ActionEvent event) throws IOException{
        Main clo=new Main();
        clo.changeScene("ClothesOrg.fxml");

    }

    @FXML
    void food_btn(ActionEvent event) throws IOException {
        Main foo=new Main();
        foo.changeScene("FoodOrg.fxml");

    }

    @FXML
    void money_btn(ActionEvent event) throws IOException{
        Main mon=new Main();
        mon.changeScene("MoneyOrg.fxml");

    }

    @FXML
    void study_btn(ActionEvent event) throws IOException{
        Main stu=new Main();
        stu.changeScene("StudyOrg.fxml");

    }

    public void msg_admin(ActionEvent event)throws IOException{
        Main adms=new Main();
        adms.changeScene("Chatbox_1.fxml");
    }
}
