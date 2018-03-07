//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;
import static java.util.Arrays.*;

public class Class
{
	private String name;
	private Student[] studentList;
	
	public Class()
	{
		name="";
		studentList=new Student[0];
	}
	
	public Class(String nam, int stuCount)
	{
		name = nam;
		studentList = new Student[stuCount];
	}
	
	public void addStudent(int stuNum, Student s)
	{
		studentList[stuNum] = s;
	}
	
	public String getClassName()
	{
	   return name;	
	}
	
	public double getClassAverage()
	{
		double classAverage= 0;
		for(int i = 0; i<studentList.length; i++){
			classAverage+= getStudentAverage(i);
		}
		classAverage = classAverage/studentList.length;


		return classAverage;
	}
	
	public double getStudentAverage(int stuNum)
	{
		return studentList[stuNum].getAverage();
	}

	public double getStudentAverage(String stuName)
	{
		for(int i = 0; i<studentList.length; i++){
			if(stuName.equals(getStudentName(i)))
				return getStudentAverage(i);
		}


		return 0.0;
	}
	
	public String getStudentName(int stuNum)
	{
		return studentList[stuNum].getName();
	}

	public String getStudentWithHighestAverage()
	{
		double high = Double.MIN_VALUE;
		String hName ="";
		for(int i = 0; i<studentList.length; i++){
			if(getStudentAverage(i) > high){
				high = getStudentAverage(i);
				hName = getStudentName(i);
			}				
		}

		return hName;
	}

	public String getStudentWithLowestAverage()
	{
		double low = Double.MAX_VALUE;
		String hName ="";		
		for(int i = 0; i<studentList.length; i++){
			if(getStudentAverage(i) < low){
				low = getStudentAverage(i);
				hName = getStudentName(i);
			}				
		}

		return hName;
	}
	
	public String getFailureList(double failingGrade)
	{
		String output="";
		for(int i = 0; i<studentList.length; i++){
			if(getStudentAverage(i) < failingGrade){
				output += getStudentName(i) + " ";
			}				
		}

		return output;
	}
	
	public String toString()
	{
		String output=""+getClassName();
		for(int i = 0; i<studentList.length; i++){
			output += "\n" + studentList[i] + "\t" + getStudentAverage(i) ;
		}



		return output;
	}  	
}