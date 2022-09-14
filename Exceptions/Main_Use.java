// we can create custom exception also
package Exceptions;

public class Main_Use {
	
	
	public static void main(String[] args)
	{
		
		
		try {
		
			System.out.println(divide(10,1));
			System.out.println(agevalidation(-5));
		}
		catch(DIVIDEBYZEROException e)
		{
		 	System.out.println("error in dividing with zero");
		}
		
		catch(LESSTHANZEROException f)
		{
			System.out.println("Enter age greater than zero");
		}
		
//		finally
//		{
//			System.out.println("error thrown by main function");
//		}
	}
	public static  int divide(int a, int b)  throws DIVIDEBYZEROException
	{
		if(b==0)
		{
			throw new DIVIDEBYZEROException();
		}
	  return a/b;
	}
	public static int agevalidation(int c) throws LESSTHANZEROException
	{
		if(c<0)
		{
			throw new LESSTHANZEROException();
		} 
		else if(c<18)
		{
			System.out.println("not eligible for vote");
		}
		else
		{
		System.out.println("Eligible for vote");	
		}
		return c;	
	}
}
