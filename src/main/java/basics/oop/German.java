package basics.oop;

public class German implements Europer{
  public void sayHello(){
    System.out.println("i am from germany");
  }

  @Override
  public void sayEU() {
    System.out.println("EU in Brüssel");
  }

  @Override
  public void hasChild() {

  }
}
