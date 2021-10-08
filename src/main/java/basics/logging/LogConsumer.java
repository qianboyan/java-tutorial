package basics.logging;

import java.util.logging.Logger;

public class LogConsumer {

  static private Logger log = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

  public static void main(String[] args) {
    LoggerDemo loggerDemo = new LoggerDemo();
    doSomething();
  }

  static public void doSomething(){
    log.info("Usual infos");
    log.severe("something bad");
    log.warning("this is warning");
    log.fine("i am good");
  }
}
