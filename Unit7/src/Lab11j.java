//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class Lab11j
{
   public static void main(String args[])
   {
	   Triples t = new Triples();
	   String input;
	   //int input;
	   Scanner s = new Scanner(System.in);
	   while(true){
		   System.out.println("Enter number");
		   input = s.next();
		   if(input.toUpperCase().equals("QUIT"))
			   break;
		   t.setNum(Integer.parseInt(input));
		 //  t.findSets();
		   System.out.println(t);
	   }
	}
}