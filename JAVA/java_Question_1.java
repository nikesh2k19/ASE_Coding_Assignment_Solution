// 1. Create an array with the values (1, 2, 3, 4, 5, 6, 7) and shuffle it.


import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ShuffleArray {
    public static void main(String[] args) {
        // Create an array with the values (1, 2, 3, 4, 5, 6, 7)
        Integer[] array = {
            1,
            2,
            3,
            4,
            5,
            6,
            7
        };
        // Convert the array to a list
        List < Integer > list = Arrays.asList(array);
        // Shuffle the list using the Fisher-Yates shuffle algorithm
        Collections.shuffle(list);
        // Convert the list back to an array
        array = list.toArray(new Integer[0]);
        // Print the shuffled array
        System.out.println("Shuffled Array: " + Arrays.toString(array));
    }
}