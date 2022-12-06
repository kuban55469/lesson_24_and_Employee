package praktica.task_slack;

import praktica.task_slack.classes.Employee;
import praktica.task_slack.classes.Phone;
import praktica.task_slack.enums.Gender;
import praktica.task_slack.sevises.EmployeeService;
import praktica.task_slack.sevises.impl.EmployeeServiceImpl;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /**
         * Employee деген класс тузунуз.
         * анын полелери {
         *     private String name;
         *     private BigDecimal money;
         *     private LocalDate localDate;
         *     private List<Phone> phones;
         *     private Gender gender;
         * }
         * Phone деген класс тузунуз анын полелери{
         *     private String name;
         *     private double memory;
         *     private BigDecimal price;
         *
         * }
         * EmployeeService деген интерфейс ачып анын ичине
         *
         *     String create(List<Employee> employees);
         *
         *     String removeEmployee(String name, List<Employee> employees);
         *
         *     List<Employee> findAll();
         *
         *     List<Employee> findByName(String name, List<Employee> employees);
         *
         *     void grouping(List<Employee> employees);
         *
         *     String removeEmployeeGender(String gender, List<Employee> employees);
         *
         *     void findPhoneEmployee(String phone, List<Employee> employees);
         *
         *     LocalDate getAge(Employee employee);
         *
         * ушундай методдору болсун
         * EmployeeServiceImpl деген класс ачып implements EmployeeService кылсын.
         * Логикасын жазып мейнден иштетиниз.
         */

        Phone phone1 = new Phone("Apple",512,BigDecimal.valueOf(70000));
        Phone phone3 = new Phone("Samsung",128,BigDecimal.valueOf(50000));

        Employee employeeService1 = new Employee("Kuban", BigDecimal.valueOf(40000), LocalDate.of(2002,10,10),
                new ArrayList<>(List.of(phone1)), Gender.MALE);
        Employee employeeService2 = new Employee("Jamila", BigDecimal.valueOf(50000), LocalDate.of(2000,1,19),
                new ArrayList<>(List.of(phone3)),Gender.FEMALE);
        Employee employeeService3 = new Employee("Asan", BigDecimal.valueOf(90000), LocalDate.of(1998,9,29),
                new ArrayList<>(List.of(phone1)),Gender.MALE);
        Employee employeeService4 = new Employee("Asel", BigDecimal.valueOf(70000), LocalDate.of(1993,2,8),
                new ArrayList<>(List.of(phone3)),Gender.FEMALE);
        List<Employee> employees = new ArrayList<>(List.of(employeeService1,employeeService2,employeeService3,employeeService4));

        EmployeeServiceImpl employeeService = new EmployeeServiceImpl();
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("""
                    Нажмите 1: Чтобы создать работников.
                    Нажмите 2: Чтобы удалить раболтника.
                    Нажмите 3: Чтобы группировать роды.
                    Нажмите 4: Чтобы найти по имени телефона.
                    Нажмите 5: Чтобы узнать возраст работника.
                    """);
            switch (scanner.nextInt()) {
                case 1 -> {
                    System.out.println(employeeService.create(employees));
                    System.out.println(employeeService.findAll());
                }
                case 2 -> {
                    Scanner scanner2 = new Scanner(System.in);
                    System.out.println("Введите имя: ");
                    String name = scanner2.nextLine();
                    System.out.println(employeeService.removeEmployee(name, employees));
                    System.out.println(employeeService.findAll());
                }
                case 3 -> employeeService.grouping(employees);
                case 4 -> employeeService.findPhoneEmployee("Apple", employees);
                case 5 -> System.out.println(employeeService.getAge(employeeService1));
                default -> System.out.println("Ошибка. Выввели не павильно!!");
            }
        }
    }
}
