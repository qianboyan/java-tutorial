package basics.optional;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalDemo {

  public static void main(String[] args) {
    String name = "Bruce Wayne";
    Optional<String> empty = Optional.empty();
    Optional<String> opt1 = Optional.of(name);
    String nullName = null;
    Optional<String> opt2 = Optional.ofNullable(nullName);
    opt1.ifPresent(n -> System.out.println(n.length()));

    Optional.ofNullable(nullName).orElse("john");
    Optional.ofNullable(nullName).orElseGet(() -> "john");

    Optional.ofNullable(name).orElse(getMyDefault());
    Optional.ofNullable(name).orElseGet(() -> {System.out.println("orElseGet"); return "orElseGet";});

    // filter()
    Integer year = 2021;
    Optional<Integer> yearOptional = Optional.of(year);
    boolean is2021 = yearOptional.filter(y -> y == 2020).isPresent();
    boolean is21Centry = yearOptional.filter(y -> y > 2020).filter(y -> y < 2100).isPresent();

    // map()
    List<String> companyNames = Arrays.asList(
        "paypal", "oracle", "", "microsoft", "", "apple");
    Optional<List<String>> listOptional = Optional.of(companyNames);
    int size = listOptional.map(List::size).orElse(0);
    System.out.println(listOptional.map(List::size));

    Optional.of(name).get();
    Optional.of(nullName).get();
    Optional.ofNullable(nullName).orElseThrow();
    Optional.ofNullable(nullName).orElseThrow(IllegalArgumentException::new);
  }

  public static String getMyDefault() {
    System.out.println("orElse");
    return "orElse";
  }

}
