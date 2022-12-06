package praktica.task1;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args)  {
        LinkedList<Integer> integers = new LinkedList<>(Arrays.asList(
                1,2,3,4,5,6,7,8,9
        ));


        Collections.reverse(integers);
        integers.forEach(System.out::println);
    }
}
