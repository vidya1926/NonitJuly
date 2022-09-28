package week1.day1;

public class LearnMobileMethods {

	// instance/global variable/class variable
	String brandName = "Samsung";
	int price = 32000;
	boolean buyMobile = false;
	long phNo = 2342838934l;

	// method dec as rt mn(){} calls //message,picture, playing, transactions,

	public long typeMessages() {
		long friendNo = 83638290207l;
		return friendNo;
	}

	public void makeCalls() {

		LearnMobileMethods ob = new LearnMobileMethods();
		long typeMessages = ob.typeMessages();
		System.out.println(typeMessages+3);
	}

	public static void main(String[] args) {
		LearnMobileMethods ob = new LearnMobileMethods();
		ob.makeCalls();
		ob.typeMessages();

	}

}
