//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class Lab11c
{
   public static void main( String args[] )
   {
	   String l;
	   TriangleThree t = new TriangleThree();
	   Scanner keyboard = new Scanner(System.in);
	   while(true){
	   System.out.println("Enter letter");
	   l = keyboard.next();
	   System.out.println("Enter size");
	   t.setTriangle(keyboard.nextInt(), l);
	   System.out.println(t);
	   System.out.println("Do again? y or n");
	   if (keyboard.next().charAt(0) == 'n')
		   	break;
	   else 
		   System.out.print("\n");
	   }



	}
}