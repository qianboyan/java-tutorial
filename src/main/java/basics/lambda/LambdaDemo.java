package basics.lambda;

import java.util.ArrayList;

public class LambdaDemo {

  public static void main(String[] args) {
    testFunctionalInterface();
    testMethodReference();

    testLambdaMatch((x, y)-> x + y);

  }

  public static void testFunctionalInterface() {
    ArrayList<Integer> numbers = new ArrayList<Integer>();
    numbers.add(1);
    numbers.add(4);
    numbers.add(5);
    numbers.forEach((n) -> {System.out.println(n*2);});

    Mathematik add = (a, b) -> a + b;
    Mathematik multi = (a, b) -> a * b;
    // Mathematik dummy = () -> 0;

    System.out.println(add.calculate(1, 2));
    System.out.println(multi.calculate(2, 2));
  }

  @FunctionalInterface
  interface Mathematik{
    int calculate(int x, int y);
  }

  public static void testMethodReference() {
    Mathematik calRef1 = Mathe::divide;
    calRef1.calculate(15, 5);
    Mathe mathe = new Mathe();
    Mathematik calRef2 = mathe::minus;
    calRef2.calculate(5, 4);
  }

  public static void testLambdaMatch(Mathematik mathematik) {
    System.out.println("inside testLambdaMatch");
  }
}
