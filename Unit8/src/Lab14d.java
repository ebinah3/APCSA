//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;

public class Lab14d
{
	public static void main( String args[] )
	{
		//add test cases
		
		int n;
		
		Scanner s = new Scanner(System.in);
		System.out.println("How many grades?");
		n = s.nextInt();
		double[] grades = new double[n];
		Grades g = new Grades();
		for (int i = 0; i < n; i++){
			System.out.println("Enter grade");
			grades[i] = s.nextDouble();
		}
		g.setGrades(grades);
		System.out.println(g);
		
	}
}