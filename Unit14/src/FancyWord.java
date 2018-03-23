//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;

public class FancyWord
{
	private char[][] mat;

	public FancyWord()
	{
		this("");
	}

   public FancyWord(String s)
	{
	   	Scanner sc = new Scanner(s);
	   	int row = Integer.parseInt(sc.nextLine());
	   	int max = 0;
	   	String str = "";
	   	for(int i =0; i<row; i++){
	   		str = sc.nextLine();
	   		if(str.length()>max)
	   			max = str.length();
	   	}
	   	mat = new char[row][max];
	   	sc.close();
	   	Scanner sca = new Scanner(s);
	   	sca.nextLine();
	   	for(int i =0; i<row; i++){
	   		str = sca.nextLine();
	   		for(int j =0; j<str.length(); j++){
	   			mat[i][j] = str.charAt(j);
	   		}
	   	}

	}


	public String toString()
	{
		String output="";
		int size = 0;
		for(int i = 0; i<mat.length; i++){
			size = 0;
			for(int j=0; j < mat[i].length;j++){
				if(mat[i][j] != 0)
					size = j+1;
			}
			for(int j = 0; j<size; j++){
				if(j == 0 || j == size-1){
					for(int k = 0; k<size; k++){
						output += mat[i][k];
					}
					
				}
				else{
					for(int k = 0; k<size; k++){
						if(k == j || k == size-j-1){
							output+= mat[i][k];
						}
						else
							output += " ";
					}
				}
				output+="\n";
			}
		}




		return output+"\n\n";
	}
}