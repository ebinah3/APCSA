package act6;

import static java.lang.System.out;

public class StudentTester6 {
	 public static void main( String args[] )
	   {
			Student6 stu = new Student6("Billy Bob","5 - 90 85 95.5 77.5 88");
			out.println(stu);
			out.println("sum = " + stu.getSum());		
			out.println("average = " + stu.getAverage());	
			out.println("average after dropping low grade = " + stu.getAverageMinusLow());				
			out.println("low grade = " + stu.getLowGrade());		
			out.println("high grade = " + stu.getHighGrade());									
		}		
}
