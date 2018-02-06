//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;

public class Lab02g
{
	public static void main( String[] args )
	{
		Fahrenheit f = new Fahrenheit();
		Scanner reader = new Scanner(System.in);
		do{
			System.out.println("Enter fahrenheit degree: ");
			f.setFahrenheit(reader.nextInt());
			f.print();
		}while(true);
	}
}