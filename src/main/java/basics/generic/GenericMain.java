package basics.generic;


/**
 * @author boyanqian
 * @version 1.0
 */
public class GenericMain {

  public static void main(String[] args) {
    Allgemein<Hund> dog = new Allgemein<>();
    dog.tier = new Hund();
    System.out.println(dog.tier);
    dog.tier.live();
    generic(new Katze());

    Integer[] intArray = { 1, 2, 3, 4, 5 };
    Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4 };
    Character[] charArray = { 'H', 'E', 'L', 'L', 'O' };
    printArray(intArray);
    printArray(doubleArray);
    printArray(charArray);
  }

  public static <T extends Tier> T generic(T t){
    t.live();
    return t;
  }

  /**
   * @param inputArray
   * @param <T>
   */
  public static <T> void printArray(T[] inputArray) {
    for(T element : inputArray) {
      System.out.printf("%s ", element);
    }
  }

}
