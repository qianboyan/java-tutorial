package basics.enumeration;

public enum Level {
  HIGH (1),
  MEDIUM (2),
  LOW (3);

  private final int levelCode;

  final String info = "This is Level";

  private Level(int levelCode) {
    this.levelCode = levelCode;
  }

  public String getInfo() {
    return (this.info + this.levelCode);
  }
}
