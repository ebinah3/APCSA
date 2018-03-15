package act6;

public class Student6 implements Comparable<Student6>{
	private String myName;
	private Grades6 myGrades;
	
	public Student6()
	{
		setName("");
		setGrades("");
	}
	
	public Student6(String name, String gradeList)
	{
		setName(name);
		setGrades(gradeList);
	}
	
	public void setName(String name)
	{
		myName = name;
	}	
	
	public void setGrades(String gradeList)
	{
		myGrades = new Grades6(gradeList);	
	}
	
	public void setGrade(int spot, double grade)
	{
		myGrades.setGrade(spot, grade);
	}

	public String getName()
	{
		return myName;
	}
	
	public int getNumGrades()
	{
		return myGrades.getNumGrades();
	}

	public double getSum()
	{
		return myGrades.getSum();
	}
	
	public double getAverage()
	{
		return getSum()/(double)getNumGrades();
	}

	public double getAverageMinusLow()
	{
		return (getSum() - getLowGrade())/(getNumGrades() -1);
	}
	
	public double getHighGrade()
	{
		return myGrades.getHighGrade();		
	}
	
	public double getLowGrade()
	{
		return myGrades.getLowGrade();	
	}
	
	public boolean equals(Student6 s){
		if(this.getAverage()==s.getAverage())
			return true;
		return false;
	}
	
	public int compareTo(Student6 s){
		if(this.getAverage()<s.getAverage()){
			return -1;
		}
		else if(this.getAverage()==s.getAverage()){
			return 0;
		}
		return 1;
	
	}
	public String toString()
	{
		return getName() + " = " + myGrades;
	}	
}
