package act6;

import static java.lang.System.out;

public class ClassTester6 {
	 public static void main( String args[] )
	   {
			Class6 test = new Class6("Comp Sci 1",3);
			test.addStudent(0,new Student6("Jimmy","4 - 100 90 80 60"));
			test.addStudent(1,new Student6("Sandy","4 - 100 100 80 70"));
			test.addStudent(2,new Student6("Fred","4 - 50 50 70 68"));				
			out.println(test);
			
			out.println(String.format(test.getStudentName(0) + "\'s average = %.2f",test.getStudentAverage(0)));	
			out.println(String.format(test.getStudentName(1) + "\'s average = %.2f",test.getStudentAverage(1)));	
			out.println(String.format(test.getStudentName(2) + "\'s average %.2f",test.getStudentAverage(2)));	
			
			out.println(String.format("Sandy" + "\'s average %.2f",test.getStudentAverage("Sandy")));	

			out.println("Failure List = " + test.getFailureList(70));	
			out.println("Highest Average = " + test.getStudentWithHighestAverage());
			out.println("Lowest Average = " + test.getStudentWithLowestAverage());
									
			out.println(String.format("Class Average = %.2f",test.getClassAverage()));									
		}		
}
