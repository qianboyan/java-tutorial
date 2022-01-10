package newfeature.records;

public class RecordsExample {
  public static void main(String[] args) {

    Vehicle vehicle = new Vehicle("Mercedes", "UX 1238 A95");

    System.out.println(vehicle.brand());
    System.out.println(vehicle.licensePlate());
    System.out.println(vehicle.toString());
    System.out.println(vehicle.brandAsLowerCase());
    System.out.println(vehicle.brandAsUpperCase());
  }

}
