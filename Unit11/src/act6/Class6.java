package act6;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Class6 {
	private String name;
	private ArrayList<Student6> studentList;
	public Class6()
	{
		name="";
		studentList=new ArrayList<Student6>();
	}
	
	public Class6(String nam, int stuCount)
	{
		this();
		name = nam;
	}
	
	public Class6(Scanner s){
		this(s.nextLine(), Integer.parseInt(s.nextLine()));
		while(s.hasNextLine()){
			studentList.add(new Student6(s.nextLine(), s.nextLine()));
		}
	}
	
	public void addStudent(int stuNum, Student6 s)
	{
		studentList.add(s);
	}
	
	public String getClassName()
	{
	   return name;	
	}
	
	public double getClassAverage()
	{
		double classAverage= 0;
		for(Student6 s: studentList){
			classAverage+= s.getAverage();
		}
		classAverage = classAverage/(double)studentList.size();
		return classAverage;
	}
	
	public double getStudentAverage(int stuNum)
	{
		return studentList.get(stuNum).getAverage();
	}

	public double getStudentAverage(String stuName)
	{
		for(Student6 s: studentList){
			if(stuName.equals(s.getName()))
				return s.getAverage();
		}
		return 0.0;
	}
	
	public String getStudentName(int stuNum)
	{
		return studentList.get(stuNum).getName();
	}

	public String getStudentWithHighestAverage()
	{
		sort();
		return getStudentName(studentList.size()-1);

	}

	public String getStudentWithLowestAverage()
	{
		sort();
		return getStudentName(0);
	}
	
	public String getFailureList(double failingGrade)
	{
		String output="";
		for(int i = 0; i<studentList.size(); i++){
			if(getStudentAverage(i) < failingGrade){
				output += getStudentName(i) + " ";
			}				
		}
		return output;
	}
	public void sort(){
		/*ArrayList<Student6> g = new ArrayList<Student6>();
		int index = 0;
		ArrayList<Integer> indexlist = new ArrayList<Integer>();
		double min = Double.MAX_VALUE;
		int counter = 0;
		while (true){
			min = Double.MAX_VALUE;
			for (int i =0; i < studentList.size(); i++ ){
				if ( getStudentAverage(i) < min){
					if (check(indexlist, i+1) == false){
						min = getStudentAverage(i);
						index = i+1;
					}
					
				}
			}

			indexlist.add(index);
			g.add(studentList.get(index-1));
			counter++;
			if (counter == studentList.size()) 
				break;
			
		}
		studentList=g;*/
		Collections.sort(studentList);
	}
	public boolean check(ArrayList<Integer> d, int c){
		for (int i: d){
			if (i == c){
				return true;
			}
		}
		return false;
	}

	public String toString()
	{
		sort();
		//sorts();
		String output=""+getClassName();
		for(Student6 s: studentList){
			if(s.getAverage()%0.01 >= 0.005)
				output += "\n" + s + "\t" + (Math.ceil(s.getAverage()*100)/100);
			else
				output += "\n" + s + "\t" + (Math.floor(s.getAverage()*100)/100);
		}



		return output;
	}  	
}
