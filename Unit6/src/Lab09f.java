//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class Lab09f
{
	public static void main( String args[] )
	{
		Scanner s = new Scanner(System.in);
		LetterRemover p = new LetterRemover();
		String i;
		char c = 'c';
		do{
			System.out.println("Enter sentence or enter Quit: ");
			i = s.next();
			if (i.toUpperCase().equals("QUIT"))
				break;
			System.out.println("Enter character to remove: ");
			p.setRemover(i, s.next().charAt(0));
			System.out.println(p);
		}while(true);
		
		
					
	}
}