import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        System.out.println("Welcome to the Number Guessing Game!");
        
        int rounds;
        System.out.print("Enter the number of rounds you want to play: ");
        rounds = scanner.nextInt();
        
        int userScore = 0;
        int computerScore = 0;
        
        for (int i = 1; i <= rounds; i++) {
            int numberToGuess = random.nextInt(100) + 1;
            int userGuess;
            boolean correctGuess = false;
            
            System.out.println("Round " + i);
            System.out.println("I have selected a number between 1 and 100. Try to guess it!");
            
            for (int j = 0; j < 5; j++) {
                System.out.print("Enter your guess: ");
                userGuess = scanner.nextInt();
                
                if (userGuess == numberToGuess) {
                    System.out.println("Congratulations! You guessed the correct number.");
                    userScore++;
                    correctGuess = true;
                    break;
                } else if (userGuess < numberToGuess) {
                    System.out.println("Too low! Try again.");
                } else {
                    System.out.println("Too high! Try again.");
                }
            }
            
            if (!correctGuess) {
                System.out.println("Sorry, you didn't guess the number. The correct number was " + numberToGuess);
                computerScore++;
            }
        }
        
        System.out.println("\nGame Over!");
        System.out.println("Your score: " + userScore);
        System.out.println("Computer's score: " + computerScore);
        
        if (userScore > computerScore) {
            System.out.println("You win!");
        } else if (userScore < computerScore) {
            System.out.println("Computer wins!");
        } else {
            System.out.println("It's a tie!");
        }
        
        scanner.close();
    }
}
