package open.projection;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Employee {

  @Id
  @GeneratedValue
  private Integer id;
  private String name;
  @ManyToOne(cascade = CascadeType.ALL)
  private Department department;
  private int salary;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Department getDepartment() {
    return department;
  }

  public void setDepartment(Department department) {
    this.department = department;
  }

  public int getSalary() {
    return salary;
  }

  public void setSalary(int salary) {
    this.salary = salary;
  }

  public static Employee of(String name, Department dept, int salary) {
    Employee e = new Employee();
    e.setName(name);
    e.setDepartment(dept);
    e.setSalary(salary);
    return e;
  }

  @Override
  public String toString() {
    return "Employee{" +
        "id=" + id +
        ", name='" + name + '\'' +
        ", department=" + department +
        '}';
  }
}
