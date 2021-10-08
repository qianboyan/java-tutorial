package network.socket;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class Client {

  public static void main(String[] args) {
    try {
      Socket client = new Socket("localhost", 8081);
      DataOutputStream output = new DataOutputStream(client.getOutputStream());
      output.writeUTF("this is from client at" + client.getLocalSocketAddress());
      DataInputStream input = new DataInputStream(client.getInputStream());
      System.out.println(input.readUTF());
      client.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

}
