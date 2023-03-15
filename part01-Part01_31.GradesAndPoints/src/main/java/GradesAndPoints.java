
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Give points [0-100]:");
        int x = Integer.valueOf(scan.nextLine());
        
        if(x < 0){
            System.out.println("Grade: impossible!");
        } else if(x < 50){
            System.out.println("Grade: failed");
        } else if(x < 60){
            System.out.println("Grade: 1");
        } else if(x < 70){
            System.out.println("Grade: 2");
        } else if(x < 80){
            System.out.println("Grade: 3");
        } else if(x < 90){
            System.out.println("Grade: 4");
        } else if(x < 101){
            System.out.println("Grade: 5");
        } else if (x > 100){
            System.out.println("Grade: incredible!");
        }
    }
}
