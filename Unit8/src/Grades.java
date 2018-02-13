//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.lang.System;
import java.lang.Math;
import java.util.Scanner;

public class Grades
{
	//instance variables
	double[] grades; 

	//constructor
	public Grades(){
		
	}

	public Grades(double[] input){
		grades = input;
	}

	//set method
	public void setGrades(double [] input){
		grades = input;
	}


	private double getSum()
	{
		double sum=0.0;
		for (int i = 0; i < grades.length; i++){
			sum += grades[i];
		}
		return sum;
	}

	public double getAverage()
	{
		double average=0.0;
		average = getSum()/grades.length;

		return average;
	}
	
	public void sort(){
		double[] g = new double[grades.length];
		int index = 0;
		int [] indexlist = new int[grades.length];
		double max = 0;
		int counter = 0;
		while (true){
			max = 0;
			for (int i =0; i < grades.length; i++ ){
				if ( grades[i] > max){
					if (check(indexlist, i+1) == false){
						max = grades[i];
						index = i+1;
					}
					//else if (i == 0)
					
				}
			}
			/*if (check(g, max) == false){
				g[counter] = max;
				counter++;
				if (counter == grades.length) 
					break;
			}*/
			//if (check(indexlist, index) == false){
				indexlist[counter] = index;
				g[counter] = max;
				counter++;
				if (counter == grades.length) 
					break;
			//}
			
		}
		setGrades(g);
	}
	public boolean check(int [] d, int c){
		for (int i = 0; i< d.length; i++){
			if (d[i] == c){
				return true;
			}
		}
		return false;
	}
	
	public boolean check(double[] d, double c){
		for (int i = 0; i< d.length; i++){
			if (d[i] == c){
				return true;
			}
		}
		return false;
	}
	
	public String toString(){
		/*int [] covered = new int[grades.length];
		double max;
		double[] newGrades = new double[grades.length];
		int index= 0;
		int counter = 0;
		for(int j =0; j < grades.length; j++){
			max = 0;
			for(int i = 0; i < grades.length; i++){
				if (grades[i] > max){
					max = grades[i];
					index = i;
				}
				
			}
			counter++;
			newGrades[counter] = max;
			covered[counter] = index;
		}
		
		String output = "";
		for(int i = 0; i < newGrades.length; i++){
			output = output + newGrades[i];
		}
		
		return "";*/ 
		sort();
		String output = "";
		for (int i = 0; i < grades.length; i++){
			output = output + "Grade No. " + (i+1) + ": " + grades[i] + "\n";
		}
		output = output + "Average: " + getAverage();
		return output;
	}

	//toString method



}