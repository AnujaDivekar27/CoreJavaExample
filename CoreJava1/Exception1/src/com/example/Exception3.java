package com.example;

public class Exception3 {

 public static void main(String[] args) {
	
   //String s=null;
   try
   {
	 System.out.println("inside try block...");
	 System.out.println("stmt1");
	 //System.out.println(10/0);
	 System.out.println("stmt3");
   }

   catch(ArithmeticException e)
   {
	   System.out.println("inside catch block");
	   System.out.println("stmt4");
	   //System.out.println(s.length());
   }
   finally {
	   System.out.println("inside finally block");
	   System.out.println("stmt5"+" "+10/0);
   }
   System.out.println("stmt6");
 }
}
//**********************************************************************
/* when exception not raised 
 * inside try block...
   stmt1
   stmt2
   stmt3
   inside finally block
   stmt5
   stmt6 */
//**********************************************************************

//when exception raised at stmt2 nd curr.catch block matched
/* inside try block...
   stmt1
   inside catch block
   stmt4
   inside finally block
   stmt5
   stmt6 */
//**********************************************************************
//when exception raised at stmt2 nd curr.catch block not matched
/* inside try block...
   stmt1
   Exception in thread "main"  //stmt2 exception raised
   inside finally block
   stmt5
   java.lang.ArithmeticException: / by zero
   at com.example.Exception3.main(Exception3.java:11) */
//***********************************************************************
//when exception raised in inside finally block
/* inside try block...
   stmt1
   stmt3
   inside finally block
   Exception in thread "main" java.lang.ArithmeticException: / by zero
   at com.example.Exception3.main(Exception3.java:24)
*/