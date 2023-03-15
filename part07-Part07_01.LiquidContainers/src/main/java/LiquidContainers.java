import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int containerOne = 0;
        int containerTwo = 0;

        while (true) {
            System.out.println("First: " + containerOne + "/100");
            System.out.println("Second: " + containerTwo + "/100");
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
                containerOne += Integer.valueOf(parts[1]);
                if (containerOne > 100) {
                    containerOne = 100;
                }
            }

            if (parts[0].equals("move")) {
                if (Integer.valueOf(parts[1]) < 0) {
                    continue;
                }
                if (containerOne < Integer.valueOf(parts[1])) {
                    parts[1] = Integer.toString(containerOne);
                }
                containerTwo += Integer.valueOf(parts[1]);
                containerOne -= Integer.valueOf(parts[1]);
                if (containerTwo > 100) {
                    containerTwo = 100;
                }
            }

            if (parts[0].equals("remove")) {
                if (Integer.valueOf(parts[1]) < 0) {
                    continue;
                }
                containerTwo -= Integer.valueOf(parts[1]);
                if(containerTwo < 0){
                    containerTwo = 0;
                }
            }

        }

    }

}
