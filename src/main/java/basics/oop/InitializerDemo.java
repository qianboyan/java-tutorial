package basics.oop;

public class InitializerDemo {
  {
    System.out.println("from instance init");
  }
  static {
    System.out.println("from static init");
  }
  InitializerDemo(){
    System.out.println("from constrcutor");
  }

}
