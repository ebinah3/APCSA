//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class Histogram
{
	private ArrayList<Integer> count;
	private ArrayList<Character> letters;
	private String fileName;

	public Histogram()
	{
		count = new ArrayList<Integer>();
		letters = new ArrayList<Character>();
	}

	public Histogram(char[] values, String fName)
	{
		this();
		for(int i =0; i<values.length; i++){
			letters.add(values[i]);
			count.add(0);
		}
		//Scanner s = new Scanner(new File(fName));
		//while(s.hasNext()){
		//	String st = s.next();
		//	for(int i =0; i < st.length(); i++){
				
		//	}
	//	}
		
		fileName = fName;



		out.println("search letters = "+letters);
	}

	public void loadAndAnalyzeFile() throws IOException
	{
		Scanner s = new Scanner(new File(fileName));
		while (s.hasNext()){
			String st = s.next();
			for(int i = 0; i<st.length(); i++){
				//for(int j =0; j<letters.size(); j++){
				for(Character c : letters)	
					if(st.charAt(i) == c){
						count.set(letters.indexOf(c), count.get(letters.indexOf(c))+1);
					}
				
			}
		}

	}

	public char mostFrequent()
	{
		int max = 0;
		char m = ' ';
		for(Integer i : count){
			if(i>max){
				max = i;
				m = letters.get(count.indexOf(i));
			}
		}
		return m;
	}

	public char leastFrequent()
	{
		int min = count.get(0);
		char m = letters.get(0);
		for(Integer i : count){
			if(i<min){
				min = i;
				m = letters.get(count.indexOf(i));
			}
		}
		return m;
	}

	public String toString()
	{
	   return fileName
	   + "\n" + letters
	   + "\n" + count + "\n\n\n";
	}
}