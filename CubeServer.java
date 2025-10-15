package cubeserver;
import java.io.*;
import java.net.*;
public class CubeServer {
    public static void main(String[] args) {
        try {
            // Create a server socket on port 5000
            ServerSocket serverSocket = new ServerSocket(5000);
            System.out.println("Server started. Waiting for client...");
            // Accept client connection
            Socket socket = serverSocket.accept();
            System.out.println("Client connected.");
            // Input stream to receive data from client
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            // Output stream to send data to client
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            // Read number sent by client
            String numStr = in.readLine();
            int number = Integer.parseInt(numStr);
            System.out.println("Received number from client: " + number);
            // Calculate cube
            int cube = number * number * number;
            // Send cube back to client
            out.println(cube);
            System.out.println("Sent cube back to client: " + cube);
            // Close connections
            in.close();
            out.close();
            socket.close();
            serverSocket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
    
