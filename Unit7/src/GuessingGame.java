//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;
import java.util.Random; 

public class GuessingGame
{
	private int upperBound;

	public GuessingGame(int stop)
	{
		upperBound = stop;
	}

	public void playGame()
	{
		Scanner keyboard = new Scanner(System.in);
		Random r = new Random();
		int answer = r.nextInt(upperBound) +1;
		int count = 0;
		while (true){
			System.out.println("Enter a number between 1 and " + upperBound);
			if (keyboard.nextInt() == answer){
				count++;
				System.out.println("Correct! It took you " + count + " guesses to guess " + answer);
				System.out.println("You guessed correct " + 100/count + "% of the time.");
				break;
			}
			else{
				System.out.println("Incorrect");
				count++;
			}
		}





	}

	public String toString()
	{
		String output="";
		return output;
	}
}