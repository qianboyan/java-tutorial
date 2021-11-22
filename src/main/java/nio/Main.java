package nio;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

class Main
{
  public static void main(String[] args)
  {
    File file = new File("test.bin");
    byte[] data = "Test".getBytes(StandardCharsets.UTF_8);

    try {
      FileUtils.writeByteArrayToFile(file, data);
      System.out.println("Successfully written data to the file");
    }
    catch (IOException e) {
      e.printStackTrace();
    }
  }
}