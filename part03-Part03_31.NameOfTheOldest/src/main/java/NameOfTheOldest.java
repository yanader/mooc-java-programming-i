
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int oldest = 0;
        String oldestName = "";
        
        while(!input.isEmpty()){
            String[] splitInput = input.split(",");
            if(Integer.valueOf(splitInput[1]) > oldest){
                oldest = Integer.valueOf(splitInput[1]);
                oldestName = splitInput[0];
            }
            input = scanner.nextLine();
        }
        System.out.println("Name of the oldest: " + oldestName);

    }
}
