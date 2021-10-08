package testing.unittest;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class UnitTestDemoTest {

  @Test
  public void shouldGiveHallo() throws Exception{
    String result = UnitTestDemo.run();
    Assertions.assertEquals("Hello", result);
  }

  @Test
  public void shouldAdd() throws Exception{
    int result = UnitTestDemo.add(1, 2);
    Assertions.assertEquals(3, result);
    Assertions.assertTrue(result == 3);
  }

  @Test
  public void shouldmulti() {
    Assertions.fail("not implemented");
  }
}