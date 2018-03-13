//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class Word implements Comparable<Word>
{
	private String word;

	public Word( String s )
	{
		word = s;

	}

	public int compareTo( Word rhs )
	{
		if(toString().equals(rhs.toString()))
			return 0;
		if(toString().length() > rhs.toString().length())
			return 1;
		else if(toString().length() == rhs.toString().length()){
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