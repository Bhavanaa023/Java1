package cubeclient;
import java.io.*;
import java.net.*;
import java.util.Scanner;
public class CubeClient {
    public static void main(String[] args) {
        try {
            // Connect to server on localhost and port 5000
            Socket socket = new Socket("localhost", 5000);
            System.out.println("Connected to server.");
            // Create streams for communication
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            // Ask user to enter a number
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a number: ");
            int number = sc.nextInt();
            // Send number to server
            out.println(number);
            // Receive cube from server
            String cube = in.readLine();
            System.out.println("Cube of the number received from server: " + cube);
            // Close connections
            sc.close();
            in.close();
            out.close();
            socket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
