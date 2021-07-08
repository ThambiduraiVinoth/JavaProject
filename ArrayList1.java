package collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayList1 {
	
	public static void main(String[] args) {
		
		List l = new ArrayList(); //this is known as upcast. Assigning ArrayList object to list interface type
									// converting child type to parent type
		l.add(1);
		l.add("Test");
		l.add('c');
		l.add(true);
		l.add(null);
		l.add(123456789123456l);
		l.add(12.345f);
		l.add(12.45677773432434);
		l.add("Test");
		System.out.println(l);
		
	}

}
