//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Arrays;
import java.util.Scanner;
import java.util.Collections;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;
import java.util.ArrayList;
import java.util.Collections;

public class Lab15d
{
	public static void main( String args[] ) throws IOException
	{
		FancyWords f = new FancyWords("");
		Scanner file = new Scanner(new File("C:\\Users\\ebinah6199\\Desktop\\APCSA\\Unit13\\src\\lab15d.dat"));
		int i = Integer.parseInt(file.nextLine());
		for(int j = 0; j<i;j++){
			f.setWords(file.nextLine());
			System.out.println(f);
		}

		/*Scanner file = new Scanner(new File("C:\\Users\\ebinah6199\\Desktop\\APCSA\\Unit13\\src\\lab15d.dat"));
		file.nextLine();
		String s = file.nextLine();
		System.out.println(s);
		Scanner sc = new Scanner(s);
		ArrayList<String> arr = new ArrayList<String>();
		while(sc.hasNext()){
			arr.add(sc.next());
		}
		System.out.println(arr);
		Collections.reverse(arr);
		System.out.println(arr);
		int max = 0;
		for(String str: arr){
			if (max<str.length())
				max = str.length();
		}
		/*for(String str: arr){
			if(str.length()<max)
				for(int i = 0; i <max-str.length();i++){
					str= " " + str;
				}
		}
		int j = 1;
		while(j<max+1){
		for(String str: arr){
			if(str.length()-j >=0)
			System.out.print(str.charAt(str.length()-j));
			else
				System.out.print(" ");
		}
		j++;
		System.out.print("\n");
		}*/
		/*Scanner file = new Scanner(new File("C:\\Users\\ebinah6199\\Desktop\\APCSA\\Unit13\\src\\lab15d.dat"));
		file.nextLine();
		String s = file.nextLine();
		System.out.println(s);
		Scanner sc = new Scanner(s);
		int i =0;
		while(sc.hasNext()){
			i++;
			//System.out.println(i);
		}
		
*/	
		
	
	}
}

