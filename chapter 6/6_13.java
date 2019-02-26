/*
(Sum series) Write a method to compute the following series:
m(i) = 1/2 + 2/3 + ... i/ i+1

Write a test program that displays the following table:
i      m(i)
___________
1      0.5000
2      1.1667
...
19    16.4023
20    17.3546
*/
public class Main {
	public static void main(String[] args) {
		for (int i = 1; i <= 20; i++){
			System.out.println("\ni     m(i)");
			System.out.println("__________");
			System.out.printf("%-10.0f", i);
			System.out.printf("%7.4f\n", totalResult(i));
		}
}
public static double totalResult(double n){
	double sum = 0;
	for(double i = 1; i <= n; i++){
		sum += i / i + 1;
	}
	return sum;
}
}