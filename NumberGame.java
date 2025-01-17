import java.util.Scanner;
import java.util.Random;
public class NumberGame
{
 public static void main(String[]args)
 {
  Scanner scanner=new Scanner(System.in);
  Random random=new Random();
  System.out.println("welcome to Number Game");
  boolean playAgain=true;
  while(playAgain)
  {
   int randomNumber = random.nextInt(100)+1;
   int attempts =0;
   boolean guessedCorrectly = false;
   int maxAttempts=10;
   System.out.println("\nI have generated a number between 1 and 100.Can you guess it?");
   System.out.println("You have a maximum of"+ maxAttempts+"attempts");

   while(attempts<maxAttempts &&! guessedCorrectly)
   {
    System.out.println("Enter your Guess:");
    int userGuess = scanner.nextInt();
    attempts++;
   
    if(userGuess==randomNumber)
    {
     System.out.println("Congratulations You guess the correct number in"+ attempts+"attempts");
     guessedCorrectly=true;
    }
    else if(userGuess< randomNumber)
    {
     System.out.println("Too low! try again");
    }
    else
    {
     System.out.println("Too high! try again");
    }
   }
   if (!guessedCorrectly)
   {
    System.out.println("Sorry! you have used all your attempts. The correct number was:"+randomNumber);
   }
    System.out.println("\nDo you want to play another round?(yes/no):");
    playAgain=scanner.next().equalsIgnoreCase("yes");
    }
     System.out.println("Thank you");
    
     scanner.close();
  }
}
   


