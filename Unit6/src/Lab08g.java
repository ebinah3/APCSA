//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class Lab08g
{
	public static void main ( String[] args )
	{
		LoopStats l = new LoopStats();
		Scanner keyboard = new Scanner(System.in);
		int s;
		do{
			System.out.println("Enter start number: ");
			s = keyboard.nextInt();
			System.out.println("Enter end number: ");
			l.setNums(s, keyboard.nextInt());
			System.out.println(l);
		}while(true);
		
		
		
		
		
					
	}
}