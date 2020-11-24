package org.SampleList;

import java.util.ArrayList;
import java.util.List;

public class SampleList {
	public static void main(String[] args) {
		List li=new ArrayList();
		li.add(10);
		li.add(10.4567);
		li.add("name");
		li.add(8754544243l);
		li.add('R');
		li.add(true);
		li.add(11);
		li.add("ram");
		li.add(90);
		System.out.println(li);
		//to get the size of particular list
		System.out.println("Size of List:");
		int i=li.size();
		System.out.println(i);
		//to get the particular value
		Object obj=li.get(2);
		System.out.println(obj);
		//to add particular value
		li.add(1, 100);
		System.out.println(li);
		int t=li.size();
		System.out.println(t);
		Object obj1=li.get(4);
		System.out.println(obj1);
		//to change particular in list
		li.set(2, 200);
		System.out.println(li);
		//to remove the particular value in list
		li.remove(3);
		System.out.println(li);
		//to find the index
		int t2=li.indexOf(100);
		System.out.println(t2);
		li.add(100);
		li.add(250);
		System.out.println(li);
		//to find the last index
		int t3=li.lastIndexOf(100);
		System.out.println(t3);
		//to check particular value is present or not
		boolean b=li.contains(100);
		System.out.println(b);
		//TO COPY THE LIST 
		List l2=new ArrayList();
		l2.add(11);
		l2.add(11.3456);
		l2.add("ram");
	
		l2.add(100);
		//to get unique value
		System.out.println("unique values");
		l2.removeAll(li);
	
		System.out.println(l2);
		
		
		
		System.out.println("To get l2 values");
		System.out.println(l2);
		
	}

}
