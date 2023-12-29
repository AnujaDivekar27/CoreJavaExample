package com;

import java.util.List;
import java.util.Arrays;
import java.util.Iterator;

public class ConcurrModification {
 
  public static void main(String[] args) {
	List<Integer> l=Arrays.asList(1,2,3,4,5);
    Iterator itr=l.iterator();
    while(itr.hasNext())
    {
      Integer i=(Integer) itr.next(); //bec list element is object	
      System.out.println("i"+" "+i);
      if(i%2==0)
      {
    	  //System.out.println(i);
    	  itr.remove();
      }
    }
  }
}

//*******************************************************************************
/*Exception in thread "main" i1
  i2
  java.lang.UnsupportedOperationException
	at java.util.AbstractList.remove(Unknown Source)
	at java.util.AbstractList$Itr.remove(Unknown Source)
	at com.ConcurrModification.main(ConcurrModification.java:19)
*/