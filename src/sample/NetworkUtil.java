//package sample;
//
//import java.io.IOException;
//import java.io.ObjectInputStream;
//import java.io.ObjectOutputStream;
//import java.net.Socket;
//
//public class NetworkUtil {
//    private Socket socket;
//    private ObjectOutputStream cos;
//    private ObjectInputStream cis;
//
//    public NetworkUtil(String s,int port)throws IOException{
//        this.socket=new Socket(s,port);
//        cos=new ObjectOutputStream(socket.getOutputStream());
//        cis=new ObjectInputStream(socket.getInputStream());
//    }
//    public Object read()throws IOException,ClassNotFoundException{
//        return cis.readUnshared();
//    }
//}
