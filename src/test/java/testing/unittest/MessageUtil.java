package testing.unittest;

public class MessageUtil {
  private String message;

  public MessageUtil(String message){
    this.message = message;
  }

  public String printMessage(){
    System.out.println(message);
    return message;
  }

  public static void deadLoop(){
    System.out.println("Inside testPrintMessage()");
    while(true);
  }
}
