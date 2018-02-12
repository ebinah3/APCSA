//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;

public class Lab10e
{
	public static void main(String args[])
	{
		Scanner keyboard = new Scanner(System.in);
		char response;
		while(true){
		System.out.println("Guessing Game - how many numbers?");
		GuessingGame g = new GuessingGame(keyboard.nextInt());
		g.playGame();
		
		
		System.out.println("Do you want to keep playing? y or n");
		if (keyboard.next().charAt(0) == 'n')
				break;
		}
	}
}