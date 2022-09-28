package week3day1;



public class ReverseTheGivenSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String word="I am Learning Java OOPs Concept";
	//Expected Output=>String rev="I ma gninraeL avaJ sPOO tpecnoC";
	//Step:1 -->Break the sentence into words-->string array-->split
		String[] split = word.split(" ");//[I,am,Learning, Java, OOPs,Concept]
	//Step:2-->travel to each word array		
		for(int i=0;i<split.length;i++) {
			if(i%2==0)
			{
			//step:3-->convert each word array into char array
			//split[0]-->I
			//split[1]-->[am]-->[a,m]
			//split[2]--->[Learning]-->[L,e,a,r,n,i,n,g]
			char[] charArray = split[i].toCharArray();
			
			for(int j=charArray.length-1;j>=0;j--) {
				//rev the chararray
				System.out.print(charArray[j]);
		    }
			System.out.print(" ");
			}
			else {
				System.out.println(split[i]);
			}
		//to convert String into character array
		
				// Print charArray[i]
			//charArray[0]-->I
			//[charArray[1]-->a,m
		
		
		
		
		
		
	   
		
		}
		
	
		
		 
		
		 
		 
		 
		
		
	}

}
