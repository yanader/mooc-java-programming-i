
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Statistics stats = new Statistics();
        Statistics evenStats = new Statistics();
        Statistics oddStats = new Statistics();
        System.out.println("Enter numbers:");

        while (true) {
            int i = Integer.valueOf(scanner.nextLine());
            if (i == -1) {
                break;
            }
            stats.addNumber(i);
            if (i % 2 == 0) {
                evenStats.addNumber(i);
            } else {
                oddStats.addNumber(i);
            }

        }
        System.out.println("Sum: " + stats.sum());
        System.out.println("Sum of even numbers: " + evenStats.sum());
        System.out.println("Sum of odd numbers: " + oddStats.sum());
    }
}
