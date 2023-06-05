import java.io.*;
import java.net.*;

public class TCPClient {
    public static void main(String[] args) {
        try {
            // Create a socket and connect to the server
            Socket clientSocket = new Socket("localhost", 12345);
            System.out.println("Connected to server.");
            BufferedReader inFromServer = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            PrintWriter outToServer = new PrintWriter(clientSocket.getOutputStream(), true);
            
            // Send data to the server
            String message = "Hello, server!";
            outToServer.println(message);
            String serverResponse = inFromServer.readLine();
            System.out.println("Received from server: " + serverResponse);
            
            // Close the connections
            inFromServer.close();
            outToServer.close();
            clientSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

