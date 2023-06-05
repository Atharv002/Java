import java.io.*;
import java.net.*;
public class TCPServer {
    public static void main(String[] args) {
        try {
            // Create a server socket and bind it to a specific port
            ServerSocket serverSocket = new ServerSocket(12345);
            System.out.println("Server started");
            
            Socket clientSocket = serverSocket.accept();
            System.out.println("Client connected");
            BufferedReader inFromClient = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            PrintWriter outToClient = new PrintWriter(clientSocket.getOutputStream(), true);
            
            String clientMessage = inFromClient.readLine();
            System.out.println("Received from client: " + clientMessage);
            String response = "Hello, client! Your message was: " + clientMessage;
            outToClient.println(response);
            
            // Close the connections
            inFromClient.close();
            outToClient.close();
            clientSocket.close();
            serverSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Error connecting to server");
        }
    }
}

