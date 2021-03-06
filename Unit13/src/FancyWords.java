//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Arrays;
import java.util.Scanner;
import java.util.Collections;
import static java.lang.System.*;

public class FancyWords
{
	private String[] wordRay;

	public FancyWords(String sentence)
	{
		setWords(sentence);
	}

	public void setWords(String sentence)
	{
		int i =0;
		Scanner s = new Scanner(sentence);
		Scanner sc = new Scanner(sentence);
		while(s.hasNext()){
			i++;
			s.next();
		}
		wordRay = new String[i];
		for(int j =0; j<i; j++){
			wordRay[j] = sc.next();
		}
	}

	public String toString()
	{
		String output="";
		int max = Integer.MIN_VALUE;
		for(int i =0; i<wordRay.length; i++){
			if(wordRay[i].length()>max){
				max = wordRay[i].length();
			}
		}
		
		int j = 1;
		while(j<max+1){
			for(int i = wordRay.length-1; i>=0;i--){
				if(wordRay[i].length()-j >=0)
				output+=wordRay[i].charAt(wordRay[i].length()-j);
					//System.out.println(wordRay[i].charAt(wordRay[i].length())-j);
				else
					output += " ";
					//System.out.println(" ");
			}
			j++;
			output+= "\n";
		}

		return output+"\n\n";
	}
}