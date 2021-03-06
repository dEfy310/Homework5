package pro.sky.java.course2.homework5;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping(path = "/add")
    public boolean addEmployee(@RequestParam() String firstName, @RequestParam() String lastName) {
        return employeeService.addEmployee(firstName, lastName);
    }

    @GetMapping(path = "/remove")
    public boolean removeEmployee(@RequestParam() String firstName, @RequestParam() String lastName) {
        return employeeService.removeEmployee(firstName, lastName);
    }

    @GetMapping(path = "/find")
    public boolean findEmployee(@RequestParam() String firstName, @RequestParam() String lastName) {
        return employeeService.findEmployee(firstName, lastName);
    }

    @GetMapping
    public Set<Employee> getEmployeeList() {
        return employeeService.getEmployeeList();
    }
}
