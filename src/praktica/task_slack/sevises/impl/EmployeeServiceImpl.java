package praktica.task_slack.sevises.impl;

import praktica.task_slack.classes.Employee;
import praktica.task_slack.classes.Phone;
import praktica.task_slack.enums.Gender;
import praktica.task_slack.sevises.EmployeeService;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

public class EmployeeServiceImpl implements EmployeeService {

    List<Employee> employee = new ArrayList<>();
    @Override
    public String create(List<Employee> employees) {
        this.employee.addAll(employees);
        return "Employees created successfully!!";
    }

    @Override
    public String removeEmployee(String name, List<Employee> employees) {

        boolean isRemoved = this.employee.removeIf(employee1 -> employee1.getName().equals(name));
        return isRemoved ? "Employee (" + name + ") is Removed successfully!" : "REMOVED FILED : INVALID NAME";
    }


    @Override
    public List<Employee> findAll() {
        return this.employee;
    }

    @Override
    public List<Employee> findByName(String name, List<Employee> employees) {
        List<Employee> results = new ArrayList<>();
        for (Employee employee1 : employees) {
            if (employee1.getName().equals(name))
                results.add(employee1);
        }
        return results;
    }

    @Override
    public void grouping(List<Employee> employees) {
        List<Employee> males = new ArrayList<>();
        List<Employee> females = new ArrayList<>();
        for (Employee employee1 : employees) {
            if (employee1.getGender().equals(Gender.FEMALE)){
                females.add(employee1);
            }else {
                males.add(employee1);
            }
        }
        System.out.println("Male: " + males);
        System.out.println("Female: " + females);
    }

    @Override
    public String removeEmployeeGender(String gender, List<Employee> employees) {
        boolean isRemoved = employee.removeIf(employee1 -> employee1.getGender().name().equals(gender.toUpperCase()));
        return isRemoved ? "Employees who's gender are("+gender+") REMOVED successfully!" : "REMOVED FILED : INVALID GENDER!";
    }

    @Override
    public void findPhoneEmployee(String phone, List<Employee> employees) {
        for (Employee employee1 : employees) {
            for (Phone employee1Phone : employee1.getPhones()) {
                if (employee1Phone.getName().equals(phone))
                    System.out.println(employee1);
            }
        }

    }

    @Override
    public int getAge(Employee employee) {
        return Period.between(employee.getDeyOfBrith(), LocalDate.now()).getYears();
    }
}
