package umbc;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    
        // ArrayList
        ArrayList<String> dinosaurList = new ArrayList<>();
        // ArrayList<Dinosaur> dinoList = new ArrayList<>(Arrays.asList("Tyrannosaurus", "Stegosaurus", "Triceratops"));  /or the following
        dinosaurList.add("Tyrannosaurus");
        dinosaurList.add("Stegosaurus");
        dinosaurList.add("Triceratops");
        dinosaurList.add("Velociraptor");
        dinosaurList.add("Spinosaurus");
        dinosaurList.add("Brachiosaurus");
        dinosaurList.add("Pterodactyl");
        dinosaurList.add("Diplodocus");
        dinosaurList.add("Styracosaurus");
       
        for(String dino: dinosaurList) {

            System.out.println(dino);
        }

        System.out.println();

        // LinkedList
        List<String> dinosaurList2 = new LinkedList<>();
        dinosaurList2.add("Tyrannosaurus");
        dinosaurList2.add("Stegosaurus");
        dinosaurList2.add("Triceratops");
        dinosaurList2.add("Velociraptor");
        dinosaurList2.add("Spinosaurus");
        dinosaurList2.add("Brachiosaurus");
        dinosaurList2.add("Pterodactyl");
        dinosaurList2.add("Diplodocus");
        dinosaurList2.add("Styracosaurus");

        if(dinosaurList.isEmpty()){
            System.out.println("List is empty");
        }

        for (String dino: dinosaurList2) {

            System.out.println(dino);
        }
        
        System.out.println();

        //set
        Set<String> dinosaurSet = new HashSet<>(dinosaurList);
        dinosaurSet.add("Tyrannosaurus");
        dinosaurSet.add("Stegosaurus");
        dinosaurSet.add("Triceratops");
        dinosaurSet.add("Velociraptor");
        dinosaurSet.add("Spinosaurus");
        dinosaurSet.add("Brachiosaurus");
        dinosaurSet.add("Pterodactyl");
        dinosaurSet.add("Diplodocus");
        dinosaurSet.add("Styracosaurus");
        dinosaurSet.add("Tyrannosaurus");

        for (String dino: dinosaurSet) {

            System.out.println(dino);
        }

        // Dinosaur dino = new Dinosaur();
        // SomethingGeneric<String> usesString = new SomethingGeneric<String>("String");
        // SomethingGeneric<Dinosaur> usesInteger = new SomethingGeneric<Dinosaur>(dino);
        // System.out.println(usesString.getValue());
        // System.out.println(usesInteger.getValue());
       
    }
}
