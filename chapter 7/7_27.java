/*********************************************************************************
* (Identical arrays) The arrays list1 and list2 are identical if they have the   * 
* same contents. Write a method that returns true if list1 and list2 are         * 
* identical, using the following header:                                         *
*                                                                                * 
* public static boolean equals(int[] list1, int[] list2)                         * 
*                                                                                * 
* Write a test program that prompts the user to enter two lists of integers and  *
* displays whether the two are identical. Here are the sample runs. Note that    *
* the first number in the input indicates the number of the elements in the list.*
* This number is not part of the list.                                           *
*********************************************************************************/
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter list1: ");
		int[] list1 = new int[input.nextInt()];
		for (int i = 0; i < list1.length; i++)
			list1[i] = input.nextInt(); 	

		System.out.print("Enter list2: ");
		int[] list2 = new int[input.nextInt()];
		for (int i = 0; i < list2.length; i++)
			list2[i] = input.nextInt();

		System.out.println("Two lists are" + (equals(list1, list2) ? " " : " not ") 
			+ "identical");
	}

	public static boolean equals(int[] list1, int[] list2) {
		if (list1.length != list2.length)
			return false;

		sort(list1);
		sort(list2);
		for (int i = 0; i < list1.length; i++) {
			if (list1[i] != list2[i])
				return false;
		}
		return true;
	}