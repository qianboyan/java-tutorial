package json.jackson.yaml;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class YAMLTest {

  public static void main(String[] args) throws IOException {
    ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
    File file = new File(classLoader.getResource("person.yaml").getFile());

    ObjectMapper objectMapper = new ObjectMapper(new YAMLFactory());
    Employee employee = objectMapper.readValue(file, Employee.class);

    System.out.println("Employee info " + employee.toString());
    System.out.println("Accessing first element: " + employee.getColleagues().get(0).toString());

    writeYaml();

  }

  public static void writeYaml() throws IOException {
    List<Employee> colleagues = new ArrayList<Employee>();

    colleagues.add(new Employee("Mary", 1800, "Developer", null));
    colleagues.add(new Employee("Jane", 1200, "Developer", null));
    colleagues.add(new Employee("Tim", 1600, "Developer", null));
    colleagues.add(new Employee("Vladimir", 1000, "Developer", null));

    Employee employee = new Employee("David", 1500, "Developer", colleagues);

    ObjectMapper objectMapper = new ObjectMapper(new YAMLFactory());
    ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
    objectMapper.writeValue(new File(classLoader.getResource("person2.yaml").getFile()), employee);
  }

}
