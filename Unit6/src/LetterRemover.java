//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class LetterRemover
{
   private String sentence;
   private char lookFor;

	public LetterRemover()
	{
		setRemover("Sentence", 's');
	}

	public LetterRemover(String s, char rem){
		setRemover(s, rem);
	}
	
	public void setRemover(String s, char rem)
	{
		sentence = s;
		lookFor = rem;
	}

	public String removeLetters()
	{
		String cleaned=sentence;
	//	for (int i = cleaned.length(); i >= 0; i--){
		//	if (cleaned.charAt(i) == lookFor)
				cleaned = cleaned.replaceAll(Character.toString(lookFor), ""); 
//		}



		return cleaned;
	}

	public String toString()
	{
		return sentence + " - letter to remove " + lookFor + "\n" + removeLetters();
	}
}