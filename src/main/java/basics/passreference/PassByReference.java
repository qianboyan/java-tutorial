package basics.passreference;

import java.util.ArrayList;

public class PassByReference {

  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>();
    list.add(0);
    addElement(list);
    System.out.println(list);

    String old = new String("this is something to be changed");
    String newOne = old.replaceAll("something", "somethingElse");
    System.out.println(old);
    System.out.println(newOne);
  }

  static public void addElement(final ArrayList<Integer> list){
    // list = new ArrayList<>();  // reference can not be changed
    list.add(1);
    list.add(2);
  }

}
