package optional;

import java.util.Optional;

public class UsingOptionals {

  public static void main(String[] args) {
    // ========= of, ifPresent, isPresent, get ================
    // syntax of using Optional makes it very clear that there may or may not be a value
    Optional<String> returnedOptional = returningAnOptional();
    

    //ideally, try and perform an action IF a value is within the Optional
    returnedOptional.ifPresent(x -> System.out.println(x));
    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

    // if you want to return and save the value somewhere, use isPresent
    String unwrappedValue = "";

    if (returnedOptional.isPresent()) {
      unwrappedValue = returnedOptional.get();
    }

    System.out.println(unwrappedValue);

    // ================= ofNullable, empty, orElse ================

    String myReassignedString = "tomatoes";

    //complex logic
    boolean complexCodeResultsinNull = true;
    if (complexCodeResultsinNull) {
      myReassignedString = null;
    }

    Optional<Character> characterWrapped = takingInAndReturningOptional(Optional.ofNullable(myReassignedString));

    char characterUnwrapped = characterWrapped.orElse('-');

    System.out.println(characterUnwrapped);
  }

  // ignore the dead code since we are using optional , it wont cause an error
  public static Optional<String> returningAnOptional() {
    if(false) {
      return Optional.empty();
    } else {
     return Optional.of("some value");
    }
  }

  // typically we wouldnt be using an optional as a parameter, but for the sake of this example
  public static Optional<Character> takingInAndReturningOptional(Optional<String> myString) {

    Optional<Character> charToReturn = Optional.empty();

    charToReturn = myString.map(x -> x.charAt(1));

    return charToReturn;
    
  }
}





