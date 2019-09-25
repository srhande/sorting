package com.cse.ds.sort;

import com.cse.ds.Comparator;
import com.cse.ds.Sorting;

/**
 * 
 * @author harsh
 *
 * @param <T>
 */
public class SelectionSort<T> implements Sorting<T> {
	
	private Comparator<T> comparator;
	
	public SelectionSort(Comparator<T> comparator) {
		this.comparator = comparator;
	}
	
	@Override
	public void sort(T[] array, boolean ascending) {

  int i = 0;
  int j = 0;
  int minIndex = 0;
  int maxIndex = 0;
	int size = array.length;

  if (ascending) {
	  for (i = 0; i < size - 1; i++) {
		  minIndex = i;
		  for (j = i + 1; j < size; j++) {
			  boolean comparatorAscending = (comparator.comparison(array[minIndex], array[j], true));
        if (comparatorAscending == false) {
            minIndex = j;
        }
      }
      swap(array,i,minIndex);
		}

  } else if (ascending == false) {
		for (i = 0; i < size - 1; i++) {
			maxIndex = i;
			for (j = i + 1; j < size; j++) {
        boolean comparatorDescending = (comparator.comparison(array[maxIndex], array[j], false));
				if (comparatorDescending == false) {
          maxIndex = j;
        }
			}
      swap(array,maxIndex,j);
		}
	}
  print(array);
	}
}


// during runtime comparator function will have a specific type
// use that type's comparator to compare two values inside the array
// based on the return value swap
