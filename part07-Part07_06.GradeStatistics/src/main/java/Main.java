
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ResultsList results = new ResultsList();
        
        System.out.println("Enter points totals, -1 stops:");
        while(true){
            int i = Integer.valueOf(scanner.nextLine());
            if(i == -1){
            break;
            }
            if(i < 0 || i > 100){
                continue;
            } 
            results.add(i);
            }
        
        results.average();
        results.passingAverage();
        results.passPercentage();
        results.printGradeDistribution();
    }
}
