package basics.oop;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class OOPDemo {

  public static void main(String[] args) {
    ArrayList<Animal> animals = new ArrayList<>();
    animals.add(new Animal());
    animals.add(new Dog());
    animals.add(new Cat());
    animals.add(new Fish());
    for (int i = 0; i < animals.size(); i++) {
      animals.get(i).info();
      System.out.println("direct calling class attribut: " + animals.get(i).name);
      System.out.println("calling using getter: " + animals.get(i).getName());
      animals.get(i).getThisName();
      System.out.println("***********");
    }

    System.out.println(Person.race);
    Europer french = new Europer() {
      @Override
      public void sayEU() {
        System.out.println("EU in Brüssel");
      }

      @Override
      public void hasChild() {
        System.out.println("No Child");
      }

      @Override
      public void sayHello() {
        System.out.println("Hi");
      }
    };
    french.sayEU();

    Map<String, String> map = new HashMap();
    System.out.println(map instanceof Map);

    InitializerDemo init1 = new InitializerDemo();
    InitializerDemo init2 = new InitializerDemo();

  }

}
