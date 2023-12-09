package com.example;       // Exception(unchecked exception)-> java.lang package ParentClass->Throwable(partial checked)

public class ExcetionDemo1 {

	public static void main(String[] args) {
		
		/*System.out.println("statement1");
		System.out.println(10/0);           //ArithmaticException->runtime exception occur
		System.out.println("statement2");
		*/
		
		/*************************************************************************************
		statement1

		Exception in thread "main" java.lang.ArithmeticException: / by zero
			at com.example.ExcetionDemo1.main(ExcetionDemo1.java:8)
		*/
		
		//************************************************************************************
		
		System.out.println("statement1");
		
		try 
		{  
			System.out.println("statement2");
			System.out.println(10/0); //ArithmaticException->runtime exception occur
			System.out.println("statement3");
		}
		 
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		System.out.println("statement3");
	
		
		//***********************************************************************************
		
		/*statement1
		  statement2
		  
		  exception occur at sop(10/0)-> line after sop(10/0) never print
		  
		  java.lang.ArithmeticException: / by zero
		
		  statement3
		*/
       
		//due to try-catch block prog normal flow not terminate abnormally
		
	   //************************************************************************************
	
	
	}
}

