//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;

public class Lab03d
{
	public static void main( String[] args )
	{
		Scanner s = new Scanner(System.in);
		Distance d = new Distance();
		int x1, x2, y1;
		do{
			System.out.println("Enter x coordinate of first point");
			x1 = s.nextInt();
			System.out.println("Enter y coordinate of first point");
			y1 = s.nextInt();
			System.out.println("Enter x coordinate of second point");
			x2 = s.nextInt();
			System.out.println("Enter y coordinate of second point");
			d.setCoordinates(x1, y1, x2, s.nextInt());
			d.calcDistance();
			d.print();
			System.out.println("Quit? Y or N");
			if (s.next().equals("Y"))
				break;
		}while(true);
	}
}