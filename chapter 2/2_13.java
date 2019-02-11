import java.util.Scanner;
public class Main{
	public static void main(String[] agrs){
	Scanner input = new Scanner(System.in);
	System.out.print("Enter the mothly saving amount: ");
	double amount = input.nextDouble();
	double value = 100 * (1 + 0.00417);
    value = (100 + value) * (1 + 0.00417);
    value = (100 + value) * (1 + 0.00417);
    value = (100 + value) * (1 + 0.00417);
    value = (100 + value) * (1 + 0.00417);
    value = (100 + value) * (1 + 0.00417);
	System.out.println("Enter the monthly saving amount: " 
		+ amount + "\n After the six month, the account value is $" 
		+ value  );

	}
}