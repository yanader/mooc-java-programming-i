
public class MainProgram {

    public static void main(String[] args) {
        Money a = new Money(10, 0);
        Money b = new Money(2, 0);
        Money c = a.minus(b);

        System.out.println(a);
        System.out.println(c);  // false
        
    }
}
