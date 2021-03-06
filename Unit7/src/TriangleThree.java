//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class TriangleThree
{
   private int size;
   private String letter;

	public TriangleThree()
	{
		size = 0;
		letter = "-";
	}

	public TriangleThree(int count, String let)
	{
		size = count;
		letter = let;
	}

	public void setTriangle(int sz, String let)
	{
		size = sz;
		letter = let;
	}

	public String getLetter()
	{
		return letter;
	}

	public String toString()
	{
		String output="";
		for (int i = 1; i <= size; i++){
			for (int j = 0; j < size -i; j++)
				output = output + " ";
			for (int k = 0; k < i; k++)
				output = output + letter;
			output = output + "\n";
		}
		return output+"\n";
	}
}