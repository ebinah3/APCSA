package act6;

import java.util.ArrayList;

public class Gradebook6 {
	private String name;
	private ArrayList<Class6> classList;
	public Gradebook6(){
		name = "";
		classList = new ArrayList<Class6>();
	}
	public Gradebook6(String n){
		this();
		setName(n);
	}
	public void setName(String n){
		name = n;
	}
	
	public double getAvg(){
		double sum = 0;
		for(Class6 c: classList){
			sum+=c.getClassAverage();
		}
		return sum/classList.size();
	}
}
