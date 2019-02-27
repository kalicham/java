/*
(Display matrix of 0s and 1s) Write a method that displays an n-by-n matrix using
the following header:
public static void printMatrix(int n)
Each element is 0 or 1, which is generated randomly. Write a test program that
prompts the user to enter n and displays an n-by-n matrix.
*/
import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter n: ");
		int n = input.nextInt();

		matrix(n);
	public static void matrix(int n){
		for(int rows = 0; rows < n; rows ++){
			for (int rows1 = 0; rows1 < n; rows1 ++){
				System.out.print((int)(Math.random()*2));
			}
		}
	}
	}
}