/*(Game: scissor, rock, paper) Write a program that plays the popular scissor-rockpaper game. (A scissor can cut a paper, a rock can knock a scissor, and a paper can
wrap a rock.) The program randomly generates a number 0, 1, or 2 representing
scissor, rock, and paper. The program prompts the user to enter a number 0, 1, or
2 and displays a message indicating whether the user or the computer wins, loses,
or draws. Here are sample runs:
*/import java.util.Scanner;
public class Main{
public static void  main(String[] args){
int computer = (int)(Math.random()* 3);

Scanner input = new Scanner(System.in);
System.out.print("Scissor (0), rock (1), paper(2): " );
int human = input.nextInt();

System.out.print("The computer is ");
		switch (computer)
		{
			case 0: System.out.print("scissor."); break;
			case 1: System.out.print("rock."); break;
			case 2: System.out.print("paper.");
		}

		System.out.print(" You are ");
		switch (human)
		{
			case 0: System.out.print("scissor"); break;
			case 1: System.out.print("rock"); break;
			case 2: System.out.print("paper ");
		}
if (computer == human)
	System.out.println(" too.It is a draw");
else 
{
	boolean win = (human ==0 && computer == 2
		|| human == 1 && computer == 0
		|| human == 2 && computer ==1 );
	if (win)
		System.out.println(" . You won.");
	else 
		System.out.println(" . You loser");
}
}
	
}