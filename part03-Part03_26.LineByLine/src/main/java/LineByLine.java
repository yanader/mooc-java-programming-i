
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        

        while (!input.isEmpty()){
          String[] splitInput = input.split(" ");
          for (int i = 0; i < splitInput.length; i++){
              System.out.println(splitInput[i]);
          }
          input = scanner.nextLine();
        }

    }
}
