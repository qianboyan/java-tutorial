package network.socket;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

  private ServerSocket server;

  public Server(int port) {
    try {
      server = new ServerSocket(port);
    } catch (IOException e) {
      e.printStackTrace();
    }

  }

  public void run() {
    while (true) {
      System.out.println("Waiting for client at" + server.getLocalPort());
      try {
        Socket client = server.accept();
        DataInputStream input = new DataInputStream(client.getInputStream());
        System.out.println(input.readUTF());
        DataOutputStream output = new DataOutputStream(client.getOutputStream());
        output.writeUTF("Greeting from server");
        client.close();
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
  }
}
