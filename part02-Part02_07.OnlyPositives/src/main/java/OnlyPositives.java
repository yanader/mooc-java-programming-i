
import java.util.Scanner;

public class OnlyPositives {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i;

        while (true) {
            System.out.println("Give a number:");
            i = Integer.valueOf(scanner.nextLine());

            if (i < 0) {
                System.out.println("Unsuitable number");
                continue;
            }

            if (i > 0) {
                System.out.println(i * i);
                continue;
            }

            if (i == 0) {
                break;
            }
        }
    }
}
