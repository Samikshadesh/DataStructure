package DataStructure;

import java.util.Comparator;

public class MenuItem //implements Comparable<MenuItem>
{
	private int id;
	private String name;
	private MenuItem parent;
	
	public MenuItem(int id, String name)
	{
		super();
		this.id = id;
		this.name = name;
	}
	
	public MenuItem() {
		
	}




	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public MenuItem getParent() {
		return parent;
	}

	public void setParent(MenuItem parent) {
		this.parent = parent;
	}
	public void display() {
		System.out.println(id+" "+name);
	}
	
	

//	@Override
//	public int compareTo(MenuItem o) {
//		// TODO Auto-generated method stub
//		return this.getId()-o.getId();
//	}


//	public void back(MenuItem m) {
//		if(m.getParent()!=null)
//		{
//			display();
//		}else {
//			System.exit(0);
//		}
//	}
//	}
//	

public class Sorting implements Comparator<MenuItem>{
@Override
public int compare(MenuItem o1, MenuItem o2) {
	// TODO Auto-generated method stub
	return o1.getId()-o2.getId();
}

}}


