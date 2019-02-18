import java.util.Scanner;

public class Main{
	public static void main (String[] args){
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a letter: ");
		String s = input.nextLine();
		char ch = s.charAt(0);

		if (Character.isLetter(ch))
		{
			swich(Character.toUpperCase(ch))
			{
				case 'A' || 'a':
				case 'E' || 'e':
				case 'I' || 'i':
				case '0' || 'o':
				case 'U' || 'u':
				System.out.println(ch + " is a vowel"); break;
				default : System.out.println(ch + " is a consonant"); 
			}
		}
		else
			System.out.println(ch + " is an invalid input");
	}
}
		