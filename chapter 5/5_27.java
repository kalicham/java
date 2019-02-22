/*
(Display leap years) Write a program that displays all the leap years, ten per line,
from 101 to 2100, separated by exactly one space. Also display the number of
leap years in this period.
*/
public class Main{
	public static void main(String[] args){
		int count = 0;
		for (int year = 101; year <= 2100; year ++){
			if ((year % 4 == 0 && year % 100 != 0) || year % 400 ==0){
				count++;
			
			System.out.println(year + (count % 10 == 0 ? "\n" : " "));
		}
		}
	}
}