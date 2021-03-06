//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class RomanNumeral
{
	private Integer number;
	private String roman;

	private final static int[] NUMBERS= {1000,900,500,400,100,90,
													50,40,10,9,5,4,1};

	private final static String[] LETTERS = {"M","CM","D","CD","C","XC",
												  "L","XL","X","IX","V","IV","I"};

	public RomanNumeral(String str)
	{
		roman = str;
		
	}

	public RomanNumeral(Integer orig)
	{
		number = orig;


	}

	public void setNumber(Integer num)
	{

		number = num;

	}

	public void setRoman(String rom)
	{

		roman = rom;

	}

	public Integer getNumber()
	{
		number =0;
		for (int i = 0; i < roman.length(); i++){
			if(roman.substring(i, i+1).equals(LETTERS[0]) || roman.substring(i).equals(LETTERS[0])){//M
				number += 1000;
			}
			else if(roman.substring(i, i+1).equals(LETTERS[4])|| roman.substring(i).equals(LETTERS[4])){//C
				if (roman.length()>i+1){
					if (roman.substring(i, i+2).equals(LETTERS[1])|| roman.substring(i).equals(LETTERS[1])){
						number += 900;
						i++;
					}
					else if (roman.substring(i, i+2).equals(LETTERS[3])|| roman.substring(i).equals(LETTERS[3])){
						number += 400;
						i++;
					}
					else {
						number += 100;
					}
				}
				else {
					number += 100;
				}
			}
			else if(roman.substring(i, i+1).equals(LETTERS[2])|| roman.substring(i).equals(LETTERS[2])){//D
				number+=500;
			}
			else if(roman.substring(i, i+1).equals(LETTERS[6])|| roman.substring(i).equals(LETTERS[6])){//L
				number += 50;
			}
			else if(roman.substring(i, i+1).equals(LETTERS[8])|| roman.substring(i).equals(LETTERS[8])){//X
				if (roman.length()>i+1){
					if (roman.substring(i, i+2).equals(LETTERS[7])|| roman.substring(i).equals(LETTERS[7])){
						number += 40;
						i++;
					}
					else if(roman.substring(i, i+2).equals(LETTERS[5])|| roman.substring(i).equals(LETTERS[5])) {
						number += 90;
						i++;
					}
					else {
						number += 10;
					}
				}
				else
					number+=10;
			}
			else if(roman.substring(i,i+1).equals(LETTERS[10])|| roman.substring(i).equals(LETTERS[10])){//V
				number += 5;
			}
			else if(roman.substring(i, i+1).equals(LETTERS[12])|| roman.substring(i).equals(LETTERS[12])){//I
				if (roman.length()>i+1){
					if (roman.substring(i, i+2).equals(LETTERS[9])|| roman.substring(i).equals(LETTERS[9])){
						number+=9;
						i++;
					}
					else if(roman.substring(i, i+2).equals(LETTERS[11])|| roman.substring(i).equals(LETTERS[11])){
						number+=4;
						i++;
					}
					else{
						number+= 1;
					}
				}
				else{
					number+= 1;
				}
			}
		}
		return number;
	}

	public String toString()
	{
		roman = "";
		for(int i = 0; i < NUMBERS.length;){
			if (number >= NUMBERS[i]){
				roman = roman + LETTERS[i];
				number = number - NUMBERS[i];
			}
			else{
				i++;
			}
		}
		return roman + "\n";
	}
}