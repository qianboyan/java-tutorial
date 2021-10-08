package basics.timer;

import java.time.Clock;
import java.time.Duration;
import java.time.Instant;
import java.util.Timer;
import java.util.TimerTask;
import org.w3c.dom.ls.LSOutput;

public class TimerDemo {

  public static void main(String[] args) {
    Timer timer = new Timer();
    timer.scheduleAtFixedRate(new TimerTask() {
      @Override
      public void run() {
        System.out.println("From time task");
      }
    }, 2000, 2000);

    Clock clock = Clock.systemUTC();
    Instant start = clock.instant();
    System.out.println(start);
    try {
      Thread.sleep(1000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    Instant end = clock.instant();
    Duration timegap = Duration.between(start, end);
    System.out.println(timegap);
  }



}
