package com.example;

//try with multiple block must follow child-parent exception order
//otherwise compile error occurred

public class Exception2 {
	
  public static void main(String[] args) {
	
   System.out.println("stmt before try block");	  
   try
   {
	 System.out.println("stmt before exception occured....");
	 System.out.println(10/0);
	 System.out.println("stmt after exception occured....");
   }
   catch (Exception e) 
   {
	 System.out.println("Parent Exception class..."); 
   }

  /* catch (ArithmeticException e) 
   {
	 System.out.println("ArithmaticException class..."); 
   }*/

  }	
	
}
