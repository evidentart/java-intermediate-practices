// This is a sample Java program that creates an ArrayList of names and then prints the first two names that start with the letter "b".
// The purpose of this program is to illustrate time complexity. 
package umbc;

import java.util.ArrayList;
import java.util.List;
import umbc.linearsearch.*;
import umbc.binarysearch.*;
import umbc.mergesort.*;
import umbc.bubblesort.*;
import java.util.Arrays;

public class App 
{
    public static void main( String[] args )
    {
       //create an arraylist to hold names
        ArrayList<String> namesList = new ArrayList<>();

        // add 20 names to the arraylist
        namesList.add("Alice");
        namesList.add("Bob");
        namesList.add("Charlie");
        namesList.add("David");
        namesList.add("Eve");
        namesList.add("Fred");
        namesList.add("Ginny");
        namesList.add("Betty");
        namesList.add("Ileana");
        namesList.add("Joseph");
        namesList.add("Kincaid");
        namesList.add("Larry");
        namesList.add("Mary");
        namesList.add("Nancy");
        namesList.add("Olivia");
        namesList.add("Patricia");
        namesList.add("Quincy");
        namesList.add("Robert");
        namesList.add("Sarah");
        System.out.println("Project 1: The first two names that start with 'b' are: ");
        System.out.println(firstTwoNames('b', namesList));

        System.out.println();
        //linear search
        System.out.println("Project 2: Linear search result: ");
        LinearSearch linearSearch1 = new LinearSearch();
        int linearResult = linearSearch1.linearsearch(new int[] {1,2,3,4,5}, 3);
        System.out.println(linearResult);
        System.out.println();
        //binary search
        System.out.println("Project 3: Binary search result: ");
        BinarySearch binarySearch1 = new BinarySearch();
        int result = binarySearch1.binarysearch(new int[] {1,2,3,4,5,6,7,8,9,10}, 5);
        System.out.println(result);
        System.out.println();

        //bubble sort
        System.out.println("Project 4: Bubble sort result: ");
        BubbleSort bubbleSort1 = new BubbleSort();
        int[] array = {52,33,99,20,11,55};
        bubbleSort1.bubbleSort(array);
        System.out.println(Arrays.toString(array));
        System.out.println();


        //merge sort
        System.out.println("Project 5: Merge sort result: ");
        MergeSort mergeSort1 = new MergeSort();
        int[] arr4 = {64, 34, 25, 12, 22, 11, 90};

        //call the merge sort function
        mergeSort1.mergeSort(arr4, 0, arr4.length - 1);

        //print the sorted array
        for (int i = 0; i < arr4.length; i++) {
            System.out.print(arr4[i] + " ");
        }
    }

    public static List<String> firstTwoNames(char target, List<String> names) {
        
        List<String> twoNames = new ArrayList<>();
        target = Character.toUpperCase(target);

        for (String n : names) {
            
            n = n.toUpperCase();
            if(n.charAt(0) == target) {
                twoNames.add(n);

                if(twoNames.size() == 2) {
                    return twoNames;
                }
            }
        }
        return twoNames;  
    }
 
}
