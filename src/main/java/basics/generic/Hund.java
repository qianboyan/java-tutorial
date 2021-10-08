package basics.generic;

public class Hund extends Tier{
  private boolean owner;

  public boolean isOwner() {
    return owner;
  }

  public void setOwner(boolean owner) {
    this.owner = owner;
  }

  @Override
  public void live(){
    System.out.println("this dog lives");
  }

}
