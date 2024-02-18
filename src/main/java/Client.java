import java.io.*;
import java.net.Socket;

public class Client {
    public static void main(String[] args) {

        try(Socket clientSocket = new Socket("localhost", Server.PORT);
            PrintWriter writer = new PrintWriter(clientSocket.getOutputStream(), true);
            BufferedReader reader = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()))){

            writer.println("Elena");
            System.out.println(reader.readLine());
        }catch (IOException e){
            throw new RuntimeException(e);
        }

    }
}
