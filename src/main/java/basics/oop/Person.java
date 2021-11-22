package basics.oop;

public interface Person {
  public String race = "Mankind";
  public void sayHello();

  default public void sayHi() {
    System.out.println("this is from default Methode");
  }

  public static void print(String text){
    System.out.print(text);
  }
}
