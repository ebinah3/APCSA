//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class Lab24d
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner (new File("Lab24d.dat"));
		int i = Integer.parseInt(file.nextLine());
		TicTacToe t = new TicTacToe();
		for(int j =0; j<i;j++){
			t.set(file.nextLine());
			System.out.println(t);
		}






	}
}



