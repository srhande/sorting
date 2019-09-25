package com.cse.ds;

import java.util.Arrays;
import java.util.Random;

import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.cse.ds.comparator.IntegerComparator;
import com.cse.ds.sort.BubbleSort;
import com.cse.ds.sort.CountSort;
import com.cse.ds.sort.SelectionSort;
import com.cse.ds.sort.MergeSort;

/**
 * 
 * @author harsh
 *
 */
public class GenericTest {
	
	static BubbleSort<Integer> bubbleSortInteger;
	static SelectionSort<Integer> selectionSortInteger;
	static CountSort<Integer> countSortInteger;
  static MergeSort<Integer> mergeSortInteger;
	
	Integer arr1[], arr1r[];// = new Integer[10];
	Integer arr2[], arr2r[];
	
	@BeforeClass
    public static void setUpBeforeClass() {
		Integer order[] = {0,1,2};
		
		bubbleSortInteger = new BubbleSort<>(new IntegerComparator());
		selectionSortInteger = new SelectionSort<>(new IntegerComparator());
		countSortInteger = new CountSort<>(order);
    mergeSortInteger = new MergeSort<>(new IntegerComparator());
    }
	
    @Before
    public void populatePlayList(){
    	arr1 = new Integer[]{5,6,7,3,2,4,5,5,5,3,2,6,7,8,10};
		arr2 = new Integer[]{1,2,0,1,0,2};
		arr1r = new Integer[]{2,2,3,3,4,5,5,5,5,6,6,7,7,8,10};
		arr2r = new Integer[]{2,2,1,1,0,0};
    }
    
    @Test
    public void testSelection()
    {
    	selectionSortInteger.sort(arr1, true);
    	System.out.println(Arrays.toString(arr1));
    	System.out.println(Arrays.toString(arr1r));
    	Assert.assertArrayEquals(arr1r, arr1);

    }
    
    
    @Test
    public void testBubble()
    {
    	bubbleSortInteger.sort(arr1, true);
    	System.out.println(Arrays.toString(arr1));
    	System.out.println(Arrays.toString(arr1r));
    	Assert.assertArrayEquals(arr1r, arr1);
    }
    
    @Test
    public void testCount()
    {
    	countSortInteger.sort(arr2, false);
    	System.out.println(Arrays.toString(arr2));
    	System.out.println(Arrays.toString(arr2r));
    	Assert.assertArrayEquals(arr2r, arr2);
    }

    @Test
    public void testMerge()
    {
      mergeSortInteger.sort(arr1, true);
      System.out.println(Arrays.toString(arr1));
    	System.out.println(Arrays.toString(arr1r));
    	Assert.assertArrayEquals(arr1r, arr1);
    } 
}
