package week2.day2;

public class SumOfDigitString1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String test = "Test12Le79af65";
		int sum = 0;

		String replace = test.replaceAll("[\\D]", "");
		System.out.println(replace);
		char[] ch = replace.toCharArray();
		System.out.println(ch);
		for (int i = 0; i <= ch.length - 1; i++) {
			int num = Character.getNumericValue(ch[i]);
			sum = sum + num;

		}

		System.out.println(sum);
		 
	}

}
