//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class Worde implements Comparable<Word>
{
	private String word;

	public Worde( String s)
	{
		word = s;
	}

	private int numVowels()
	{
		String vowels = "AEIOUaeiou";
		int vowelCount=0;
		for (int i = 0; i<word.length(); i++){
			if(vowels.includes(word.substring(i, i+1))){
				
			}
		}






		return vowelCount;
	}

	public int compareTo(Word rhs)
	{



	
		return -1;
	}

	public String toString()
	{
		return word;
	}
}