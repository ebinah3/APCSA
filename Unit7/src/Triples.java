//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import static java.lang.System.*;

public class Triples
{
   private int number;
   
	public Triples()
	{
		this(0);
	}

	public Triples(int num)
	{
		setNum(num);
	}

	public void setNum(int num)
	{
		number = num;
	}
	
	private void findSets(){
		
		
	}
	
	private int greatestCommonFactor(int a, int b, int c)
	{
		int max = 0;
		for (int i = 1; i < c; i++){
			if (a % i == 0){
				if (b%i ==0){
					if (c%i ==0){
						max = i;
					}
				}
			}
		}
		return max;
	}

	public String toString()
	{
		int counter = 0;
		int [] as = new int[number];
		int [] bs = new int[number];
		int [] cs = new int [number];

		for (int i = 1; i < number; i++){
			for (int j =1; j< number; j++){
				for (int k = 1; k<number; k++){
					if ((i*i + j*j == k*k) && ((i%2 == 0 && j%2 ==1)||(i%2 ==1 && j%2 == 0)) && (greatestCommonFactor(i, j, k) <= 1)){
						int counter2 = 0;
						for (int l =0; l < counter; l++){
							if(as[l] != j || bs[l] !=i){
								counter2++;
							}
						}
						if(counter2 == counter){
							as[counter] = i;
							bs[counter] = j;
							cs[counter] =k;
							counter++;
						}
					}
				}
			}
		}
		String output="";
		for (int i = 0; i < counter; i++){
			output = output + as[i] + " " + bs[i] + " " + cs[i]+ "\n";
		}
		

		return output+"\n";
	}
}