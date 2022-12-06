package praktica.task5;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        /**
         *
         */
        TreeSet<Integer> integers = new TreeSet<>(Set.of(
                6,4,9,3,5,7,8,34,23,66,44,63
        ));
        System.out.println(integers);
        System.out.println(integers.descendingSet());


        LinkedList<Integer> integers1 = new LinkedList<>(integers);
        Collections.reverse(integers1);
        System.out.println(integers1);
    }
}
