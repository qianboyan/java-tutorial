package testing.unittest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TestJUnit {
  String message = "Hello World";
  MessageUtil messageUtil = new MessageUtil(message);
  int num = 5;
  String temp = null;

  String str1 = new String ("abc");
  String str3 = null;
  String str4 = "abc";
  String str5 = "abc";

  @Test
  public void testPrintMessage() {
    assertEquals(message, messageUtil.printMessage());
  }

  @Test
  public void usingAsserts() {
    assertEquals(num, num);
    assertFalse(num > 6);
    assertTrue(num > 4);
    assertNull(temp);
    assertNotNull(num);
    assertSame(str4, str5);
    assertNotSame(str1, str3);
  }

  @Test
  public void testFailedMessage() {
    assertEquals("Hallo Welt", messageUtil.printMessage());
  }

}
