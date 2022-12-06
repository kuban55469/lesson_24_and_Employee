package praktica.task4;

import java.util.Arrays;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        /**
         *
         */

        LinkedList<String > words = new LinkedList<>(Arrays.asList(
                "men", "sen", "al","bul","tigi","menen", "jana"
        ));

        System.out.println(words);
        words.removeFirst();
        words.removeLast();
        System.out.println(words);
    }
}
