//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class Lab16e
{
	public static void main( String args[] ) throws IOException
	{
		Histogram test = new Histogram(new char[]{'a','b','c'},"C:\\Users\\ebinah6199\\Desktop\\APCSA\\Unit10\\src\\lab16e1.dat");
		test.loadAndAnalyzeFile();
		out.println("Letter occurring most : "+test.mostFrequent());
		out.println("Letter occurring least : "+test.leastFrequent());
		out.println("\n");
		out.println(test);
		
		Histogram tes = new Histogram(new char[]{'d','e','a'},"C:\\Users\\ebinah6199\\Desktop\\APCSA\\Unit10\\src\\lab16e2.dat");
		tes.loadAndAnalyzeFile();
		out.println("Letter occurring most : "+tes.mostFrequent());
		out.println("Letter occurring least : "+tes.leastFrequent());
		out.println("\n");
		out.println(tes);
		
		Histogram te = new Histogram(new char[]{'x', 'a', 'r', 'g'},"C:\\Users\\ebinah6199\\Desktop\\APCSA\\Unit10\\src\\lab16e3.dat");
		te.loadAndAnalyzeFile();
		out.println("Letter occurring most : "+te.mostFrequent());
		out.println("Letter occurring least : "+te.leastFrequent());
		out.println("\n");
		out.println(te);
	}
}