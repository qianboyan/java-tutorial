package basics.oop;

public class Cat extends Animal{

  public String name = "cat";

  @Override
  public String getName() {
    return name;
  }

  public void info(){
    System.out.println("this is from cat class");
  }

}
