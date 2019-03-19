/*********************************************************************************
* (Displaying the prime numbers) Write a program that displays all the prime     *
* numbers less than 120 in decreasing order. Use the StackOfIntegers class       *
* to store the prime numbers (e.g., 2, 3, 5, ...) and retrieve and display them  *
* in reverse order.                                                              *
*********************************************************************************/
public class Main{
	public static void main(String[] args) {
		StackOfIntegers stack = new StackOfIntegers();

		for (int i = 2; i < 120; i++) {
			if (isPrime(i))
				stack.push(i);
		}

		System.out.println(
			"\nAll the prime numbers less than 120 in decreasing order:");
		while (!stack.empty()) {
			System.out.print(stack.pop() + " ");
		}
		System.out.println();
	}

	public static boolean isPrime(int n) {
		for (int d = 2; d <= n / 2; d++) {
			if (n % d == 0) 
				return false;
		}
		return true;
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