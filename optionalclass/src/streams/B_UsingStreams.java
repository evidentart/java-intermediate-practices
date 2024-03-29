package streams;

import java.util.stream.Stream;
import java.util.stream.Collectors;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

public class B_UsingStreams {

  public static void main(String[] args) {

    //from a collection
    ArrayList<String> wordCollection = new ArrayList<>();
    wordCollection.add("a");
    wordCollection.add("b");
    wordCollection.add("c");
   
    Stream<String> streamCreatedByCollection = wordCollection.stream();

    // from an array
    String[] wordArray = {"d", "e", "f"};
    Stream<String> streamCreatedByArray = Arrays.stream(wordArray);

    // inline
    Stream<String> streamCreatedInLine = Stream.of("a", "b", "c");

    // ==========================================infinite streams =======================================
    // starting value + unaryOperator ( takes in a value, returns value of that type)
    Stream<Integer> evenNums = Stream.iterate(0, n -> n + 2);
    evenNums.limit(5).forEach(x -> System.out.println(x));
    

    // unordered stream
    Stream<Integer> randNums = Stream.generate(() -> (int) (Math.random() * 10 + 1));
    randNums.limit(1).forEach(x -> System.out.println(x));

    // ========================================= using commong operations ==================================
    // terminals
    System.out.println("```````````````````````````````");
    long count = streamCreatedByCollection.count();
    System.out.println(count);
    System.out.println("```````````````````````````````");

    // reduce is useful for creating a new value during every iteration in its processing
    String concat = streamCreatedByArray.reduce("", (x, y) -> x + y);
    System.out.println(concat);

    // collect is useful for modifying an existing value (like a collection) (adding to a collection)
    List<String> codedValues = streamCreatedInLine.collect(Collectors.toList());
    System.out.println(codedValues);

    // ========================================= adding intermediates ========================================
    Stream<Integer> numberStream1 = Stream.of(6,9,1,4,2,10,8,7,3,5);
    List<Integer> sortedEvenNumbers = numberStream1.filter(x -> x % 2 == 0).sorted().collect(Collectors.toList());
    System.out.println(sortedEvenNumbers);

    Stream<Integer> numberStream2 = Stream.of(6,9,1,4,2,10,8,7,3,5,2,6,8);
    numberStream2.distinct().map(x-> x * 10).forEach(x -> System.out.print(x + " "));
 
  }
} 
