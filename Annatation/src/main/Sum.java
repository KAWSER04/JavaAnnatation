package main;
import java.io.*;
import java.util.Scanner;

/**
 * <h1>add two numbers!</h1>
 * the sum program implement 
 * simply add two numbers
 * the output on the screen
 * <p>
 * <b>Note:</b>given proper comments in your program makes it more
 * user friendly it is assumed a high quality code
 * 
 * 
 * @author kawser ahmed
 * 
 *
 */

public class Sum {
     /**
      * this method is used two integer.this is
      * a the simplest from of a class method,just to
      * show the usage of various javadoc tags,
      * @param sum1 this is the frist parameter to sum method
      * @param sum2 this is the second parameter to sum method
      * @return int this returns sum of num1 and num2
      */
	
	public int sum(int num1,int num2) {
		return num1+num2;
	}
	
	
	  /**
     * this method is used two integer.this is
     * a the simplest from of a class method,just to
     * show the usage of various javadoc tags,
     * @param sum1 this is the frist parameter to sum method
     * @param sum2 this is the second parameter to sum method
     * @return int this returns subtractor of num1 and num2
     */
	
	public int subtractor(int num1,int num2) {
		return num1+num2;
	}
	

	  /**
   * this method is used two integer.this is
   * a the simplest from of a class method,just to
   * show the usage of various javadoc tags,
   * @param sum1 this is the frist parameter to sum method
   * @param sum2 this is the second parameter to sum method
   * @return int this returns multiplication of num1 and num2
   */
	
	public int multiplication(int num1,int num2) {
		return num1*num2;
	}
	
	

	  /**
 * this method is used two integer.this is
 * a the simplest from of a class method,just to
 * show the usage of various javadoc tags,
 * @param sum1 this is the frist parameter to sum method
 * @param sum2 this is the second parameter to sum method
 * @return int this returns division of num1 and num2
 */
	
	
	public int division(int num1,int num2) {
		return num1/num2;
	}
	
	
	public static void main(String[] arg) {
		Scanner input=new Scanner(System.in);
		Sum obj=new Sum();
		
		int num1=input.nextInt();
		int num2=input.nextInt();
		
		System.out.println(obj.sum(num1,num2));
		System.out.println(obj.subtractor(num1,num2));
		System.out.println(obj.multiplication(num1,num2));
		System.out.println(obj.division(num1,num2));
	}
}
