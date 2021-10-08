package basics.reflection;

public class CustomerClass {
  public int id;
  public String name;
  public boolean status;
  private int salary;

  public CustomerClass() {
    this.id = 1;
    this.name = "Sam";
    this.status = true;
    this.salary = 50000;
  }

  public CustomerClass(int id) {
    this.id = id;
    this.name = "Sam";
    this.status = true;
    this.salary = 50000;
  }

  public CustomerClass(int id, String name, boolean status, int salary) {
    this.id = id;
    this.name = name;
    this.status = status;
    this.salary = salary;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public boolean isStatus() {
    return status;
  }

  public void setStatus(boolean status) {
    this.status = status;
  }

  public int getSalary() {
    return salary;
  }

  public void setSalary(int salary) {
    this.salary = salary;
  }
}
