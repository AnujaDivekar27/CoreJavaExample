package com;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList1 {

	public static void main(String args[]) {

		ArrayList<String> list = new ArrayList<String>(); // Creating arraylist
		list.add("Ravi");// Adding object in arraylist
		list.add("Vijay");
		list.add("Ravi"); //dulplicates elemnts are allowed
		list.add("Ajay");
		
		// Traversing list through Iterator interface
		Iterator itr = list.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		//Traversing list using foreach loop
		/*for (String s : list) {
		   System.out.println(s);	
		}*/
	
	    list.add(3,"Rohan");
	    System.out.println(list); //add element at perticular index
	    //[Ravi, Vijay, Ravi, Rohan, Ajay]
	    
	    System.out.println("list contains element Ajay"+" "+list.contains("Ajay")); //true
	
	    list.set(2, "Aditya"); //change element at given index
	    System.out.println(list);
	    
	    System.out.println("Traverse list using forEach method");
	    list.forEach(System.out::println);
	    /* Ravi
	    Vijay
	    Aditya
	    Rohan
	    Ajay */

	    System.out.println("---------------------------------------------------------");
	    System.out.println("find out list element start with A");
	    list.stream().filter(n->n.startsWith("A"));
	    
	}
	
  }
//*********************************************************************************
 /* Ravi
    Vijay
    Ravi
    Ajay
 */