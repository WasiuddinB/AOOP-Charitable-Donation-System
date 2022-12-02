import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class MyServer {
    public static void main(String[] args){
        try {
            System.out.println("Server is waiting for connection.");
            ServerSocket serverSocket = new ServerSocket(1234);

            while(true) {
                Socket sc = serverSocket.accept();
                ClientOne clientOne=new ClientOne(sc);
                Thread t=new Thread(clientOne);
                t.start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
