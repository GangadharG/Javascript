// Input - A string with repeating words
// Output - 4th character in the repeating word

public class NthRepeatingCharacter {
	static StringBuffer input = new StringBuffer("mangomangomangomangomango");
	static StringBuffer repeatingWord = new StringBuffer(); // to store the repeated word

	public static void main(String[] args) {

		System.out.println("Input: " + input);
		// loop through the stringBuffer
		for (int i = 0; i < input.length(); i++) {
			find(input.charAt(i));
		}
		System.out.println("The repeating word in the string is: "
				+ repeatingWord);
	}

	static void find(char ch) {
		boolean b = false; // boolean to find a character is new or not.
		// for loop iterates through the already finded repeated word.
		for (int j = 0; j < repeatingWord.length(); j++) {
			if (repeatingWord.charAt(j) == ch) { // comparing each ch. in
													// repeating word with ch.
													// in the input string
				b = true;
			}
		}
		if (b == false) {
			repeatingWord.append(ch);
			// finding 4th character of the repeating word
			if (repeatingWord.length() == 4)
				System.out.println("4th reapeating character is "
						+ repeatingWord.charAt(3));
		}
	}
}
