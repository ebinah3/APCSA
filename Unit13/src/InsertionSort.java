//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  - 

import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

class InsertionSort
{
	private ArrayList<String> list;

	public InsertionSort()
	{
		list = new ArrayList<String>();


	}

	//modfiers
	public void add( String  word)
	{
		int loc = Collections.binarySearch(list, word);
		if(loc<0){
			list.add(Math.abs(loc+1), word);
		}
	/*	for(String s:list){
			if(s.length()>=word.length()){
				for(int i =0;i<word.length();i++){
					if(s.charAt(i)<word.charAt(i)){
						list.remove(list.indexOf(word));
						loc = list.indexOf(s);
						list.add(loc, word);
					}
				}
			}
			else{
				
			}
		}
*/




	}


	public void remove(String word)
	{
		list.remove(word);
		

	}

	public String toString()
	{
		return ""+list;
	}
}