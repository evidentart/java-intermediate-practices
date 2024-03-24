// This is a sample Java program that creates an ArrayList of names and then prints the first two names that start with the letter "b".
// The purpose of this program is to illustrate time complexity
package umbc;

import java.util.ArrayList;
import java.util.List;

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

        System.out.println(firstTwoNames('b', namesList));

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
