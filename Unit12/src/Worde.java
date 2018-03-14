//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class Worde implements Comparable<Worde>
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
			if(vowels.contains(word.substring(i, i+1))){
				vowelCount++;
			}
		}

		return vowelCount;
	}

	public int compareTo(Worde rhs)
	{
		if(toString().equals(rhs.toString()))
			return 0;
		if(numVowels()>rhs.numVowels()){
			return 1;
		}
		else if(numVowels() == rhs.numVowels()){
			for(int i = 0; i < toString().length(); i++){
				if((int) toString().charAt(i) > (int) rhs.toString().charAt(i)){
					return 1;
				}
				else if((int) toString().charAt(i) < (int) rhs.toString().charAt(i))
					return -1;
			}
		}


	
		return -1;
	}

	public String toString()
	{
		return word;
	}
}