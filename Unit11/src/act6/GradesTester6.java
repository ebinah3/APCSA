package act6;

import static java.lang.System.out;

public class GradesTester6 {
	public static void main( String args[] )
	   {
			Grades6 test = new Grades6("5 - 90 85 95.5 77.5 88");
			out.println(test);
			out.println("sum = " + test.getSum());	
			out.println("num grades = " + test.getNumGrades());											
			out.println("low grade = " + test.getLowGrade());		
			out.println("high grade = " + test.getHighGrade());
		}		
}
