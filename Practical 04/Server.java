import java.net.*;
import java.io.*;

public class TCPServer {

    public static void main(String[] args) {

        try {
            ServerSocket ss = new ServerSocket(5000);

            System.out.println("Server started...");
            System.out.println("Waiting for client...");

            Socket s = ss.accept();

            System.out.println("Client connected");

            BufferedReader in = new BufferedReader(
                new InputStreamReader(s.getInputStream()));

            PrintWriter out = new PrintWriter(
                s.getOutputStream(), true);

            String message = in.readLine();

            System.out.println("Client: " + message);

            out.println("Message received by server");

            s.close();
            ss.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
              }
