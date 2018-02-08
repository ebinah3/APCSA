//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class Lab05d
{
	public static void main ( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		
		out.print("Enter a letter :: ");
		char letter = keyboard.next().charAt(0);
		CharacterAnalyzer test = new CharacterAnalyzer(letter);
		out.println(test);   //A
		String input;
		
		do{
			out.print("Enter a letter :: ");
			input = keyboard.next();
			if (input.equals("Quit")){
				System.out.println("Bye");
				break;
			}
			else{
				letter = input.charAt(0);
				test.setChar(letter);
				out.println(test);
			}
		}while(true);
		//add more test cases
		
		
		
		
		
		
		
		

	}
}