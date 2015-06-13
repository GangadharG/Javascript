// Program to reverse the words in a Sentence.
public class ReverseSentence {

	// StringBuffer to store input and then manipulate it to get output
	static StringBuffer input = new StringBuffer("Palace a is This");
	
	public static void main(String args[]){
		
		System.out.println("Input: "+input);
		int start =0, end;		// start, end ->  start and end of the word respectively
		// loop through the sentence
		for(int i=0; i<input.length(); i++){
			
			// condition that checks the end of the word
			if(input.charAt(i)==' ' || i==(input.length()-1)){
				if(i== input.length()-1){
					end = i;
				}else{
					end = i-1;
				}
				reverse(start,end); 	// Calling reverse function to swap the word
				start=i+1;
			}
			// swapping whole sentence at the end.
			if(i== input.length()-1){
				reverse(0,input.length()-1);
				System.out.println("Output: "+input);
			}
		}
	}
	
	// Reverse function - reverses the whole word
	public static void reverse(int start, int end){
		
		char temp;
		while(start < end){
			temp = input.charAt(start);
			input.setCharAt(start, input.charAt(end));
			input.setCharAt(end, temp);
			start++;
			end--;
		}
	}
}
