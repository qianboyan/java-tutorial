package nio;

import java.io.FileInputStream;
import java.io.InputStream;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import org.apache.commons.io.IOUtils;

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

    try{
      InputStream inputStream = new FileInputStream("TTVI_CO_VkmsRegisterAndPairingRequest_v1.pb.bin");
      byte[] bytes = IOUtils.toByteArray(inputStream);
      String content = new String(bytes, StandardCharsets.UTF_8);
      System.out.println(content);
    } catch (IOException e) {
      e.printStackTrace();
    }

  }
}