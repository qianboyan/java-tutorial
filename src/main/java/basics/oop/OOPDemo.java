package basics.oop;

import java.util.ArrayList;

public class OOPDemo {

  public static void main(String[] args) {
    ArrayList<Animal> animals = new ArrayList<>();
    animals.add(new Animal());
    animals.add(new Dog());
    animals.add(new Cat());
    animals.add(new Fish());
    for (int i = 0; i < animals.size(); i++) {
      animals.get(i).info();
      System.out.println(animals.get(i).name);
      System.out.println(animals.get(i).getName()); // still animal
      System.out.println("***");
      animals.get(i).getThisName();
      System.out.println("***");
    }

    InitializerDemo init1 = new InitializerDemo();
    InitializerDemo init2 = new InitializerDemo();

  }

}
