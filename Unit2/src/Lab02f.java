//© A+ Computer Science  -  www.apluscompsci.com
//Name - Haruki Ebina
//Date - 2/5/18
//Class - Period 2
//Lab02f           

import java.util.Scanner;

public class Lab02f
{
	public static void main( String[] args )
   {
		Scanner keyboard = new Scanner(System.in);
		Line l = new Line();
		int x1;
		int y1; 
		int x2; 
		int y2;
		do{
			System.out.println("Enter the first x coordinate: ");
			x1 = keyboard.nextInt();
			System.out.println("Enter the first y coordinate: ");
			y1 = keyboard.nextInt();
			System.out.println("Enter the second x coordinate: ");
			x2 = keyboard.nextInt();
			System.out.println("Enter the second y coordinate: ");
			y2 = keyboard.nextInt();
			l.setCoordinates(x1, y1, x2, y2);
			l.calculateSlope();
			l.print();
		}while(true);
		
		
		
	}
}