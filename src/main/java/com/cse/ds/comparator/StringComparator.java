package com.cse.ds.comparator;

import com.cse.ds.Comparator;

/**
 * 
 * @author harsh
 *
 */
public class StringComparator implements Comparator<String> {

	@Override
	public boolean comparison(String x, String y, boolean ascending) {  

    if (ascending) {
        if (x.compareTo(y) <= 0) {
          return true;
        } else {
          return false;
        }
    } else if (ascending == false) {
          if (x.compareTo(y) <= 0) {
            return true;
          } else {
            return false;
          }
    }
    
    return true;
	}
}
