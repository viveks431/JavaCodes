package GuessTheNumber;

import java.util.Random;
import java.util.Scanner;

class GuessTheNumber
{
    public boolean isNumber(int target, int guess) 
    {
        if(target>guess)
        {
            System.out.println("Try a greater number");
            return false;
        }
        else if(target<guess)
        {
            System.out.println("Try a smaller number");
            return false;
        }
        else
        {
            System.out.println("Yaay, you got it");
            return true;
        }
    }   
}
public class Main 
{
    public static void main(String args[])
    {
        GuessTheNumber num = new GuessTheNumber();
        Random random = new Random();
        Scanner sc = new Scanner(System.in);

        int target = random.nextInt(100)+1;
        int maxAttempts = 5;
        boolean guessedCorrectly = false;

        for(int i=1; i<=maxAttempts; i++)
        {
            System.out.println("Guess a number between 1 and 100: ");
            int guess = sc.nextInt();
            if (num.isNumber(target, guess)) 
            {
                guessedCorrectly = true;
                break;   
            }    
        }
        if(!guessedCorrectly)
        {
            System.out.println("Oopsie, you are out of attempts");
        }
        sc.close();
    }
}

