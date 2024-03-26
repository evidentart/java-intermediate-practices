package umbc.linearsearch;

public class LinearSearch {
  
  public int linearsearch(int[] array, int target) {
    
    // Loop over each index of array
    for (int i = 0; i < array.length; i++) {
      // get element at index 
      int value = array[i];
      // if current element is the same as the target element then
      if(value==target) {
        // return index of element
        return i;
      }

    // end if 

    }
  //end of loop
  
  //return -1 if element not found
  return -1;

 }
}