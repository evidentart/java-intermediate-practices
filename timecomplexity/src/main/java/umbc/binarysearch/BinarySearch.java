package umbc.binarysearch;

public class BinarySearch {

  public int binarysearch(int[] array, int targetValue) {

    // create variables needed
      // beginning index
      int beginningIndex = 0;
      // end index
      int endIndex = array.length - 1;

    // while we still have input to look through
    while (beginningIndex <= endIndex) {
        //find the midpoint
        int midIndex = (endIndex + beginningIndex) / 2;
        // get value at midpoint
        int midValue = array[midIndex];

        // if value of midpoint == target value THEN
        if (targetValue == midValue) {
          // RETURN midpoint
          return midIndex;
        }
        //ELSE IF value of midpoint < target value THEN
        else if (midValue < targetValue){
          //change the beginnign index to midpoint + 1
          beginningIndex = midIndex + 1;
        }
        //ELSE
        else {
          //change the end index to midpoint - 1
          endIndex = midIndex - 1;
        }
    }
    // END OF WHILE LOPP

    // return -1 if not found
    return -1;
  }
}
