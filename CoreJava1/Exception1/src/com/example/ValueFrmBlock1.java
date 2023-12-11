package com.example;

//when try,catch nd finally block return value,finally block override return value
//any statement after finally block return value not allowed->ce(unreachable code)

public class ValueFrmBlock1 {
 
 public static void main(String[] args) {
	ValueFrmBlock1 v=new ValueFrmBlock1();
	System.out.println("method retuning value"+" "+v.abc());
 } 
 
 static int abc()
 {
   try
   {
	   System.out.println("inside try block...");
	   System.out.println(10/0);
	   return 10;
   }
   catch (Exception e) {
	   System.out.println("inside catch block...");
	   return 10;
   }
   
   finally {System.out.println("inside finally  block..."); 
	   return 30;}
  }
  //System.out.println("exception hadled....."); not allowed after finally return value
 
}//class closing

//*********************************************************************************
  /*inside try block...
  inside catch block...
  inside finally  block...
  method returning value 30 */
