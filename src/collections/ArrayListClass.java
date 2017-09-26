package collections;

import java.awt.List;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;


public class ArrayListClass {

	public static void main(String[] args)
	{
		Vector<Object> a1=new Vector<Object>();
		ArrayList<Object> a2=new ArrayList<Object>();
		LinkedList a3=new LinkedList();
		a2.add("ABC1");
		a2.add('B');
		a1.add("ABC");
		a1.add(12);
		a1.add('A');
		a1.add(null);
		a1.add(55);
		a1.add(55);
		System.out.println(a1);
		System.out.println(a1.isEmpty());
		a1.remove(0);
		System.out.println(a1);
		System.out.println(a1.size());
		a1.removeAll(a1);
		System.out.println(a1);
		System.out.println(a1.size());
		a1.addAll(a2);
		System.out.println(a1);
		a1.add(0,"pinky");
		System.out.println(a1);
		a1.clear();
		System.out.println(a1);
		a1.remove(0);
	
	}
}
