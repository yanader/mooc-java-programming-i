
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container containerOne = new Container();
        Container containerTwo = new Container();

        while (true) {
            System.out.println("First: " + containerOne.contains() + "/100");
            System.out.println("Second: " + containerTwo.contains() + "/100");
            System.out.println("> ");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }

            String[] parts = input.split(" ");

            if (parts[0].equals("add")) {
                if (Integer.valueOf(parts[1]) < 0) {
                    continue;
                }
                containerOne.add(Integer.valueOf(parts[1]));
            }

            if (parts[0].equals("move")) {
                if (Integer.valueOf(parts[1]) < 0) {
                    continue;
                }
                if (containerOne.contains() < Integer.valueOf(parts[1])) {
                    parts[1] = Integer.toString(containerOne.contains());
                }
                containerTwo.add(Integer.valueOf(parts[1]));
                containerOne.remove(Integer.valueOf(parts[1]));
            }

            if (parts[0].equals("remove")) {
                if (Integer.valueOf(parts[1]) < 0) {
                    continue;
                }
                containerTwo.remove(Integer.valueOf(parts[1]));
            }
        }
    }
}
