package praktica.task_slack.classes;

import praktica.task_slack.enums.Gender;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

public class Employee {
    private String name;
    private BigDecimal money;
    private LocalDate deyOfBrith;
    private List<Phone> phones;
    private Gender gender;

    public Employee(String name, BigDecimal money, LocalDate deyOfBrith, List<Phone> phones, Gender gender) {
        this.name = name;
        this.money = money;
        this.deyOfBrith = deyOfBrith;
        this.phones = phones;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    public LocalDate getDeyOfBrith() {
        return deyOfBrith;
    }

    public void setDeyOfBrith(LocalDate deyOfBrith) {
        this.deyOfBrith = deyOfBrith;
    }

    public List<Phone> getPhones() {
        return phones;
    }

    public void setPhones(List<Phone> phones) {
        this.phones = phones;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "\nEmployee " +
                "\nname: " + name +
                "\nmoney: " + money +
                "\ndey Of Brith: " + deyOfBrith +
                "\nphones: " + phones +
                "\ngender: " + gender +
                "\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~";
    }


}
