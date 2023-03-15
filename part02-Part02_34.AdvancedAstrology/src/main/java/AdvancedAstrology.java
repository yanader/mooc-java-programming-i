
public class AdvancedAstrology {

    public static void printStars(int number) {
        int i = 0;
        while(i < number){
            System.out.print("*");
            i++;
        }
        System.out.println();
    }

    public static void printSpaces(int number) {
        int i = 1;
        while(i <= number){
            System.out.print(" ");
            i++;
        }
    }

    public static void printTriangle(int size) {
        int i = 1;
        while(i <= size){
            printSpaces(size - i);
            printStars(i);
            i++;
        }
    }

    public static void christmasTree(int height) {
        int i = 1;
        while(i <= height){
            printSpaces(height - i);
            printStars(i * 2 - 1);
            //printSpaces(height - (i+1));
            i++;
        }
        for(int j = 0; j < 2; j++){
            printSpaces(height-2);
            printStars(3);
        }
        
    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        printTriangle(5);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}
