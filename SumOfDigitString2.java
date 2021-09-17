package week2.day2;

public class SumOfDigitString2 {
public static void main(String[] args) {
	String text = "Tes12Le79af65";
	char text1;
  			int sum = 0;
  		int length = text.length();
  		for (int i = 0; i < length; i++) {
  			text1=text.charAt(i);
  			if(Character.isDigit(text1))
  			{
  				 int num = Character.getNumericValue(text1);
  				sum=sum+num;
			}
  		}
  			System.out.println("Sum of Digits: "+sum);
  			
}
}
