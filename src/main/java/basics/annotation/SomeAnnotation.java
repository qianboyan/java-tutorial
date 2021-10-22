package basics.annotation;

public class SomeAnnotation {
  public void firstMethod(){
    System.out.println("first Method");
  }

  @Deprecated
  public void secondMethod(){
    System.out.println("second method");
  }

  @SuppressWarnings("all")
  public void thirdMethod(){
    System.out.println("third method");
  }

}
