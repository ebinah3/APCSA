//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class NumberSort
{
	//instance variables and other methods not shown

	private static int getNumDigits(int number)
	{
		int count = 0;
		for(int i = 0; true; i++){
			if(number/Math.pow(10, i) > 0.1)
				count =i;
			else break;
		}


		
		return count;
	}
	
	public static int[] getSortedDigitArray(int number)
	{
		int[] sorted = new int[getNumDigits(number)];
		
		for(int i =0; i<sorted.length; i++){
			sorted[i]=number%10;
			number/=10;
		}
		int t =0;
		int min;
		for(int i =0; i<sorted.length; i++){
			min =i;
			for(int j =i+1; j<sorted.length; j++){
				if(sorted[j]<sorted[min])
					min =j;
			}
			
			t = sorted[i];
			sorted[i]=sorted[min];
			sorted[min] = t;
			
		}
		
		

		return sorted;
	}
}