//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class StringChecker
{
	private String word;

	public StringChecker()
	{


	}

	public StringChecker(String s)
	{
		word = s;

	}

   public void setString(String s)
   {
	   word=s;
   }

	public boolean findLetter(char c)
	{
		for(int i = 0; i < word.length()-1; i++){
			if (word.charAt(i) == c)
				return true;
		}

		return false;
	}

	public boolean findSubString(String s)
	{
		for (int i = 0; i < word.length() - 1 - s.length(); i++){
			if (word.substring(i, i + s.length()).equals(s))
				return true;
		}
		return false;
	}

 	public String toString()
 	{
 		//System.out.println(word);
 		return word;
	}
}