package open.projection;

import java.util.Arrays;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ExampleClient {

  @Autowired
  private EmployeeRepository repository;

  public void run() {
    List<Employee> employees = createEmployees();
    repository.saveAll(employees);

    System.out.println("----finding all employees----");
    Iterable<Employee> all = repository.findAll();
    all.forEach(System.out::println);

    System.out.println("---All EmployeeInfo-----");
    List<EmployeeInfo> list = repository.findBy();
    System.out.println("---Display strings-----");
    list.forEach(employeeInfo -> System.out.println(employeeInfo.getDisplayString()));
    System.out.println("----Deatial display strings-----");
    list.forEach(employeeInfo -> {
      String str = employeeInfo.getDetailedString("Employee", "Department");
      System.out.println(str);
    });
  }

  private List<Employee> createEmployees() {
    return Arrays.asList(
        Employee.of("Diana", Department.of("Admin", "NY"), 3000),
        Employee.of("Mike", Department.of("IT", "TX"), 35000),
        Employee.of("Rose", Department.of("Sales", "NC"), 4000),
        Employee.of("Sara", Department.of("Admin", "TX"), 3500),
        Employee.of("Joe", Department.of("IT", "TX"), 3000),
        Employee.of("Charlie", Department.of("IT", "NY"), 4500)
    ); 
  }

}
