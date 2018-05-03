import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            String request = sc.nextLine();

            Socket sock = new Socket("127.0.0.1", 6868);
            PrintWriter writer = new PrintWriter(sock.getOutputStream(), true);
            writer.println(request);

            BufferedReader reader = new BufferedReader(new InputStreamReader(sock.getInputStream()));
            String response = reader.readLine();
            System.out.println(response);

            writer.close();
            reader.close();
            sock.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
