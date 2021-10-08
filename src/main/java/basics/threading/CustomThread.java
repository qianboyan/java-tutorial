package basics.threading;

public class CustomThread extends Thread{
  String name;
  Integer counter;

  public CustomThread(String name, Integer counter) {
    this.name = name;
    this.counter = counter;
  }

  public void run() {
    System.out.println("Begin of the Thread" + name);
    synchronized (counter) {
      for (int i = 1; i < 10; i++) {
        try {
          Thread.sleep(100);
          System.out.println(counter++);
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
      }
      System.out.println("End of the Thread" + name);
    }
  }
}
