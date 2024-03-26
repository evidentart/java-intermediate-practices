package umbc.mergesort;

import java.util.Arrays;

public class MergeSort {


  public void mergeSort(int[] arr, int left, int right) {
    System.out.println("Current array: ");
    System.out.print("[ ");
    for (int i = left; i <= right; i++) {
      System.out.print(arr[i] + " ");
    
    }

    System.out.println("]\n");
    System.out.println("Left: " + left + " and right: " + right);
    // if you are working with an array of 2+
    if (left < right) {
      int middle = (left + right) / 2;

      //recursively sort the left and right sub-arrays
      System.out.println("======== Merge Sort called on Left Array! ========");
      mergeSort(arr, left, middle);

      System.out.println("======== Merge Sort called on Right Array! ========");
      mergeSort(arr, middle + 1, right);

      //merge the sorted sub-arrays
      System.out.println("Merging: ");
      System.out.print("[ ");
      for (int i = left; i <= middle; i++) {
        System.out.print(arr[i] + " ");
      }
      System.out.print("] and  ");
      System.out.print("[ ");
      for (int i = middle + 1; i <= right; i++) {
        System.out.print(arr[i] + " ");
      }
      System.out.println("]\n");

      // merge the sorted sub-arrays
      merge(arr, left, middle, right);
    }
  }

  public void merge(int[] arr, int left, int middle, int right) {
    //find the sizes of the left and right sub-arrays
    int n1 = middle - left + 1;
    int n2 = right - middle;

    //create temporary arrays to hold the left and right sub-arrays
    int[] L = new int[n1];
    int[] R = new int[n2];  

    //copy the elements of the left and right sub-arrays into the temporary arrays
    for (int i = 0; i < n1; i++) {
      L[i] = arr[left + i]; 
    }

    for(int j = 0; j < n2; j++) {
      R[j] = arr[middle + 1 + j];
    }

    //merge the temporary arrays back into the original array
    int i = 0, j = 0; //left and right array's variable
    int k = left; //original array's variable
    while (i < n1 && j < n2) {
      if (L[i] <= R[j]) {
        arr[k] = L[i];
        i++;
      } else {
        arr[k] = R[j];
        j++;
      }
      k++;
    }

    //copy the remaining elements of the left sub-array (should be in order already)
    while (i < n1) {
      arr[k] = L[i];
      i++;
      k++;
    }
  }
}
