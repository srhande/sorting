package com.cse.ds.comparator;

import com.cse.ds.Comparator;

/**
 * 
 * @author harsh
 *
 */
public class ColorComparator implements Comparator<String> {

	@Override
	public boolean comparison(String x, String y, boolean ascending) {
		
		String lowX = x.toLowerCase();
		String lowY = y.toLowerCase();
		
		if (ascending) {
			if (lowX.equals("blue") && (lowY.equals("red") || lowY.equals("white"))) {
				return true;
			} else if (lowX.equals("white") && lowY.equals("red")) {
        return true;
      } else {
          return false;
      }
		} else if (ascending == false) {
        if (lowX.equals("red") && (lowY.equals("blue") ||lowY.equals("white"))) {
          return true;
        } else if (lowX.equals("white") && lowY.equals("blue")) {
          return true;
        } else {
          return false;
        }
    }
		return true;
	}
}
