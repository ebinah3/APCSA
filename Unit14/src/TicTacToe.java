//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;

public class TicTacToe
{
	private char[][] mat;

	public TicTacToe()
	{
		this("");

	}

	public TicTacToe(String game)
	{
		set(game);

	}
	
	public void set(String game){
		double size = Math.sqrt((double)game.length());
		mat = new char[(int)size][(int)size];
		for(int i = 0; i<size;i++){
			for(int j =0; j< size; j++){
				mat[i][j] = game.charAt(3*i+j);
			}
		}
	}

	public String getWinner()
	{
		String winner ="";
		char check = ' ';
		boolean b = true;
		for(int i =0;i<mat.length; i++){
			check = mat[i][0];
			b=true;
			for(int j =1; j<mat[i].length;j++)
				if(mat[i][j] != check)
					b=false;
			if(b){
				winner = check+" won horizontally";
				break;
			}
				
		}
		if(winner== ""){
			for(int i =0;i<mat[0].length; i++){
				check = mat[0][i];
				b=true;
				for(int j =1; j<mat.length;j++)
					if(mat[j][i] != check)
						b=false;
				if(b){
					winner = check+" won vertically";
					break;
				}
					
			}
		}
		
		if(winner== ""){
			for(int i =0;i<mat.length; i+= mat.length-1){
				if(i == 0){ 
					check = mat[i][0];
					b=true;
					for(int j = 0; j<mat.length;j++){
						if(mat[i+j][j] != check)
							b=false;
					}
				}
				else{
					check = mat[i][0];
					b=true;
					for(int j = 0; j<mat.length;j++){
						if(mat[i-j][j] != check)
							b=false;
					}
				}
					
						
				if(b){
					winner = check+" won diagonally";
					break;
				}
					
			}
		}

		if(winner!= "")
			return winner;
		else
			return "cat's game - no winner!";

	}

	public String toString()
	{
		String output="";
		for(int i=0; i< mat.length;i++){
			for(int j =0; j<mat[i].length; j++){
				output+= mat[i][j];
			}
			output+= "\n";
		}
		return output += getWinner();

	}
}