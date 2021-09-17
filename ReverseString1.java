package week2.day2;

public class ReverseString1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String test = "feeling good";
		String rev = "";
		
		int length = test.length();
		
		for(int i=length-1;i>=0;i--) {
            rev=rev+test.charAt(i);	
		}
	    
		System.out.println("Reversed String is:"+rev);
	
	}
}
