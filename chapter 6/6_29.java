/*
(Twin primes) Twin primes are a pair of prime numbers that differ by 2. For example,
3 and 5 are twin primes, 5 and 7 are twin primes, and 11 and 13 are twin primes.
Write a program to find all twin primes less than 1,000. Display the output as follows:
(3, 5)
(5, 7)
...
*/
public class Main {
	public static void main(String[] args) {
		System.out.println(isTwinprime(p));
	}
    public static int isTwinprime(int p){
		for (int p = 2; p < 1000; p+=2) {
		System.out.println("(" + p + ", " + (p + 2) + ")");
		}
	}
}