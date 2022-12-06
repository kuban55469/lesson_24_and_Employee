package praktica.task3;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        /**
         * Массивдеги эки элементти ордулары менен алмаштыр!
         */
        LinkedList<Integer> integers  = new LinkedList<>(Arrays.asList(
                3,5,2,7,9,4,8,5,7,5
        ));

        System.out.println(integers);
        Collections.swap(integers,1,6);
        System.out.println(integers);
    }
}
