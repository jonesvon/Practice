package Q3;

public class Q3 {

	public static void main(String[] args) {
		// use a while/loop and switch/case to count
		// the # of vowels in the string "how many vowels in this string?"

		String vowels1 = "aeiou";
		String words1 = "How many vowels in this string?";
		int counter = Integer.parseInt(vowels1);

		System.out.println("How many vowels is this string?");
		switch (words1) {

		case "a":
			vowels1 = words1;
			break;
		case "e":
			vowels1 = words1;
			break;
		case "i":
			vowels1 = words1;
			break;
		case "o":
			vowels1 = words1;
			break;
		case "u":
			vowels1 = words1;
			// default

			System.out.println("There are" + counter + "vowels in this string");

		}

	}
}
