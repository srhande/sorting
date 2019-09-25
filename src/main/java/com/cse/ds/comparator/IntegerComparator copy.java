package com.cse.ds.comparator;

import com.cse.ds.Comparator;

/**
 * 
 * @author harsh
 *
 */
public class IntegerComparator implements Comparator<Integer> {

	@Override
	public boolean comparison(Integer x, Integer y, boolean ascending) {
		
    if (ascending) {
      if (x <= y) {
        return true;
      } else if (x > y) {
        return false;
      }
    } else if (ascending == false) {
      if (x >= y) {
        return true;
      } else if (x < y) {
        return false;
      }
    }
    return true;
	}
}
