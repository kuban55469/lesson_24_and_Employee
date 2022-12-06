package set;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Set<Student> students = new HashSet<>();
        students.add(new Student("Aigerim",17));
        students.add(new Student("Kuban",20));
        students.add(new Student("Kuban",20));
        students.add(new Student("Kuban",20));
        students.forEach(System.out::println);
    }
}