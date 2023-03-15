import java.util.Arrays;
public class MainProgram {

    public static void main(String[] args) {
        int[] numbers = {8, 3, 7, 9, 1, 2, 4};
        MainProgram.sort(numbers);
    }
    
    public static int smallest(int[] intArray){
        int smallest = intArray[0];
        for(int i : intArray){
            if(i < smallest){
                smallest = i;
            }
        }
        return smallest;
    }
    
    public static int indexOfSmallest(int[] intArray){
        int smallest = smallest(intArray);
        int i;
        for(i = 0; i < intArray.length; i++){
            if(intArray[i] == smallest){
                return i;
            }
        }
        return -1;
    }
    
    public static int indexOfSmallestFrom(int[] table, int startIndex){
         //-----------------------------------------------------------------------------------------------
        // for what it's worth, this is massively overcomplicated. I can just iterate from the startIndex 
        //and at the point I find a smaller value - update the index variable to be returned
        //-----------------------------------------------------------------------------------------------
        //create a new array that is the lenth from startIndex to end of array
        int[] smallArray = new int[table.length - startIndex];
        //populate the array with a loop
        for(int i = 0; i < smallArray.length; i++){
            smallArray[i] = table[startIndex + i];
        }
        //use existing smallest() to find the smallest value in the new, smaller array
        int smallest = smallest(smallArray);
        int i;
        //use a loop to find the position of the smallest value in the smaller array but only from the startIndex
        for(i = startIndex; i < table.length; i++){
            if(table[i] == smallest){
                return i;
            }
        }
        return -1;
    }
    
    public static void swap(int[] array, int index1, int index2){
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
    
    public static void sort(int[] array){
        //so i think the issue here is that as I move the iterator along (i++) the length of the array is getting shorter??
        for(int i = 0; i < array.length; i++){
            swap(array, i, indexOfSmallestFrom(array,i));
            System.out.println(Arrays.toString(array));
        }
    }
}
