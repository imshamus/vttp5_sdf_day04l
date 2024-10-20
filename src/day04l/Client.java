package src.day04l;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client 
{
    public static void main(String[] args) throws UnknownHostException, IOException 
    {
        Socket socket = new Socket("localhost", 3000);
        
        System.out.println("Connected to port 3000 on localhost.");

    finally 
    {
        // This block ALWAYS runs, whether an exception occurs or not
        try {
                socket.close();  // Close the socket manually
            }
         
        catch (Exception e) 
        {
            System.out.println("Error closing socket: " + e.getMessage());
        }
    }

    }
}
