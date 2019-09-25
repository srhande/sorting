package com.cse.ds.sort;

import com.cse.ds.Comparator;
import com.cse.ds.Sorting;

/**
 * 
 * @author harsh
 *
 * @param <T>
 */
public class BubbleSort<T> implements Sorting<T> {
	
	private Comparator<T> comparator;
	
	public BubbleSort(Comparator<T> comparator) {
    this.comparator = comparator;
	}
	
	@Override
	public void sort(T[] array, boolean ascending) {
	
  int i = 0;
  int j = 0;

	if (ascending) {
		int size = array.length;
		for (i = 0; i < size - 1; i++) {
			for (j = 0; j < size - i - 1; j++) {
        boolean comparatorAscending = (comparator.comparison(array[j], array[j+1], true));
        if (comparatorAscending) {
					swap(array,j, j);
				} else if (comparatorAscending == false) {
          swap(array, j, j+1);
        }
			}
		}
	}	else if (ascending == false) {
		int size = array.length;
		for (i = 0; i < size - 1; i++) {
			for (j = 0; j < size - i - 1; j++) {
        boolean comparatorDescending = (comparator.comparison(array[j], array[j+1], false));
				if (comparatorDescending){
					swap(array, j,j);
				} else if (comparatorDescending == false) {
          swap(array, j+1,j);
        }
			}
		}
	}
  print(array);
 }
}
