import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;


public class SimpleServer {
    private ServerSocket serverSocket;
    private Socket socket;
    private PrintWriter out;
    private Scanner in;

    public SimpleServer(int port){
        serverSocket=new serverSocket(port);
    }
    public void acceptClient() throws Exception{
        socket=serverSocket.accept();
        in=new Scanner(socket.getInputStream());
        out=new PrintWriter(socket.getOutputStream());
    }
    public String receieveMessage(){
        return in.nextLine();
    }

    public void sendMessage(String msg){
        out.println(msg);

    }
    public void close() throws Exception{
        serverSocket.close();
        socket.close();
        in.close();
        out.close();
    }
    public static void main(String[] args) throws Exception{
        SimpleServer smp = new SimpleServer(9090);
        smp.acceptClient();
        while(true){
            smp.sendMessage(msg: "hello");
            Simple msg = smp.receiveMessage();
            System.out.print("Reply "+msg);
            if(msg.equals(anObject:"stop")){
                break;
            }
        }
    }
}
