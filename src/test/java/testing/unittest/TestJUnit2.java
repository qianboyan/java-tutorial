package testing.unittest;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTimeout;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import junit.framework.TestCase;
import org.junit.Test;

public class TestJUnit2 extends TestCase {
  @Test
  public void testCaseMethods() {
    String name = this.getName();
    System.out.println("Test Case Name = "+ name);
    System.out.println("No of Test Case = "+ this.countTestCases());
  }

  @Test
  public void testExpectedException() {
    assertThrows(NumberFormatException.class, () -> {
      Integer.parseInt("One");
    });
  }

  @Test
  public void test_timeout_fail() {
    assertTimeout(Duration.ofSeconds(5), () -> delaySecond(2));
  }

  public void delaySecond(int second) {
    try {
      TimeUnit.SECONDS.sleep(second);
    } catch (InterruptedException e) {
    }
  }

}
