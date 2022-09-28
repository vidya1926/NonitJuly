package week6day2;

import org.openqa.selenium.NoSuchElementException;

public class Learningnestedtrycatch {

	public static void main(String[] args) {
		
		int x=10;
		int y=0;
		int z,a;
		
		try {
			z=x/y;			
		    } 
			catch (ArithmeticException e) {
				try {
					a=x/y;
				}catch(ArithmeticException exp)
				{
					System.out.println(exp);
				}
			System.out.println("Arithmetic Exception");
		 }
		System.out.println("Learning Exception");

	}

}
