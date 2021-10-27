package testing.mockito.calculator;

import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.atMost;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.inOrder;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.reset;
import static org.mockito.Mockito.timeout;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InOrder;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class MathApplicationTest {
  @InjectMocks
  MathApplication mathApplication = new MathApplication();

  @Mock
  CalculatorService calculatorService;

  @Test
  public void testAdd() {
    when(calculatorService.add(10.0,20.0)).thenReturn(30.00);
    when(calculatorService.subtract(20.0,10.0)).thenReturn(10.00);
    Assert.assertEquals(mathApplication.add(10.0, 20.0),30.0,0);
    Assert.assertEquals(mathApplication.subtract(20.0, 10.0),10.0,0);

    verify(calculatorService).add(10.0, 20.0);
    verify(calculatorService, times(1)).subtract(20.0, 10.0);
    verify(calculatorService, never()).multiply(10.0, 20.0);
    verify(calculatorService, atMost(3)).add(10.0,20.0);

    InOrder inOrder = inOrder(calculatorService);
    inOrder.verify(calculatorService).add(10.0, 20.0);
    inOrder.verify(calculatorService).subtract(20.0, 10.0);

    verify(calculatorService, timeout(100)).add(10.0, 20.0);
    reset(calculatorService);
    // Assert.assertEquals(mathApplication.add(10.0, 20.0),30.0,0); // will fail
  }

  @Test(expected = RuntimeException.class)
  public void testException() {
    doThrow(new RuntimeException("Divide operation not implemented"))
        .when(calculatorService).divide(10.0, 20.0);

    Assert.assertEquals(mathApplication.divide(10.0, 20.0),0.0,0);
  }

  @Test
  public void testBDD() {
    // Given
    given(calculatorService.add(20.0, 10.0)).willReturn(30.0);
    // When
    double result = calculatorService.add(20.0, 10.0);
    // Then
    Assert.assertEquals(result,30.0,0);
  }

}
