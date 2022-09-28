package week6day2;

import org.openqa.selenium.NoSuchElementException;

public class ExceptionHandling {

	public static void main(String[] args) {
		
		int x=10;
		int y=0;
		int z,a;
		
		try {
			z=x/y;
		    } catch (ArithmeticException e) {
			System.out.println("Arithmetic Exception");
		 }catch(NoSuchElementException n) {
			 System.out.println(n);
		 }catch(Exception e)
		{
			System.out.println("Generalized Exception");
		}
		System.out.println("Learning Exception");

	}

}
