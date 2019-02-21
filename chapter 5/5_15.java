/*
(Display the ASCII character table) Write a program that prints the characters in
the ASCII character table from ! to ~. Display ten characters per line. The ASCII
table is shown in Appendix B. Characters are separated by exactly one space.
*/
public class Main {
	public static void main(String[] args) {
		int count = 0;	

		for (int i = 33; i <= 126; i++) {
			count++;	
			if (count % 10 == 0)
				System.out.println((char)i);
			else
				System.out.print((char)i + " ");	
		}
		System.out.println();
	}
}