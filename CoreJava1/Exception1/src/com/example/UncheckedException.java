package com.example;

class AgeException1 extends RuntimeException {

	AgeException1() {
		System.out.println("you are under age");
	}

	AgeException1(String msg) {
		System.out.println(msg);
	}

}

public class UncheckedException {

	public static void main(String[] args)  {
		
		int age = 17;
        try
        {
		  if (age < 18) {
			throw new AgeException1();
		    } else {
			System.out.println("your age is not eligible");
		    }
        }
        catch(AgeException1 e)
        {
        	System.out.println(e); //com.example.AgeException1
        }
		System.out.println("AgeException is checked exception");
	}
}
//*******************************************************************************
/* o/p without try catch block,with throws keyword 
 *  you are under age
    Exception in thread "main" com.example.AgeException1
	at com.example.UncheckedException.main(UncheckedException.java:22)*/
//*******************************************************************************
/* o/p without try catch block,throws keyword     
    Exception in thread "main" you are under age
    com.example.AgeException1
	at com.example.UncheckedException.main(UncheckedException.java:22)*/
//*******************************************************************************
/* o/p try catch block,without throws keyword ->normal termination of program
    you are under age
    com.example.AgeException1
    AgeException is checked exception */
//*******************************************************************************    

