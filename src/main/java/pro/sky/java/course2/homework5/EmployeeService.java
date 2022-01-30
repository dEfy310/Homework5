package pro.sky.java.course2.homework5;

import java.util.Set;

public interface EmployeeService {
    boolean addEmployee(String firstName, String lastName);

    boolean removeEmployee(String firstName, String lastName);

    boolean findEmployee(String firstName, String lastName);

    Set<Employee> getEmployeeList();
}
