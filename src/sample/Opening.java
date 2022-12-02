package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import java.io.IOException;

public class Opening {

    @FXML
    private void get_btn(ActionEvent event) throws IOException{
        Main get=new Main();
        get.changeScene("confirmation_page.fxml");

    }

}
