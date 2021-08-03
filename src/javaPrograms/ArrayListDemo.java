package javaPrograms;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ArrayList arr1= new ArrayList();
		
		arr1.add(10);
		arr1.add("sonal");
		arr1.add("mittal");
		arr1.add("selenium");
		arr1.add(183465);
		
		
		// number of values in an arrayList
		
		System.out.println(arr1.size());
		
		Iterator itr= arr1.iterator();
		
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
