//package sample;
//////
//////import javax.imageio.ImageIO;
//////import javax.swing.*;
//////import java.awt.*;
//////import java.awt.image.BufferedImage;
//////import java.io.BufferedInputStream;
//////import java.io.InputStream;
//////import java.net.ServerSocket;
//////import java.net.Socket;
//////
//////public class Server {
//////    public static void main(String[] args) {
//////        JFrame jFrame=new JFrame("SERVER");
//////        jFrame.setSize(500,500);
//////        jFrame.setDefaultCloseOperation(jFrame.EXIT_ON_CLOSE);
//////
//////
//////
//////        JLabel jLabelText=new JLabel("Waiting For Connection!!");
//////
//////        jFrame.add(jLabelText, BorderLayout.PAGE_END);
//////
//////        jFrame.setVisible(true);
//////
//////        ServerSocket serverSocket=new ServerSocket(1234);
//////
//////        Socket socket=serverSocket.accept();
//////
//////        InputStream inputStream=socket.getInputStream();
//////        BufferedInputStream bufferedInputStream=new BufferedInputStream(inputStream);
//////
//////        BufferedImage bufferedImage= ImageIO.read(bufferedInputStream);
//////
//////        bufferedInputStream.close();
//////        socket.close();
//////
//////        jLabelText.setText("Connection done!!");
//////    }
//////}
////
//
//
//
////
////import java.io.IOException;
////import java.net.ServerSocket;
////
////public class Server{
////    private ServerSocket serverSocket;
////    private int clientCount=0;
////
////    Server(){
////        try{
////            serverSocket=new ServerSocket(1234);
////            System.out.println("Server is Waiting!!");
////            serve(clientCount);
////
////        } catch (IOException | ClassNotFoundException e) {
////            e.printStackTrace();
////        }
////    }
////
////    private void serve(int clientCount) throws IOException,ClassNotFoundException {
////        clientCount++;
////        NetworkUtil networkUtil=new NetworkUtil(clientSocket);
////        new ReadThread(networkUtil);
////        new WriteThread(networkUtil,"Server");
////
////
////
////    }
////}
//
//
//import javax.swing.*;
//import java.awt.*;
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.io.PrintWriter;
//import java.net.ServerSocket;
//import java.net.Socket;
//import java.util.ArrayList;
//import java.util.concurrent.ExecutorService;
//import java.util.concurrent.Executors;
//
//public class Server{
//    private static String[] names={"Wasi","Raisa","Rivals","Hatred"};
//    private static String[] adjs={"Gentle","Un-Gentle","Overthinker","Manipulator"};
//    private static final int PORT=1212;
//
//    private static ArrayList<ClientHandler> clients=new ArrayList<>();
//    private static ExecutorService pool= Executors.newFixedThreadPool(4);
//
//    public static void main(String[] args) throws IOException {
//        ServerSocket listener=new ServerSocket(PORT);
//        JFrame jFrame=new JFrame("SERVER");
//        jFrame.setSize(400,400);
//        jFrame.setDefaultCloseOperation(jFrame.EXIT_ON_CLOSE);
//
//
//
//
//        JLabel jLabelText=new JLabel("Waiting For Connection!!");
//
//        jFrame.add(jLabelText, BorderLayout.PAGE_END);
//
//        jFrame.setVisible(true);
//
//        while(true) {
//
//
////            System.out.println("[SERVER] Waiting for client connection ...");
//            Socket client = listener.accept();
////            System.out.println("[SERVER] is connected to the client! ");
//
//            jLabelText.setText("Connected!!");
//
//            ClientHandler clientThread=new ClientHandler(client,clients);
//            clients.add(clientThread);
//            pool.execute(clientThread);
//        }
//
//
////        PrintWriter out=new PrintWriter(client.getOutputStream(),true);
////        BufferedReader in=new BufferedReader(new InputStreamReader(client.getInputStream()));
////
////
////        try{
////            while(true){
////                String request=in.readLine();
////                if(request.contains("name")){
////                    out.println(getRandomName());
////                }
////                else{
////                    out.println("Type 'tell me a name' to get a random name");
////                }
////            }
////        }
////        finally {
////            out.close();
////            in.close();
////        }
//    }
//
//
//
//    public static String getRandomName(){
//        String name=names[(int) (Math.random()*names.length)];
//        String adj=adjs[(int) (Math.random()*adjs.length)];
//        return name+" "+adj;
//    }
//}