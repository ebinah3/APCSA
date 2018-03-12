package act6;

import static java.lang.System.out;

import java.io.File;
import java.util.Scanner;

public class GradeBookFileRunner6 {
	 public static void main( String args[] ) throws Exception
	   {
			out.println("Welcome to the Class Stats program!");
			
			Scanner file = new Scanner(new File("C:\\Users\\ebinah6199\\Desktop\\APCSA\\Unit11\\src\\gradebook.dat"));
			Class6 c = new Class6(file);
			out.println(c);

			out.println("Failure List = " + c.getFailureList(70));	
			out.println("Highest Average = " + c.getStudentWithHighestAverage());
			out.println("Lowest Average = " + c.getStudentWithLowestAverage());
									
			out.println(String.format("Class Average = %.2f",c.getClassAverage()));			









		}		
}
