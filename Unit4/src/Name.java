//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class Name
{
	private String name;
	String [] ar;
	
	public Name()
	{
	}

	public Name(String s)
	{
		name = s;
	}

   public void setName(String s)
   {
	   	name = s;
   }

	public String getFirst()
	{
		ar = name.split(" ");
		return ar[0];
	}

	public String getLast()
	{
		ar = name.split(" ");
		return ar[1];
	}

 	public String toString()
 	{
 		return name;
	}
}