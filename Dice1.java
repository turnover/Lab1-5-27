import java.util.Random;
import java.util.EmptyStackException;

public class Dice1 
{
	static int num1 = 0;
	static int num2 = 0;
	static Random random = new Random();
	
	public Dice1 (int bounces)
	{
			int i = 0;
			if (bounces > 3) 
				{
		        	throw new EmptyStackException();
				}
			while( i < bounces )
				{
				num1 = 0;
				num1 += 1 + random.nextInt(6);
				num2 += num1;
				System.out.println(num2);
				i++;
				}
			num2 /= bounces;
	}
}
