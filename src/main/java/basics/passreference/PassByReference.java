package basics.passreference;

import java.util.ArrayList;

public class PassByReference {

  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>();
    addElement(list);
    System.out.println(list);
  }

  static public void addElement(final ArrayList<Integer> list){
    list.add(1);
    list.add(2);
  }

}
