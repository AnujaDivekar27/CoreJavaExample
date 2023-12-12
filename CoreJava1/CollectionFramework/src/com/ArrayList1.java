package com;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.stream.Collectors;

//ArrayList->implements List interface,maintain insertion order,
//can add multiple null elements and duplicates elements
//DS:Dynamic array,initial capacity:10,load factor:50%

public class ArrayList1 {

	public static void main(String args[]) {

		ArrayList<String> list = new ArrayList<String>(); // Creating arraylist
		//ArrayList<String> list1 = new ArrayList<String>();

		list.add("Ravi");// Adding object in arraylist
		list.add("Vijay");
		list.add("Ravi"); // dulplicates elemnts are allowed
		list.add("Ajay");
		// list.add(null);
		

		// Traversing list through Iterator interface
		Iterator itr = list.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		// Traversing list using foreach loop
		/*
		 * for (String s : list) { System.out.println(s); }
		 */

		list.add(3, "Rohan");
		System.out.println(list); // add element at perticular index
		// [Ravi, Vijay, Ravi, Rohan, Ajay]

		System.out.println("list contains element Ajay" + " " + list.contains("Ajay")); // true

		list.set(2, "Aditya"); // change element at given index
		System.out.println(list);

		System.out.println("Traverse list using forEach method");
		list.forEach(System.out::println);
		/*
		 * Ravi Vijay Aditya Rohan Ajay
		 */

		System.out.println("---------------------------------------------------------");
		System.out.println("find out total list element start with A");

		long count = list.stream().filter(n -> n.startsWith("A")).count();
		System.out.println(count); // 2

		System.out.println("---------------------------------------------------------");
		System.out.println("find out list element start with A");

		System.out.println(list.stream().filter(n -> n.startsWith("A")).collect(Collectors.toList()));
		// [Aditya, Ajay]
	}
}

//*********************************************************************************
/*
 * Ravi Vijay Ravi Ajay
 */