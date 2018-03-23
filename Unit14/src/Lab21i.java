//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class Lab21i
{
	public static void main( String args[] ) throws IOException
	{
		int size;
		String input;
		Scanner sc = new Scanner(new File("C:\\Users\\ebinah6199\\Desktop\\APCSA\\Unit14\\src\\lab21i.dat"));
		size = Integer.parseInt(sc.nextLine());
		input = sc.nextLine();
		Maze m = new Maze(size, input);
		System.out.println(m);
		size = Integer.parseInt(sc.nextLine());
		input = sc.nextLine();
		Maze mm = new Maze(size, input);
		System.out.println(mm);
		size = Integer.parseInt(sc.nextLine());
		input = sc.nextLine();
		Maze mmm = new Maze(size, input);
		System.out.println(mmm);
		size = Integer.parseInt(sc.nextLine());
		input = sc.nextLine();
		Maze mmmm = new Maze(size, input);
		System.out.println(mmmm);
		size = Integer.parseInt(sc.nextLine());
		input = sc.nextLine();
		Maze mmmmm = new Maze(size, input);
		System.out.println(mmmmm);
		size = Integer.parseInt(sc.nextLine());
		input = sc.nextLine();
		Maze mmmmmm = new Maze(size, input);
		System.out.println(mmmmmm);
	}
}