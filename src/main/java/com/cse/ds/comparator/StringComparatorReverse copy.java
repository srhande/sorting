package com.cse.ds.comparator;

import com.cse.ds.Comparator;

/**
 * 
 * @author harsh
 * A custom comparator for comparing String in reverse order.
 * Ex: ABBZ > ZBA
 */
public class StringComparatorReverse implements Comparator<String> {

	@Override
	public boolean comparison(String x1, String y1, boolean ascending) {

    StringBuilder string1 = new StringBuilder(x1);
    string1.reverse();
    x1 = string1.toString();

    StringBuilder string2 = new StringBuilder(y1);
    string2.reverse();
    y1 = string2.toString();
  
    if (ascending) {
        if (x1.compareTo(y1) <= 0) {
          return true;
        } else {
          return false;
        }
    } else if (ascending == false) {
          if (x1.compareTo(y1) <= 0) {
            return true;
          } else{
            return false;
          }
    }
		return true;
	}
}
