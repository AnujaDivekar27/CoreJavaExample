package com.example;

import java.io.FileNotFoundException;
import java.io.IOException;

class Parent2
{
  void m1() throws IOException
  {
	System.out.println("parent class m1 method throwing checked exception"); 
  }
}
public class MethodOverriding2  extends Parent2{
 
  void m1() throws ArithmeticException,FileNotFoundException
  {
	System.out.println("override parent class method throwing checked exception");  
  }
	
}
//*********************************************************************************
/* when parent class method throws unchecked exception then
   child class override method can throws unchecked exception or checked exception
   child class override method can throws unchecked exception and checked exception
   child class override cannot throws unchecked exception with more scope
*/