package basics.enumeration;

import java.util.EnumMap;
import java.util.EnumSet;

public class EnumDemo {

  public static void main(String[] args) {
    Level level = Level.HIGH;
    Level level2 = Level.valueOf("HIGH");
    System.out.println(level);
    System.out.println(level2);
    System.out.println(level.getInfo());

    EnumSet<Level> enumSet = EnumSet.of(Level.HIGH, Level.MEDIUM);
    EnumMap<Level, String> enumMap = new EnumMap<Level, String>(Level.class);
    enumMap.put(Level.HIGH  , "High level");

  }
}
