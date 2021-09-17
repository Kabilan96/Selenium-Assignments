package week2.day2;

public class ReverseString2 {

public static void main(String[] args) {
	String test = "feeling good";
	String rev = "";
	
	char[]ch=test.toCharArray();
	int len=test.length();
	
	for(int i=len-1;i>=0;i--) {
		rev=rev+ch[i];
}
	System.out.println("Reversed String is:"+rev);
}	

}
