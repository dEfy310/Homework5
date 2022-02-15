package pro.sky.java.course2.homework5;

import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private final Set<Employee> employeeSet;

    public EmployeeServiceImpl() {
        employeeSet = new HashSet<>();
    }

    @Override
    public boolean addEmployee(String firstName, String lastName) {
        Employee employee = new Employee(firstName, lastName);
        return employeeSet.add(employee);
    }


    @Override
    public boolean removeEmployee(String firstName, String lastName) {
        Employee employee = new Employee(firstName, lastName);
        return employeeSet.remove(employee);
    }

    @Override
    public boolean findEmployee(String firstName, String lastName) {
        Employee employee = new Employee(firstName, lastName);
        return employeeSet.contains(employee);
    }

    @Override
    public Set<Employee> getEmployees() {
        return new HashSet<>(employeeSet);
    }
}
