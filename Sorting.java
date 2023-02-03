package DataStructure;

import java.util.Comparator;

//import Java8Features.Employee;

public class Sorting implements Comparator<MenuItem>{
@Override
public int compare(MenuItem o1, MenuItem o2) {
	// TODO Auto-generated method stub
	return o1.getId()-o2.getId();
}

}