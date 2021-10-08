package basics.oop;

public class Fish extends Animal{

  public String name = "fish";

  @Override
  public String getName() {
    return name;
  }

  public void info(){
    System.out.println("this is from fish class");
  }

}
