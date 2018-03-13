//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class Monster implements Comparable
{
	private int myWeight;
	private int myHeight;
	private int myAge;

	//write a default Constructor
	public Monster(){
		setWeight(0);
		setHeight(0);
		setAge(0); 
	}


	//write an initialization constructor with an int parameter ht
	public Monster(int ht){
		setWeight(0);
		setHeight(ht);
		setAge(0); 
	}

	//write an initialization constructor with int parameters ht and wt
	public Monster(int ht, int wt){
		setWeight(wt);
		setHeight(ht);
		setAge(0); 
	}

	//write an initialization constructor with int parameters ht, wt, and age
	public Monster(int ht, int wt, int age){
		setWeight(wt);
		setHeight(ht);
		setAge(age);
	}
	//modifiers - write set methods for height, weight, and age
	public void setHeight(int ht){
		myHeight = ht;
	}
	public void setWeight(int wt){
		myWeight = wt;
	}
	public void setAge(int age){
		myAge = age;
	}
	
	//accessors - write get methods for height, weight, and age
	public int getHt(){
		return myHeight;
	}
	public int getWt(){
		return myWeight;
	}
	public int getAge(){
		return myAge;
	}
	
	//creates a new copy of this Object
	public Monster clone()
	{
	   return new Monster(getHt(), getWt(), getAge());
	}

	public boolean equals( Object obj )
	{
		Monster m = (Monster) obj;
		if(getHt() == m.getHt() && getWt() == m.getWt() && getAge() == m.getAge())
			return true;

		return false;
	}

	public int compareTo( Object obj )
	{
		Monster rhs = (Monster)obj;
		if(equals(rhs))
			return 0;
		if(getHt()>rhs.getHt())
			return 1;
		else if(getHt() == rhs.getHt()){
			if(getWt()>rhs.getWt())
				return 1;
			else if(getWt() == rhs.getWt()){
				if (getAge() > rhs.getAge())
					return 1;
			}
		}

		return -1;
	}

	//write a toString() method
	public String toString(){
		String output;
		output = getHt() + " " + getWt() + " " + getAge();
		return output;
	}
	
}