
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sumOfPositive = 0;
        int countOfPositive = 0;
        
        while(true){
            int i = Integer.valueOf(scanner.nextLine());
            
            if(i==0){
                break;
            }
            
            if(i>0){
                sumOfPositive += i;
                countOfPositive++;
            }
        }
        if(countOfPositive == 0){
            System.out.println("Cannot calculate the average");
        } else {
            System.out.println((double)sumOfPositive/countOfPositive);
        }
    }
}
