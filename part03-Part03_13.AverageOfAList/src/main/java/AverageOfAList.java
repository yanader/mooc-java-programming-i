
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        while(true){
            int value = Integer.valueOf(scanner.nextLine());
            if(value == -1){
                break;
            }
            list.add(value);
        }
        
        int sum = 0;
        int count = 0;
        
        for(int number : list){
            sum = sum + number;
            count++;
        }
        
        System.out.println("Average: " + (double)sum/count);
        
    }
}
