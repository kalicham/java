/*
(Emirp) An emirp (prime spelled backward) is a nonpalindromic prime number
whose reversal is also a prime. For example, 17 is a prime and 71 is a prime, so 17
and 71 are emirps. Write a program that displays the first 100 emirps. Display 10
numbers per line, separated by exactly one space, as follows:
13 17 31 37 71 73 79 97 107 113
149 157 167 179 199 311 337 347 359 389
...
*/
public class Main {
	public static void main(String[] args) {
		final int EMIRPS_PER_LINE = 10; 
		int count = 0; 
		int n = 2; 

		while (count < NUMBER_OF_EMIRPS) {
			if (isEmirp(n)) {
				count++; 
				System.out.print(count % EMIRPS_PER_LINE == 0 ? n + "\n" : n + " ");
			}
			n++; 
		}
	}
	public static boolean isEmirp(int n){
		for (int n = 13; n <= 1000;){
			if (n % 1 && i % n == 0){
				isEmirp(n) = True;
			}
			else{
				isEmirp(n) = False;
			}
	    }
    }
}
