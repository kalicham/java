/*********************************************************************************
* (Calculator) Revise Listing 7.9, Calculator.java, to accept an expression as   *
* a string in which the operands and operator are separated by zero or more      *
* spaces. For example, 3+4 and 3 + 4 are acceptable expressions.                 *
*********************************************************************************/
public class Main {
	public static void main(String[] args) {
		
		String a = args[0].replaceAll(" ","");
		a = a.replaceAll("[+]","#+#");
		a = a.replaceAll("[-]","#-#");
		a = a.replaceAll("[*]","#*#");
		a = a.replaceAll("[/]","#/#");
		args = a.split("#");

		if (args.length != 3) {
			System.out.println(
				"Usage: java Calculator operand1 operator operand2");
			System.exit(0);
		}

		int result = 0;

		switch (args[1].charAt(0)) {
			case '+' : result = Integer.parseInt(args[0]) +
									  Integer.parseInt(args[2]);
						  break;
			case '-' : result = Integer.parseInt(args[0]) -
									  Integer.parseInt(args[2]);
						  break;
			case '*' : result = Integer.parseInt(args[0]) *
									  Integer.parseInt(args[2]);
						  break;
			case '/' : result = Integer.parseInt(args[0]) /
									  Integer.parseInt(args[2]);
						  break;
		}

		System.out.println(args[0] + ' ' + args[1] + ' ' + args[2]
			+ " = " + result);
	}
}