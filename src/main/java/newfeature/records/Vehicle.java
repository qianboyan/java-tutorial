package newfeature.records;

public record Vehicle(String brand, String licensePlate) {

  public Vehicle(String brand) {
    this(brand, null);
  }

  public String brandAsLowerCase() {
    return brand().toLowerCase();
  }

  public String brandAsUpperCase() {
    return brand.toUpperCase();
  }
}

