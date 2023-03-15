import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
public class Main {

    public static void main(String[] args) {
        // insert test code here
        
        ArrayList<String> strings = new ArrayList<String>();
        strings.add("Ste");
        strings.add("Joy");
        strings.add("West");
        strings.add("Maggie");
        System.out.println(strings);
        sortStrings(strings);
        System.out.println(strings);        
        
    }
    
    public static void sort(int[] array){
        Arrays.sort(array);
    }
    
    public static void sort (String[] array){
        Arrays.sort(array);
    }
    
    public static void sortIntegers(ArrayList<Integer> integers){
        Collections.sort(integers);
    }
    
    public static void sortStrings(ArrayList<String> strings){
        Collections.sort(strings);
    }
    
}
