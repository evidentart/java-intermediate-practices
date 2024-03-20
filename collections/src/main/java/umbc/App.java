package umbc;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.Map;
import java.util.HashMap;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.PriorityQueue;
import java.util.Queue;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    
        //priority queue
        Queue<String> q = new PriorityQueue<>();
        q.add("Java");
        q.add("Python");
        q.add("C++");

        Iterator<String> iterator = q.iterator();

        while (iterator.hasNext()) {

            System.out.println(iterator.next());
            iterator.remove();
        }

        System.out.println(q);


        System.out.println();
        
        // Deque
        Deque<String> deque = new ArrayDeque<>();

        deque.add("Java");
        deque.add("Python");
        deque.add("C++");
        deque.add("C#");
        deque.add("JavaScript");
        deque.add("Ruby");
        deque.addFirst("Rust");
        deque.addLast("Go");


        System.out.println();

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

       System.out.println();

       // Map
       Map<String, Integer> map = new HashMap<>();

       map.put("Mat", 15);
       map.put("Mike", 22);
       map.put("John", 36);

       int age = map.get("John");
       System.out.println(age);

       int removedAge = map.remove("Mike");

       if(map.containsKey("Mike")) {
           System.out.println("Mike is in the map");
        
        }else{
            System.out.println("Mike is not in the map");
        }

        System.out.println();


        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());

        }

        System.out.println();

        for (String key : map.keySet()) {

            System.out.println(key + " " +map.get(key));
        }






    }
}