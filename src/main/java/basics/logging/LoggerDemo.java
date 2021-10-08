package basics.logging;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LoggerDemo {

  public LoggerDemo() {
    Logger root = Logger.getLogger("");
    try {
      FileHandler handler = new FileHandler("./src/main/java/basics/logging/log.txt");
      root.addHandler(handler);
    } catch (IOException e) {
      e.printStackTrace();
    }
    root.setLevel(Level.ALL);
  }
}
