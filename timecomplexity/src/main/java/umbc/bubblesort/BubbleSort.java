package umbc.bubblesort;

public class BubbleSort {

  public void bubbleSort(int[] array) {
    // outer loop
    for(int i = 0; i < array.length - 1; i++) {
      // becasue the current value will be compared to the next, so we need to start at i + 1
      // the second to last index
      for (int j = 0; j < array.length - i - 1; j++) {
        //inner loop
          // if the current element is greater than the next element
          if (array[j] > array[j+1]) {
            // swap the elements
            int temp = array[j];
            array[j] = array[j+1];
            array[j+1] = temp;
          }
      }
    }
  }
  
}
