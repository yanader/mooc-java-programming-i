
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a number:");
        int end = Integer.valueOf(scanner.nextLine());
        int factorial = 1;
        for(int i = 1; i<= end;i++){
            factorial *= i;
        }
        
        if(end == 0){
            System.out.println("Factorial: 1");
        } else {
            System.out.println("Factorial: " + factorial);
        }
    }
}
