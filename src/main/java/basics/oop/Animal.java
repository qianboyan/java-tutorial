package basics.oop;

public class Animal {

  public String name = "Animal";
  public boolean living = true;

  public String getName() {
    return name;
  }

  public void getThisName() {
    System.out.println(this.getName());
    System.out.println(this.name);
  }

  public void info(){
    System.out.println("this is animal class");
  }

}
