package testing.mockito.calculator;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


public class MathApplicationTestV2 {

  public static void main(String[] args) {
    MathApplication mathApplication = new MathApplication();
    CalculatorService calculatorService = mock(CalculatorService.class);

    mathApplication.setCalculatorService(calculatorService);

    when(calculatorService.add(10.0,20.0)).thenReturn(30.00);
    System.out.println(mathApplication.add(10.0, 20.0));
  }

}
