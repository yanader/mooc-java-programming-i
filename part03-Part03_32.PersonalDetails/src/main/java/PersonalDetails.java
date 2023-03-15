
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int nameLength = 0;
        String longestName = "";
        int sum = 0;
        int count = 0;
        
        while(!input.isEmpty()){
            String[] splitInput = input.split(",");
            if(splitInput[0].length() > nameLength){
                nameLength = splitInput[0].length();
                longestName = splitInput[0];
            }
            count++;
            sum += Integer.valueOf(splitInput[1]);
            input = scanner.nextLine();
        }
        System.out.println("Longest name: " + longestName);
        System.out.println("Average of the birth years: " + (double)sum/count);
        

    }
}
