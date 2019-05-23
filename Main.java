
import java.util.Scanner;
public class Main
{
    public static void main (String [] args) {
         System.out.println("Pick a number between 1 and 50: ");
         
         Scanner game = new Scanner(System.in);
         int n;
         int guess = game.nextInt();
         n = (int) (Math.random()*50 + 1);
         int tries = 0;
         
         while (guess != n) { tries++;
        if(guess < n){
            System.out.println("Your guess is too small. Guess again!");
            guess = game.nextInt();
             }
        if (guess > n){
            System.out.println("Your guess is too large. Guess again!");
            guess = game.nextInt();
             }
        if (guess == n){
            System.out.println("Your guess is correct!");
            break;
            }
    }
    System.out.println("You guessed " + tries + " times.");
}
}

