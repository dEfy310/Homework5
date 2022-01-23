package pro.sky.java.course2.homework5;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

@RestController
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping(path = "/post/employee-list/")
    public boolean addEmployee(@RequestParam("people") String people) {
        return employeeService.addEmployee(people);
    }

    @GetMapping(path = "/delete/employee-list/")
    public boolean removeEmployee(@RequestParam("people") String people) {
        return employeeService.removeEmployee(people);
    }

    @GetMapping(path = "/get/employee-list/")
    public Set<String> getEmployeeList() {
        return employeeService.getEmployeeList();
    }
}
