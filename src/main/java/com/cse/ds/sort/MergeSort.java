package com.cse.ds.sort;

import com.cse.ds.Comparator;
import com.cse.ds.Sorting;
import java.util.*;
/**
 * 
 * @author harsh
 *
 * @param <T>
 */
public class MergeSort<T> implements Sorting<T> {

	private Comparator<T> comparator;

	public MergeSort(Comparator<T> comparator) {
    this.comparator = comparator;
	}

	@Override
	public void sort(T[] array, boolean ascending) {
    
    int size = array.length;
    mergesort(array, ascending, 0, array.length - 1);

	}

  private void mergesort(T[] array, boolean ascending, int low, int high) {
    if (low < high) {
      int middle = (low + high) / 2;
      mergesort(array, ascending, low, middle);
      mergesort(array, ascending, middle + 1, high);
      merge(array, ascending, low, middle, high);
    }
  }

  private void merge(T[] array, boolean ascending, int low, int middle, int high) {
    List<T> arrayList = new ArrayList<T>(high - low + 1);
    int low_half = low;
    int high_half = middle +1;
    while (low_half <= middle && high_half <= high) {
      T lowVal = array[low_half];
      T highVal = array[high_half];
      boolean comparatorAscending = comparator.comparison(lowVal, highVal, ascending);
      if (comparatorAscending) {
        arrayList.add(lowVal);
        low_half++;
      } else {
        arrayList.add(highVal);
        high_half++;
      }
    }
    while (low_half <= middle) {
      arrayList.add(array[low_half]);
      low_half++;
    }
    while (high_half <= high) {
      arrayList.add(array[high_half]);
      high_half++;
    }
    System.arraycopy(arrayList.toArray(),0,array,low,high-low+1);
  }
}
