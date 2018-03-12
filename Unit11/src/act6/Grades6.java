package act6;

//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;
import static java.util.Arrays.*;
import java.util.ArrayList;

public class Grades6
{
	private ArrayList<Double> grades;
	
	public Grades6()
	{
		grades = new ArrayList<Double>();
	}
	
	public Grades6(String gradeList)
	{
		this();
		setGrades(gradeList);	
	}
	
	public void setGrades(String gradeList)
	{
		Scanner s = new Scanner(gradeList);
		int i =0;
		if(s.hasNext()){
			i=s.nextInt();
		}
		if(s.hasNext())
			s.next();
		//while(s.hasNext()){
		for(int j = 0; j<i; j++){
			grades.add(s.nextDouble());
			//i++;
		}
	}
	
	public void setGrade(int spot, double grade)
	{
		grades.set(spot, grade);
	}
	
	public double getSum()
	{
		double sum=0.0;
		for(double d: grades){
			sum += d;
		}
		return sum;
	}
	
	public double getLowGrade()
	{
		double low = Double.MAX_VALUE;
		for(double d: grades){
			if(d<low)
				low = d;
		}
		return low;
	}
	
	public double getHighGrade()
	{
		double high = Double.MIN_VALUE;
		for(double d: grades){
			if(d>high)
				high = d;
		}

		return high;
	}
	
	public int getNumGrades()
	{
		return grades.size();
	}
	
	public String toString()
	{
		String output= "";
		for(double d: grades){
			output = output + d + " ";
		}

		return output;
	}	
}