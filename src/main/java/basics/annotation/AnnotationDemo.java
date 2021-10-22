package basics.annotation;

@MyAnnotation(value="123", age=37, newNames={"Jenkov", "Peterson"})
public class AnnotationDemo {

  public static void main(String[] args) {
    SomeAnnotation someAnnotation = new SomeAnnotation();
    someAnnotation.secondMethod();
  }

}
