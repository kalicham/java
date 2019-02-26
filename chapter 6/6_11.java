/*
Write a method that computes the commission, using the scheme in Programmin Exercise 5.39.
The header of thw method is as follows:
Public static double computeCommission(double salesAmount)

Sales Amount                  Commission
________________________________________
10000                          900.0
15000                         1500.0
.....
95000                        11100.0
100000                       11700.0

Ex 5_39(Financial application: find the sales amount) You have just started a sales job
in a department store. Your pay consists of a base salary and a commission. The
base salary is $5,000. The scheme shown below is used to determine the commission
rate.
			Sales Amount                   Commission Rate
			------------------------------------------------
			$0.01–$5,000                     8 percent
			$5,000.01–$10,000               10 percent
			$10,000.01 and above            12 percent
Note that this is a graduated rate. The rate for the first $5,000 is at 8%, the next
$5000 is at 10%, and the rest is at 12%. If the sales amount is 25,000, the commission
is 5,000 * 8% + 5,000 * 10% + 15,000 * 12% = 2,700.
Your goal is to earn $30,000 a year. Write a program that finds the minimum sales
you have to generate in order to make $30,000.
*/
public class Main {
	public static void main(String[] args) {
		System.out.println("\n salesAmount      Commission");
		System.out.println("______________________________");
		for (double salesAmount = 10000; salesAmount <= 100000;
			salesAmount += 5000);{
			System.out.printf("%-16.0f", salesAmount);
		    System.out.printf("%8.1f\n", computeCommission(salesAmount));
}
}
public static double computeCommission(double salesAmount){
	double  commission, balance;
	balance = commission = 0.0;
	if (salesAmount > 10000.01)
				commission += (balance = salesAmount - 10000) * 0.12;

			if (salesAmount > 5000.01)
				commission += (balance -= balance - 5000) * 0.10;

			if (salesAmount > 0.01)
				commission += balance * 0.08;

			return commission;

				 
}
}
		