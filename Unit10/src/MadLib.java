//� A+ Computer Science  -  www.apluscompsci.com
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
import java.util.Random;

public class MadLib
{
	private ArrayList<String> verbs;
	private ArrayList<String> nouns;
	private ArrayList<String> adjectives;
	private String sentence;
	
	Random r = new Random();
	public MadLib()
	{
		verbs = new ArrayList<String>();
		nouns = new ArrayList<String>();
		adjectives = new ArrayList<String>();
		sentence = "";
	}

	public MadLib(String fileName)
	{
		//load stuff
		this();
		loadNouns();
		loadVerbs();
		loadAdjectives();
		
		
		try{
			Scanner file = new Scanner(new File(fileName));
			while(file.hasNextLine()){
				sentence = file.nextLine();
			}
		}
		catch(Exception e)
		{
			out.println("Houston we have a problem!");
		}
		
	}

	public void loadNouns()
	{
		try{
			Scanner file = new Scanner(new File("C:\\Users\\ebinah6199\\Desktop\\APCSA\\Unit10\\src\\nouns.dat"));
			while(file.hasNextLine()){
				nouns.add(file.nextLine());
			}
			
		}
		catch(Exception e)
		{
		}	
		
	}
	
	public void loadVerbs()
	{
		try{
			Scanner file = new Scanner(new File("C:\\Users\\ebinah6199\\Desktop\\APCSA\\Unit10\\src\\verbs.dat"));
			while(file.hasNextLine()){
				verbs.add(file.nextLine());
			}
	
		}
		catch(Exception e)
		{
		}
	}

	public void loadAdjectives()
	{
		try{
			Scanner file = new Scanner(new File("C:\\Users\\ebinah6199\\Desktop\\APCSA\\Unit10\\src\\adjectives.dat"));
			while(file.hasNextLine()){
				adjectives.add(file.nextLine());
			}
	
		}
		catch(Exception e)
		{
		}
	}

	public String getRandomVerb()
	{
		
		return verbs.get(r.nextInt(verbs.size()));
	}
	
	public String getRandomNoun()
	{
		
		return nouns.get(r.nextInt(nouns.size()));
	}
	
	public String getRandomAdjective()
	{
		
		return adjectives.get(r.nextInt(adjectives.size()));
	}		

	public String getSentence(){
		return sentence;
	}
	

	public String toString()
	{
		int  r= sentence.length();
		String s = sentence;
		for(int i = 0; i <r; i++){					
			if(s.charAt(i) == '#'){			
				String n = getRandomNoun();
				s = s.substring(0, i) + n + s.substring(i+1);
				r = s.length();
			}		
			else if(s.charAt(i) == '@'){			
				String n = getRandomVerb();
				s = s.substring(0, i) + n + s.substring(i+1);
				r = s.length();
			}		
			else if(s.charAt(i) == '&'){		
				String n = getRandomAdjective();
				s = s.substring(0, i) + n + s.substring(i+1);
				r = s.length();
			}
		}
		return s;
	}
}








