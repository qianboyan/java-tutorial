package testing.unittest;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class PrimeNumberCheckerTest {
  private Integer inputNumber;
  private Boolean expectedResult;

  public PrimeNumberCheckerTest(Integer inputNumber, Boolean expectedResult) {
    this.inputNumber = inputNumber;
    this.expectedResult = expectedResult;
  }

  @Parameterized.Parameters
  public static Collection primeNumbers() {
    return Arrays.asList(new Object[][] {
        { 2, true }, { 6, false }, { 22, false }
    });
  }

  @Test
  public void testPrimeNumberChecker() {
    System.out.println("Parameterized Number is : " + inputNumber);
    assertEquals(expectedResult, validatePrimeNumber(inputNumber));
  }

  public Boolean validatePrimeNumber(final Integer primeNumber) {
    for (int i = 2; i < (primeNumber / 2); i++) {
      if (primeNumber % i == 0) {
        return false;
      }
    }
    return true;
  }

}
