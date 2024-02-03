/**
 * Adler Luders
 * COP 3337
 * Assignment 1
 * 11 Jan 2024
 */

import java.util.*;

public class Calculator {
/*	Variables*/
	private double num;
	
	/*Constructor*/
	public Calculator() {
		this.num = 0.0;
	}
	
/*	Methods */
	
	//add the parameter to the member field
	public void add(double val) {
		this.num = this.num + val;
	};
	
//	subtract the parameter from the member field
	public void subtract(double val) {
		this.num=this.num - val;
	};
	
//	multiply the member field by the parameter
	public void multiply(double val) {
		this.num = this.num * val;
	}
	
//	divide the member by the parameter
	public void divide(double val) {
		this.num = this.num / val;
	}
	
//	set the member field to 0.0
	public void clear() {
		this.num = 0.0;
	}
	
//	return the member field
	public double getValue() {
		return this.num;
	}

	public static void main(String[] args) {
		Calculator calc = new Calculator();

		Scanner scan = new Scanner(System.in);
		
		double num1 = scan.nextDouble();
		double num2 = scan.nextDouble();
		
//		initial value
		System.out.println(calc.getValue());
		
//		The value after adding num1
		calc.add(num1);
		System.out.println(calc.getValue());
		
//		The value after multiplying by 3
		calc.multiply(3.0);
		System.out.println(calc.getValue());
		
//		The value after subtracting num2
		calc.subtract(num2);
		System.out.println(calc.getValue());
		
//		The value after dividing by 2
		calc.divide(2);
		System.out.println(calc.getValue());
		
//		The value after calling the clear() method
		calc.clear();
		System.out.println(calc.getValue());
		
		
		scan.close();

	}

}
