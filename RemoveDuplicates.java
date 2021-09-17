package week2.day2;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			String text = "we learn java basics as part of java sessions in java week1";
			int count = 0;
			String replace = "";
			String[] split = text.split(" ");

			for (int i = 0; i < split.length; i++) {

				for (int j = i + 1; j < split.length; j++) {

					if (split[i].equals(split[j])) {
						count = count + 1;
					}
				}

				if (count > 1) {
					replace = text.replaceAll(split[i], "");

					System.out.println("Removed Duplicates::"+replace);
					break;
				}
			}
	}

}
