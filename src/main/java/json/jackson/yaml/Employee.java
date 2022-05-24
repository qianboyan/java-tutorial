package json.jackson.yaml;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Employee {

  private String name;
  private int wage;
  private String position;
  private List<Employee> colleagues;

  @Override
  public String toString() {
    return "\nName: " + name + "\nWage: " + wage + "\nPosition: " + position + "\nColleagues: " + colleagues + "\n";
  }
}
