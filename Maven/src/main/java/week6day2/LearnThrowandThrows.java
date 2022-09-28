package week6day2;

public class LearnThrowandThrows {
	
	
	public int sum(int x, int y) {
		if(x>y) {
			x=x+y;
			System.out.println(x);
		}else {
			throw new ArithmeticException();
		}
		return x;
	}
	

	public static void main(String[] args) throws InterruptedException {
		LearnThrowandThrows obj=new LearnThrowandThrows();
		Thread.sleep(2000);
		try {
			obj.sum(3, 7);
		} catch (Exception e) {
			obj.sum(13, 7);
			}
		
		

	}

}
