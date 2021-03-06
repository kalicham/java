/*********************************************************************************
* (Displaying the prime factors) Write a program that prompts the user to enter  *
* a positive integer and displays all its smallest factors in decreasing order.  *
* For example, if the integer is 120, the smallest factors are displayed as      *
* 5, 3, 2, 2, 2. Use the StackOfIntegers class to store the factors              *
* (e.g., 2, 2, 2, 3, 5) and retrieve and display them in reverse order.          *
*********************************************************************************/
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a positive integer: ");
		int number = input.nextInt();

		System.out.print("The smallest factors of " + number + " are: ");
		StackOfIntegers stack = new StackOfIntegers(); // Create a StackOfIntegers

		smallestFactors(number, stack);

		while (!stack.empty()) {
			System.out.print(stack.pop() + " ");
		}
		System.out.println();
	}

	public static void smallestFactors(int number, StackOfIntegers stack) {
		int i = 2; // Potential prime factor
		while (number / i != 1){ 
			if (number % i == 0) {
				stack.push(i);
				number /= i;
			}
			else
				i++;
		}
		stack.push(number);
	}
	public class StackOfIntegers {
	private int[] elements;
	private int size;
	public static final int DEFAULT_CAPACITY = 16;

	public StackOfIntegers() {
		this (DEFAULT_CAPACITY);
	}

	public StackOfIntegers(int capacity) {
		elements = new int[capacity];
	}

	public void push(int value) {
		if (size >= elements.length) {
			int[] temp = new int[elements.length * 2];
			System.arraycopy(elements, 0, temp, 0, elements.length);
			elements = temp;
		}

		elements[size++] = value;
	}

	public int pop() {
		return elements[--size];
	}

	public int peek() {
		return elements[size - 1];
	}

	public boolean empty() {
		return size == 0;
	}

	public int getSize() {
		return size;
	}
}
}