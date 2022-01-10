package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ListDemo {

  public static void main(String[] args) {
    useBasicCollection();
    useTreeMap();
    useIterator();
    // iteratorException();
    useCustomerIterator();
    useCollections();
    useComparator();
    useSets();
    useMaps();
    useSteam();

  }

  public static void useBasicCollection() {
    Collection<Integer> collection = new LinkedList<>();
    collection.add(1);
    collection.add(2);
    System.out.println(collection);

    String a[] = new String[] { "A", "B", "C", "D" };
    List<String> list = Arrays.asList(a);
    // list.add("F"); // error
    List<String> list2 = new ArrayList<>();
    list2.addAll(list);
    list2.add("F");
    System.out.println(list2);
  }

  public static void useTreeMap() {
    TreeMap<String, String> tm = new TreeMap<>();
    tm.put("2", "Punkt zwei");
    tm.put("1", "Punkt eins");
    tm.put("3", "Punkt drei");
    System.out.println(tm);
  }

  public static void useIterator() {
    ArrayList<Integer> arrayList = new ArrayList<>();
    arrayList.add(1);
    arrayList.add(3);
    arrayList.add(1, 2);

    ListIterator<Integer> listIterator = arrayList.listIterator();
    while(listIterator.hasNext()) {
      System.out.println(listIterator.next());
    }
    while(listIterator.hasPrevious()) {
      System.out.println(listIterator.previous());
    }

    arrayList.forEach( (element) -> {System.out.println( element );});
  }

  public static void iteratorException() {
    List<String> list3 = new ArrayList<>();
    list3.add("123");
    list3.add("456");
    list3.add("789");
    Iterator<String> iterator = list3.iterator();

    while(iterator.hasNext()) {
      String value = iterator.next();
      if(value.equals("456")){
        list3.add("999");
      }
    }
  }

  public static void useCustomerIterator() {
    List<String> somelist = new ArrayList();
    somelist.add("one");
    somelist.add("two");
    somelist.add("three");
    MyListIterator<String> myIterator = new MyListIterator<String>(somelist);
    while(myIterator.hasNext()) {
      System.out.println( myIterator.next() );
    }
  }

  public static void useCollections() {
    List<String> list = new ArrayList<>();
    Collections.addAll(list, "element 1", "element 2", "element 3");
    Collections.sort(list);
    int index = Collections.binarySearch(list, "element 2");
    Collections.shuffle(list);
    Collections.replaceAll(list, "element 1", "element 4");
    System.out.println(list);
  }

  public static void useSets() {
    Set<String> set1 = Set.of("val1", "val2", "val3");
    // set1.add("val4");
    System.out.println(set1);
  }

  public static void useMaps() {
    Map<String, String> map = new HashMap<>();
    map.put("A", "a");
    map.put("B", "b");
    map.put("C", "c");

    Set<Map.Entry<String, String>> entries = map.entrySet();
    Iterator<Map.Entry<String, String>> iterator = entries.iterator();

    while(iterator.hasNext()) {
      Map.Entry<String, String> entry = iterator.next();
      String key   = entry.getKey();
      String value = entry.getValue();
    }

    map.compute("A", (key, value) -> value == null ? null : value.toString().toUpperCase());
    System.out.println(map.get("A"));
  }

  public static void useComparator() {
    List<Car> list = new ArrayList<>();

    list.add(new Car("Volvo V40" , "XYZ 201845", 5));
    list.add(new Car("Citroen C1", "ABC 164521", 4));
    list.add(new Car("Dodge Ram" , "KLM 845990", 2));

    Comparator<Car> carBrandComparator = new Comparator<Car>() {
      @Override
      public int compare(Car car1, Car car2) {
        return car1.brand.compareTo(car2.brand);
      }
    };

    Comparator<Car> carBrandComparatorLambda =
        (car1, car2) -> car1.brand.compareTo(car2.brand);

    Comparator<Car> carNumberPlatComparatorLambda =
        (car1, car2) -> car1.numberPlate.compareTo(car2.numberPlate);

    Comparator<Car> carNoOfDoorsComparatorLambda  =
        (car1, car2) -> car1.noOfDoors - car2.noOfDoors;

    Collections.sort(list, carBrandComparatorLambda);
    Collections.sort(list, carNumberPlatComparatorLambda);
    Collections.sort(list, carNoOfDoorsComparatorLambda);

    Collections.sort(list, carBrandComparator);
  }

  public static void useSteam() {
    List<String> stringList = new ArrayList<String>();

    stringList.add("one");
    stringList.add("two");
    stringList.add("three");

    Stream<String> stream = stringList.stream();
    // stream.forEach( element -> { System.out.println(element); });
    // stream.map(item -> item.toUpperCase());
    List<String> list2 = stream.map(item -> item.toUpperCase()).collect(Collectors.toList());
    System.out.println(list2);
    String shortest = stringList.stream()
        .min(Comparator.comparing(item -> item.length())).get();
    System.out.println(shortest);
  }

}
