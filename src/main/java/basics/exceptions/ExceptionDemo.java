package basics.exceptions;

public class ExceptionDemo {

  public static void main(String[] args) {
    try {
      doMath(-2);
    } catch (CustomerException e) {
      String erroMsg = e.getMessage();
      System.out.println(erroMsg);
    }
  }

  public static int doMath(int x) throws CustomerException{
    if (x < 0) {
      throw new CustomerException();
    } else {
      return x;
    }
  }

}
