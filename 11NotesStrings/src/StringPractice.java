import java.util.Scanner;

public class StringPractice {

	public static void main(String[] args) {
		// Create our Case switching class 
		//Switch testSwitch = new Switch();
		NumberLetter convertThis = new NumberLetter();
		//System.out.println(testSwitch.switchcase("ThisStrIngIsInMIxedCaSE"));
		//System.out.println(testSwitch.switchcase("ThisStrIngIsInMIxedCaSE"));
	}

}

class Switch {
	Switch() {
		
	}
	String switchCase(String str, boolean ucase) {
		// Check the boolean
		String returnString;
		// if ucase is true
		if (ucase == true) {
			// Return the string in UPPER CASE
			returnString = str.toUpperCase();
		}
		// else
		else {
			// Return the string in LOWER CASE
			returnString = str.toLowerCase();
		}
		return(returnString);
	}
}

class NumberLetter {
	
	NumberLetter() {
	
	String numWord = "";
	
	System.out.println("You need to enter in words with number instead of spaces or random letters and numbers...");
	System.out.print("Enter: ");
	Scanner keyboard = new Scanner(System.in);
	
	numWord = keyboard.next();
	String MyString = new String(numWord);
	
	int totalNum = MyString.length();
	int letterAt = 1;
	char cur;
	cur = MyString.charAt(letterAt);
	
	while(letterAt != totalNum) {	
		if(cur >= '0' && cur <= '9'){
			System.out.print("#");
		}
		else {
			System.out.print(cur);
			}
		cur = MyString.charAt(letterAt);
		letterAt++;
	}
	
	
	
	
	}
} 



























