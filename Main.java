import java.util.EmptyStackException;
import java.util.Scanner;

public class Main 
{
	private static Scanner input;
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		boolean word1 = true;
			do{
				try{
						input = new Scanner(System.in);
						int num1;
						System.out.println("How many times do you want to throw it?");
						num1 = input.nextInt();
						Dice1 d = new Dice1(num1);
					}
				catch(EmptyStackException e) 
					{
						System.err.println("You have thrown it too many times.");
					}
				}
			while (word1 == true);

	}

}
