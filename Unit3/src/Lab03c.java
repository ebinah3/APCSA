//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;

public class Lab03c
{
	public static void main( String[] args )
   {
		Quadratic q = new Quadratic();
		Scanner s = new Scanner(System.in);
		int a, b;
		do{
			System.out.println("Enter a");
			a= s.nextInt();
			System.out.println("Enter b");
			b = s.nextInt();
			System.out.println("Enter c");
			q.setEquation(a, b, s.nextInt());
			q.calcRoots();
			q.print();
			System.out.println("Quit? Y or N");
			if (s.next().equals("Y"))
				break;
		}while(true);
	}
}