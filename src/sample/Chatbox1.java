package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.io.*;
import java.net.Socket;
import java.net.SocketException;


public class Chatbox1 {
    @FXML
    Button chat;

    @FXML
    TextField text_chat;

    @FXML
    TextArea chat_area;

    boolean isConnected=false;


    BufferedReader reader;
    BufferedWriter writer;

    public Chatbox1(){

    }


    @FXML
    void chat_btn(){
        if(!isConnected) {
            String txt = text_chat.getText();
            text_chat.clear();
            if(txt==null || txt.length()==0){
                chat_area.appendText("Not a Valid Name!"+"\n");
                return;
            }

            try {
                Socket sc = new Socket("127.0.0.1", 1234);
                OutputStreamWriter op=new OutputStreamWriter(sc.getOutputStream());
                writer=new BufferedWriter(op);

                writer.write(txt+"\n");
                writer.flush();

                InputStreamReader isr=new InputStreamReader(sc.getInputStream());
                reader=new BufferedReader(isr);

                Thread serverlistener=new Thread(){
                    @Override
                    public void run(){
                        while(true){
                            try {
                                String data=reader.readLine()+"\n";
                                chat_area.appendText(data);
                            }
                            catch(SocketException e){
                                chat_area.appendText("Connection Lost!\n");
                                break;
                            }
                            catch (IOException e) {
                                e.printStackTrace();
                            }
                        }
                    }
                };

                serverlistener.start();

                chat_area.appendText("Connection with the Server established."+"\n");
                chat.setText("Send");
                text_chat.setPromptText("Write your message!");
                isConnected=true;


            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        else{
            try {
                String msg = text_chat.getText();
                text_chat.clear();
                if (msg == null || msg.length() == 0) {
                    return;
                }
                writer.write(msg + "\n");
                writer.flush();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    public void goto_confirm(ActionEvent event)throws IOException{
        Main goback=new Main();
        goback.changeScene("confirmation_page.fxml");
    }

}
