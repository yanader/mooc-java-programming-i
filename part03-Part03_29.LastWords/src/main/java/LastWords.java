
import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        
        while(!input.isEmpty()){
            String[] splitInput = input.split(" ");
            System.out.println(splitInput[splitInput.length-1]);
            input = scanner.nextLine();
    }
        
       

    }
}
