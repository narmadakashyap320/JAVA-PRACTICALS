import java.net.*;
import java.io.*;

public class TCPClient {

    public static void main(String[] args) {

        try {
            Socket s = new Socket("localhost", 5000);

            BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in));

            PrintWriter out = new PrintWriter(
                s.getOutputStream(), true);

            BufferedReader in = new BufferedReader(
                new InputStreamReader(s.getInputStream()));

            System.out.print("Enter message: ");

            String msg = br.readLine();

            out.println(msg);

            System.out.println("Server: " + in.readLine());

            s.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
