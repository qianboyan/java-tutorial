package lombok;

public class FirstEntry {

  public static void main(String[] args) {
    User myuser = new User("Tom", 50000L, 7);
    System.out.println(myuser.getSalary());
    User.builder().name("Jerry").salary(60000L).id(8);
    System.out.println("you are in the first entry class");
  }

}
