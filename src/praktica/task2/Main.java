package praktica.task2;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Write e size: ");
        int size = scanner.nextInt();
        LinkedList<Integer> integers = new LinkedList<>();
        for (int i = 0; i < size/2; i++) {
            integers.add(scanner.nextInt());
        }
        for (int i = 0; i < size/2; i++) {
            integers.add(random.nextInt(1,9));
        }
        for (int i = 0; i < integers.size(); i++) {
            if (i < integers.size()/2) {
                System.out.printf("Scanner: The index %d: %d\n", i, integers.get(i));
            }else {
                System.out.printf("Random: The index %d: %d\n", i, integers.get(i));
            }
        }
    }
}
