package Q3;

public class Q3 {

	public static void main(String[] args) {
		// use a while/loop and switch/case to count
		// the # of vowels in the string "how many vowels in this string?"

		

		String words1 = "How many vowels in this string?";
		int i = 0;
		int count = 0;
		//System.out.println("How many vowels is this string?");
		while (i < words1.length()) {
			char letter = words1.charAt(i);
			

			switch (letter) {

			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				count++;
				
				break;

			default:
				break;

			}
			i++;
		}
		System.out.println("There are " + count + " " +"vowels in this string.");
	}
}
