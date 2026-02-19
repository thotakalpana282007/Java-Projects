import java.util.*;

public class GuessingNumber{
    public void guessingNumberGame() {
      Scanner sc=new Scanner(System.in);
      int n=(int)(10*Math.random());
      System.out.println("A number is choosen between 1 to 10.");
      int k=3,attempts=0;
      System.out.println("You have "+k+" attempts to guess the correct number.");
      boolean guessedCorrectly=false;
      while(!guessedCorrectly){
      for(int i=0;i<k;i++)
      {
        System.out.println("Enter your guessNumber : ");
        int guess=sc.nextInt();
        attempts++;
        if(guess==n)
        {
          System.out.println("Congratulations! you guessed the correct number in "+attempts+" attempts");
          guessedCorrectly=true;
          break;
        }
        else if(guess<n)
        {
          System.out.println("The number is greater than "+guess);
        }
        else
        {
          System.out.println("The number is less than guess "+guess);
        }
       
      }
      if(!guessedCorrectly)
      {
        System.out.println("You have used all "+k+" attempts.");
        System.out.println("Do you want to continue guessing? (yes/no) : ");
        String response=sc.next();
        if(!response.equalsIgnoreCase("yes"))
        {
          System.out.println("Game over! The correct number was: " + n);
          break;
        }
      }
    }
  }
  public static void main(String[] args)
  {
    GuessingNumber g=new GuessingNumber();
    g.guessingNumberGame();
  }
}
