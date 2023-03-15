
import java.util.ArrayList;

public class RemoveLast {

    public static void main(String[] args) {
        ArrayList<String> test = new ArrayList<String>();
        
        test.add("Hello");
        test.add("Why");
        test.add("West");
        test.add("Removal");
        removeLast(test);
        System.out.println(test.size());
    }
    
    public static void removeLast(ArrayList<String> strings){
        if(strings.size() == 0){
            return;
        }
        strings.remove(strings.size()-1);
    }
}
