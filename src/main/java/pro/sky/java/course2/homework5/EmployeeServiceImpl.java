package pro.sky.java.course2.homework5;

import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private final Set<String> employeeSet;

    public EmployeeServiceImpl() {
        employeeSet = new HashSet<>();
    }

    @Override
    public boolean addEmployee(String people) {
        return employeeSet.add(people);
    }

    @Override
    public boolean removeEmployee(String people) {
        return employeeSet.remove(people);
    }

    @Override
    public Set<String> getEmployeeList() {
        return employeeSet;
    }
}
