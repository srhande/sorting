package com.cse.ds.comparator;

import com.cse.ds.Comparator;
import com.cse.ds.models.Student;

/**
 * 
 * @author harsh
 *
 */
public class StudentComparator implements Comparator<Student> {

	@Override
	public boolean comparison(Student x, Student y, boolean ascending) {

    double x_cGPA = x.getCGPA();
    double y_cGPA = y.getCGPA();
    int x_PID = Integer.parseInt(x.getPID());
    int y_PID = Integer.parseInt(y.getPID());

		if(ascending){
      if(x_cGPA < y_cGPA){
        return true;
      }
      else if(x_cGPA > y_cGPA){
        return false; 
      }
      else{
        if(x_PID < y_PID){
          return true;
        }
        else{
          return false;
        }
      }
    } else if( ascending == false){
      if(x_cGPA < y_cGPA){
        return false;
      }
      else if(x_cGPA > y_cGPA){
        return true;
      }
      else{
        if(x_PID < y_PID){
          return false;
        }
        else{
          return true;
        }
      }
    }
  return true;
	}
}
