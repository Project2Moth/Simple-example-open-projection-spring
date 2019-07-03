package open.projection;

import org.springframework.beans.factory.annotation.Value;

public interface EmployeeInfo {

  @Value("#{target.name+' ('+ target.department.deptName+' dept)'}")
  String getDisplayString();

  @Value("#{args[0]+': '+target.name+', '+args[1]+': '+ "
      + "target.department.deptName+', '+target.department.location}")
  String getDetailedString(String labelName, String labelDept);
}
