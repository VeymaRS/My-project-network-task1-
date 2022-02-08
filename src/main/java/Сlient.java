import java.io.*;
import java.net.Socket;

public class Сlient {
    public static void main(String[] args) {
        String host = "127.0.0.1";
        int port = 8089;

        try(Socket clientSocket =new Socket(host, port);
            PrintWriter out =new
                    PrintWriter(clientSocket.getOutputStream(), true);
            BufferedReader in = new BufferedReader(new
                    InputStreamReader(clientSocket.getInputStream()))) {

            out.println("Vey");
            String readLine = in.readLine();
            System.out.println(readLine);

        } catch (IOException err) {
            err.printStackTrace();
        }
    }
}
