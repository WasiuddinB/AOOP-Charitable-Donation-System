//package sample;
//////
//////import javafx.scene.layout.Border;
//////
//////import javax.imageio.ImageIO;
//////import javax.swing.*;
//////import java.awt.*;
//////import java.awt.image.BufferedImage;
//////import java.io.BufferedOutputStream;
//////import java.io.IOException;
//////import java.io.OutputStream;
//////import java.net.Socket;
//////
//////public class Client {
//////    public static void main(String[] args) {
//////        try {
//////            Socket socket=new Socket("localhost",1234);
//////            System.out.println("Connected to Server!!");
//////
//////            JFrame jFrame=new JFrame("CLIENT");
//////            jFrame.setSize(500,500);
//////            jFrame.setDefaultCloseOperation(jFrame.EXIT_ON_CLOSE);
//////
//////            ImageIcon imageIcon=new ImageIcon("pathname")
//////
//////            JLabel jLabelExplain=new JLabel();
//////            JLabel jLabelPic=new JLabel();
//////
//////            jFrame.add(jLabelExplain,BorderLayout.PAGE_START);
//////            jFrame.add(jLabelPic, BorderLayout.CENTER);
//////
//////            jFrame.setVisible(true);
//////
//////            the things that will work under button
//////            try{
//////                OutputStream outputStream=socket.getOutputStream();
//////                BufferedOutputStream bufferedOutputStream=new BufferedOutputStream(outputStream);
//////
//////                Image image=imageIcon.getImage();
//////
//////                BufferedImage bufferedImage=new BufferedImage(image.getWidth(null),image.getHeight(null),BufferedImage.TYPE_INT_RGB);
//////
//////                Graphics graphics=bufferedImage.createGraphics();
//////                graphics.drawImage(image,0,0,null);
//////                graphics.dispose();
//////
//////                ImageIO.write(bufferedImage,"png",bufferedOutputStream);
//////
//////                bufferedOutputStream.close();
//////                socket.close();
//////
//////            } catch (IOException e) {
//////                e.printStackTrace();
//////            }
//////
//////
//////        } catch (IOException e) {
//////            e.printStackTrace();
//////        }
//////
//////
//////
//////    }
//////
//////}
////
//
//
//
////import java.io.IOException;
////import java.io.ObjectInputStream;
////import java.io.ObjectOutputStream;
////import java.net.Socket;
////
////public class Client{
////    public Client(String serverAddress,int serverPort()){
////        try{
////            Socket socket=new Socket(serverAddress,serverPort);
////            ObjectOutputStream cos=new ObjectOutputStream(socket.getOutputStream());
////            ObjectInputStream cis=new ObjectInputStream(socket.getInputStream());
////            String name="C";
////            cos.writeObject(name);
////        } catch (IOException e) {
////            e.printStackTrace();
////        }
////    }
////}
////
////    public static void main(String[] args) {
////
////    }
//
//import javax.swing.*;
//import java.awt.*;
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.io.PrintWriter;
//import java.net.Socket;
//
//public class Client{
//    private static final String SERVER_IP="127.0.0.1";
//    private static final int SERVER_PORT=1212;
//
//    public static void main(String[] args) throws IOException {
//        Socket socket=new Socket(SERVER_IP,SERVER_PORT);
//
//        ServerConnection serverConn=new ServerConnection(socket);
//
//
//
//
////        BufferedReader input=new BufferedReader(new InputStreamReader(socket.getInputStream()));
//
//
//        BufferedReader key=new BufferedReader(new InputStreamReader(System.in));
//        PrintWriter out=new PrintWriter(socket.getOutputStream(),true);
//
//        new Thread(serverConn).start();
////        JFrame jFrame=new JFrame("CLIENT");
////        jFrame.setSize(400,400);
////        jFrame.setDefaultCloseOperation(jFrame.EXIT_ON_CLOSE);
////
////        JLabel jLabelExplain=new JLabel();
////        jFrame.add(jLabelExplain, BorderLayout.PAGE_START);
////        jFrame.setVisible(true);
////
////        while(true){
//////            System.out.println("> ");
////            jLabelExplain.setText("Hello I am Client : ");
////            String command=key.readLine();
////
////            if(command.equals("quit")) break;
////
////            out.println(command);
////
//////            String serverResponse=input.readLine();
//////            System.out.println("Server Says: "+serverResponse);
////        }
//        socket.close();
//        System.exit(0);
//
//    }
//}