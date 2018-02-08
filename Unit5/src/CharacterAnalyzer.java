//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class CharacterAnalyzer
{
	private char theChar;

	public CharacterAnalyzer()
	{


	}

	public CharacterAnalyzer(char c)
	{

		theChar = c;
	}

	public void setChar(char c)
	{
		theChar = c;
	}

	public char getChar()
	{
		return theChar;
	}

	public boolean isUpper( )
	{
		if ((int) theChar > 64 && (int) theChar < 91)
			return true;


		return false;
	}

	public boolean isLower( )
	{
		if ((int) theChar > 96 && (int) theChar < 123)
			return true;


		return false;
	}
	
	public boolean isNumber( )
	{
		if ((int) theChar > 47 && (int) theChar < 58)
			return true;


		return false;
	}	

	public int getASCII( )
	{
		return (int) theChar;
	}

	public String toString()
	{
		if (isUpper() == true)
			return getChar() + " is an uppercase character. ASCII == " + getASCII() + "\n";	
		else if (isLower() == true)
			return getChar() + " is a lowercase character. ASCII == " + getASCII() + "\n";	  
		else if (isNumber() == true)
			return getChar() + " is a number. ASCII == " + getASCII() + "\n";
		else 
			return getChar() + " is not an uppercase character, a lowercase character, or a number. ASCII == " + getASCII() + "\n";
	}
}