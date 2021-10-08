package basics.oop;

public class Dog extends Animal{

  public String name = "dog";

  @Override
  public String getName() {
    return name;
  }

  public void info(){
    System.out.println("this is from dog class");
  }

}
