package src.day04l;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server 
{
    public static void main(String[] args) throws IOException 
    {

        ServerSocket server = new ServerSocket(3000);          // ServerSocket server = new ServerSocket(3000, 50, InetAddress.getByName("192.168.1.100")); 
                                                                    // 3000: The port number.
                                                                    //  50: The maximum queue length for incoming connection requests.
                                                                    // InetAddress.getByName("192.168.1.100"): The specific IP address the server should bind to.

        System.out.println("Server listening on port 3000.. Waiting for client to connect..");

        Socket socket = server.accept();

        System.out.println("Client connected on port 3000 on localhost");

       
        
    }
}
