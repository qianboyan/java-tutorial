package basics.threading;

public class Main {

  public static void main(String[] args) {
    Integer x = 0;

    CustomThread t1 = new CustomThread("thread1", x);
    CustomThread t2 = new CustomThread("thread2", x);

    t1.start();
    t2.start();

    try {
      t1.join();
      t2.join();
    } catch (InterruptedException e) {
      e.printStackTrace();
    }

    System.out.println("End of the main Thread");

  }

}
