package com.cse.ds.sort;

import com.cse.ds.Sorting;
import java.util.Arrays;

/**
 * 
 * @author harsh
 *
 * @param <T>
 */
public class CountSort<T> implements Sorting<T> {
	
	private T[] order;
	
	public CountSort(T[] order) {
	  this.order = order;
  }
	
	@Override
	public void sort(T[] array, boolean ascending) {
	

    int [] count = new int[order.length];
    int size = count.length;
    
    if (ascending) {
      for (int i = 0; i < size; i++) {
        int counter = 0;
        for (int j = 0; j < array.length; j++) {
          if (array[j].equals(order[i])) {
            counter++;
            count[i] = counter;
          }
        }
      }
      int arrayIndex = 0;
      for (int k = 0; k < size; k++) {
        while (count[k] > 0) {
          array[arrayIndex] = order[k];
          count[k]--;
          arrayIndex++;
        }
      }
    } else if (ascending == false) {
       for (int i = 0; i < size; i++) {
        int counter = 0;
        for (int j = 0; j < array.length; j++) {
          if (array[j].equals(order[i])) {
            counter++;
            count[i] = counter;
          }
        }
      }
      int arrayIndex = 0;
      for (int k = size - 1; k >= 0; k--) {
        while (count[k] > 0) {
          array[arrayIndex] = order[k];
          count[k]--;
          arrayIndex++;
        }
      }
    }
    print(array);
    }
}
