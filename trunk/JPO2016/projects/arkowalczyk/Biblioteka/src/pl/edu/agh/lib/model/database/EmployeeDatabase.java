package pl.edu.agh.lib.model.database;

import pl.edu.agh.lib.model.Employee;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Arek on 2017-01-18.
 */
public class EmployeeDatabase {
    private List<Employee> employeeList;

    public EmployeeDatabase() {
        employeeList = new ArrayList<>();
    }

    public void addEmployee(Employee employee)   {
        employeeList.add(employee);
    }

    public List<Employee> getEmployeeList() { return employeeList;}
}
