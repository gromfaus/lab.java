import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        try {
            ServerSocket serverSock = new ServerSocket(6868);

            while (true) {
                Socket sock = serverSock.accept();

                BufferedReader reader = new BufferedReader(new InputStreamReader(sock.getInputStream()));
                String phrase = reader.readLine();

                String response;
                if (phrase.equals("give me a handshake")) {
                    response = "here you are";
                } else {
                    response = "i don't understand you";
                }

                PrintWriter writer = new PrintWriter(sock.getOutputStream());
                writer.println(response);

                writer.close();
                reader.close();
                sock.close();
            }

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
