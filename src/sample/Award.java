package sample;

import javafx.event.ActionEvent;

import java.io.IOException;

public class Award {

    public void cng_btn(ActionEvent event)throws IOException{
        Main goback=new Main();
        goback.changeScene("LoggedIn.fxml");
    }
}
