package open.projection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Department {

  @Id
  @GeneratedValue
  private Integer id;
  private String deptName;
  private String location;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getDeptName() {
    return deptName;
  }

  public void setDeptName(String deptName) {
    this.deptName = deptName;
  }

  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  public static Department of(String name, String location) {
    Department department = new Department();
    department.setDeptName(name);
    department.setLocation(location);
    return department;
  }

  @Override
  public String toString() {
    return "Department{" +
        "id=" + id +
        ", deptName='" + deptName + '\'' +
        ", location='" + location + '\'' +
        '}';
  }
}
