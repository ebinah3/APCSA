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
	//String ss, sss;
	//String n, nn;
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
	
	public Class(Scanner s){
		this(s.nextLine(), Integer.parseInt(s.nextLine()));
		/*String n = s.nextLine();
		String l = s.nextLine();
		int le = 0;
		for(int i = 0; i<l.length(); i++){
			if (l.charAt(i) == ' '){
				l = l.substring(0, i);
				le = Integer.parseInt(l);
				break;
			}
			le = Integer.parseInt(l);
		}
		*/
		for(int i =0; i<studentList.length; i++){
			addStudent(i, new Student(s.nextLine(), s.nextLine()));
		}
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
		classAverage = classAverage/(double)studentList.length;


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
		/*double high = Double.MIN_VALUE;
		String hName ="";
		for(int i = 0; i<studentList.length; i++){
			if(getStudentAverage(i) > high){
				high = getStudentAverage(i);
				hName = getStudentName(i);
			}				
		}
		return hName;
	//	sorts();*/
		sort();
		return getStudentName(studentList.length-1);

	}

	public String getStudentWithLowestAverage()
	{
		/*double low = Double.MAX_VALUE;
		String hName ="";		
		for(int i = 0; i<studentList.length; i++){
			if(getStudentAverage(i) < low){
				low = getStudentAverage(i);
				hName = getStudentName(i);
			}				
		}

		return hName;
	//	sorts();*/
		sort();
		return getStudentName(0);
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
	public void sort(){
		Student[] g = new Student[studentList.length];
		int index = 0;
		int [] indexlist = new int[studentList.length];
		double min = Double.MAX_VALUE;
		int counter = 0;
		while (true){
			min = Double.MAX_VALUE;
			for (int i =0; i < studentList.length; i++ ){
				if ( getStudentAverage(i) < min){
					if (check(indexlist, i+1) == false){
						min = getStudentAverage(i);
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
				g[counter] = studentList[index-1];
				counter++;
				if (counter == studentList.length) 
					break;
			//}
			
		}
		studentList=g;
	}
	public boolean check(int [] d, int c){
		for (int i = 0; i< d.length; i++){
			if (d[i] == c){
				return true;
			}
		}
		return false;
	}
/*	public void sorts(){
		int c = 0;
		//Student s = new Student();
		while(true){
			c = 0;
			for(int i = 0; i < studentList.length-1; i++){
				if(studentList[i].compareTo(studentList[i+1]) || studentList[i].equals(studentList[i+1])){
					c++;
				}
			}
			if(c == studentList.length){
				break;
			}

			for(int i = 0; i < studentList.length-1; i++){
				if(!(studentList[i].compareTo(studentList[i+1]) || studentList[i].equals(studentList[i+1]))){
					ss = "" + studentList[i];
					for(int j = 0; j<ss.length(); j++){
						if(ss.charAt(j) == '='){
							ss = ss.substring(j);
						}
					}
					sss = "" + studentList[i+1];
					for(int j = 0; j<sss.length(); j++){
						if(sss.charAt(j) == '='){
							sss =sss.substring(j);
						}
					}
					//System.out.println(getStudentName(i));
					//System.out.println(studentList[i].getNumGrades() + " " + ss);
					ss = studentList[i].getNumGrades() + " " + ss;
					sss = studentList[i].getNumGrades() + " " + sss;
					n = getStudentName(i);
					nn = getStudentName(i+1);
					//Student s = new Student(getStudentName(i), "" + studentList[i].getNumGrades() + " " + ss);
					//studentList[i] = studentList[i+1];
					studentList[i].setGrades(sss);
					studentList[i].setName(nn);
					studentList[i+1].setGrades(ss);
					studentList[i+1].setName(n);
				}
			}
		}
	}*/
	
	public String toString()
	{
		sort();
		//sorts();
		String output=""+getClassName();
		for(int i = 0; i<studentList.length; i++){
			if(getStudentAverage(i)%0.01 >= 0.005)
				output += "\n" + studentList[i] + "\t" + (Math.ceil(getStudentAverage(i)*100)/100);
			else
				output += "\n" + studentList[i] + "\t" + (Math.floor(getStudentAverage(i)*100)/100);
		}



		return output;
	}  	
}