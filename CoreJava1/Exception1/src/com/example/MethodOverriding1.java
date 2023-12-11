package com.example;

class Parent{
  void m1()  //without throwing any exception
  {
	 System.out.println("parent class m1 method without throwing exception");  
  }
}


public class MethodOverriding1 extends Parent {
  
  void m1() throws ArithmeticException //throws only unchecked exception allowed 
                                       //Don't throws checked exception->ce 
  {
	 int i=10;
	 System.out.println("override m1 method with unchecked exception");
	 System.out.println(10/0);
  }
	
  public static void main(String[] args) {
	
	  MethodOverriding1 m=new MethodOverriding1();
	  m.m1();
	  System.out.println("not handling exception");  // will never execute
 }	
}

//************************************************************************************
 /*  o/p without try-catch block,override super class method with unchecked exception
 *   super class method without throwing any exception 
 *  
 *  override m1 method with unchecked exception
    Exception in thread "main" java.lang.ArithmeticException: / by zero
	at com.example.MethodOverriding1.m1(MethodOverriding1.java:19)
 */
//************************************************************************************
	
	

