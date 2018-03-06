package nnew;
import java.util.Scanner;

public class March2 {
	
	public static boolean isGoofy(int num){
		int sum=0;
		int numorg = num;
		int max = 0;
		for(int i = 1; Math.pow(10, i) <= numorg; i++){
			max = i;
		}
		for(int i = max; i > 0; i--){
			int div = num/(int)Math.pow(10, i);
			//int div = num - (int)Math.pow(10, i);
			if(div != 0 && numorg%div == 0){
				sum+= div;
			}
			num -= div*(int)Math.pow(10, i);
		}
		if(num!= 0 && numorg%num == 0){
			sum+= num;
		}
		
		if (sum%2 == 1){
			return true;
		}
		return false;
	}
	
	public static int[] getSomeGoofyNumbers(int count)
	{
		int[] result = new int[count];
		int counter = 0;
		for(int i = 1; ;i++){
			if(isGoofy(i)){
				result[counter] = i;
				counter++;
				if(counter == count){
					break;
				}
			}
		}
		return result;
	}
	public static void main(String[] args){
		String output = "";
		System.out.println(isGoofy(12));
		System.out.println(isGoofy(15));
		System.out.println(isGoofy(26));
		System.out.println(isGoofy(8));
		System.out.println(isGoofy(1234));
		System.out.println(isGoofy(0));
		Scanner s = new Scanner(System.in);
		int p = s.nextInt();
		for(int i = 0; i<getSomeGoofyNumbers(p).length; i++ ){
			output = output + getSomeGoofyNumbers(p)[i] + " ";
		}
		System.out.println(output);
	}
}
