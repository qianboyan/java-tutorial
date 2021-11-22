package basics.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeMap;

public class ListDemo {

  public static void main(String[] args) {
    TreeMap<String, String> tm = new TreeMap<>();
    tm.put("2", "Punkt zwei");
    tm.put("1", "Punkt eins");
    tm.put("3", "Punkt drei");
    System.out.println(tm);

    ArrayList<Integer> arrayList = new ArrayList<>();
    arrayList.add(1);
    arrayList.add(3);
    arrayList.add(1, 2);
    System.out.println(arrayList);

    Collection<Integer> collection = new LinkedList<>();
    collection.add(1);
    collection.add(2);
    System.out.println(collection);

    String a[] = new String[] { "A", "B", "C", "D" };
    List<String> list = Arrays.asList(a);
    List<String> list2 = new ArrayList<>();
    list2.addAll(list);
    list2.add("F");
    System.out.println(list2);
  }

}
