//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;
import java.lang.Math;
import java.util.Scanner;

public class Lab08i
{
	public static void main ( String[] args )
	{
		Scanner s = new Scanner(System.in);
		Prime p = new Prime();
		String i;
		do{
			System.out.println("Enter number or enter Quit: ");
			i = s.next();
			if (i.toUpperCase().equals("QUIT"))
				break;
			p.setPrime(Integer.parseInt(i));
			System.out.println(p);
		}while(true);

		
		
		
		
		
		
		
	}	
}