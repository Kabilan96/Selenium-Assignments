package week2.day2;

public class ReverseEvenWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String test = "I am a software tester"; 
		String[] splitArray = test.split(" ");
		System.out.println("The Original Test:"+test);
		System.out.println("Reversed Even Words :");
		for (int i = 0; i < splitArray.length; i++) {
			if(i%2!=0)
			{
				
				int length = splitArray[i].length();
				
				for(int j=length-1;j>=0;j--)
				{
					System.out.print(splitArray[i].charAt(j));
				}
				System.out.print(" ");
			}
			else
			{
				System.out.print(splitArray[i]+ " ");
			}
					
			}
		
	}

}
