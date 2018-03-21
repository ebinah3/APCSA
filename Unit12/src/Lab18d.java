//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.Scanner;
import java.util.Arrays;
import static java.lang.System.*;

public class Lab18d
{
	
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner(new File("C:\\Users\\ebinah6199\\Desktop\\APCSA\\Unit12\\src\\lab18d.dat"));

		int size = file.nextInt();
		Word[] w = new Word[size];
		for(int i = 0; i<size; i++){
			w[i] = new Word(file.next());
		}
		//for(int i =0; i<w.length; i++){
	//		System.out.println(w[i]);
	//	}
		System.out.println("");
		w = sort(w);
		for(int i =0; i<w.length; i++){
			System.out.println(w[i]);
		}
		
	}

	
	public static Word[] sort(Word[] w){
		Word[] g = new Word[w.length];
		int index = 0;
		int [] indexlist = new int[w.length];
		Word min = null;
		int counter = 0;
		while (true){
			min = null;
			for (int i =0; i < w.length; i++ ){
				if (min == null){
					if (check(indexlist, i+1) == false){
						min = w[i];
						index = i+1;
					}
				}
				else if (min.compareTo(w[i])>0){
					if (check(indexlist, i+1) == false){
						min = w[i];
						index = i+1;
					}
					
				}
			}
	
				indexlist[counter] = index;
				g[counter] = w[index-1];
				counter++;
				if (counter == w.length) 
					break;
			
		}
		return g;
	}
	public static boolean check(int [] d, int c){
		for (int i = 0; i< d.length; i++){
			if (d[i] == c){
				return true;
			}
		}
		return false;
	}

}