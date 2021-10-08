package basics.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionDemo {

  public static void main(String[] args) {
    CustomerClass obj = new CustomerClass();
    Class ref = CustomerClass.class;
    Class ref2 = obj.getClass();

    System.out.println(ref.getName());
    System.out.println(ref2.getName());
    System.out.println(ref.getSimpleName());
    System.out.println(ref.getPackage());

    Constructor[] constructors = ref.getConstructors();
    Constructor constructor = null;
    try {
      constructor = ref.getConstructor(int.class);
    } catch (NoSuchMethodException e) {
      e.printStackTrace();
    }
    System.out.println(constructors.length);
    System.out.println(constructor);

    Field[] members = ref.getFields();
    System.out.println(members.length);
    System.out.println(members[0].getName());
    System.out.println(members[0].getType().toString());

    Method[] methods = ref.getMethods();
    System.out.println(methods.length);
    System.out.println(methods[3].getName());
    Class[] params = methods[3].getParameterTypes();
    // System.out.println(params[0].getName());

    Field[] allmembers = ref.getDeclaredFields();
    System.out.println(allmembers.length);
    try {
      Field id = ref.getDeclaredField("id");
    } catch (NoSuchFieldException e) {
      e.printStackTrace();
    }
    Method[] allmethods = ref.getDeclaredMethods();
  }

}
