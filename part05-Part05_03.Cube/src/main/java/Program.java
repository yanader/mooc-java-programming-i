
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = Integer.valueOf(scanner.nextLine());
        
        Cube cube = new Cube(i);
        System.out.println(cube);
    }
}
