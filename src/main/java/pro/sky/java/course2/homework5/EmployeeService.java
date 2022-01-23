package pro.sky.java.course2.homework5;

import java.util.Set;

public interface EmployeeService {
    boolean addEmployee(String item);

    boolean removeEmployee(String item);

    Set<String> getEmployeeList();
}
