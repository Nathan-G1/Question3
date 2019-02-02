import java.util.ArrayList;
import java.util.List;

/**
 * Nathan Getachew January 29, 2019
 * Composite Design pattern. For hierarchic structure in
 * a company and adding role and viewing salary and
 * subordinate salary.
 *
 */
public class Employee implements Company {
    public String name;
    public Double salary;
    public String department;

    public List<Employee> employees;
    public Employee(String name, Double salary, String department){
        this.name = name;
        this.salary = salary;
        this.department = department;
        employees = new ArrayList<Employee>();
    }

    @Override
    public Employee getEmployee(String n) {
        Employee employee2 = null;
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).getName() == n ){
                employee2 = employees.get(i);
            }
        }
        return employee2;
    }
    public void add(Employee employee){
        employees.add(employee);
    }
    public void remove(Employee employee){
        employee.remove(employee);
    }
    @Override
    public String department() {
        return department;
    }
    public List<Employee> getEmployees(){
        return employees;
    }
    public String toString(){
        return ("Employee :[ Name : " + name + ", dept : " + department + ", salary :" + salary+" ]");
    }
    @Override
    public String getName() {
        return name;
    }
    @Override
    public Double getSalary() {
        return salary;
    }
    @Override
    public Double getSubordinateSalary(){
        double sum = 0;
        for (int i = 0; i < employees.size(); ++i){
            sum = sum + employees.get(i).salary ;
        }
        return sum;
    }
}
