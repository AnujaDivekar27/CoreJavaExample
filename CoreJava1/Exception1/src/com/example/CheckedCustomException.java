package com.example;

class AgeException extends Exception
{
	AgeException()
	{
	   System.out.println("you are under age");	
    }
	AgeException(String msg)
	{
	   System.out.println(msg);	
    }
	
}
public class CheckedCustomException {

  public static void main(String[] args) throws AgeException {
	  
	 int age=17;
	
	 if(age<18)
	 {
		 throw new AgeException();
	 }
	 else
	 {
		 System.out.println("your age is not eligible");
	 }
    
    	 System.out.println("AgeException is checked exception");	
	}
}
//*****************************************************************************************
  /*you are under age
    Exception in thread "main" com.example.AgeException
	at com.example.CustomDemo.main(CustomDemo.java:23)*/
//In case of checked exception you need to write try-catch block compulsary 
//or write throws keyword after method which throw exception otherwise prog wont compile
//*****************************************************************************************