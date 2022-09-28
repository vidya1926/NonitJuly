package week6day2;

public class Learnfinally {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 int x=10;
		 int y=0;
		 int z;
		 
		try {
			z = x / y;
		} 
		finally {
		System.out.println("I am from finally block");
		}
		 
		 System.out.println("I am outside the trycatchfinally block");
	}

}
