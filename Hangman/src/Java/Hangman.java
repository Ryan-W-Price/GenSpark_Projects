import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Hangman {


    public static void main(String[] args) {

        String[] words = {"pizza", "milkshake", "tacos", "spaghetti", "chicken", "steak", "burger", "bacon", "wings", "ribs", "salmon", "toast",
                "muffin", "sandwich", "pasta", "cake", "soda", "cheese"};

        String word = words[(int) (Math.random() * words.length)];
        System.out.println(word);
        Scanner keyboard = new Scanner(System.in);

        List<Character> playerGuesses = new ArrayList();
        
        getInput(playerGuesses);


int wrongCount = 0;

        while (true) {
            hangedMan(wrongCount);
            if (wrongCount >= 7)
            {
                System.out.println("You lose!");
                        break;
            }


            printWordState(word, playerGuesses);
            if (!getPlayerGuess(keyboard, word, playerGuesses));
            {
                wrongCount++;
            }


            if(printWordState(word,playerGuesses))
            {
                System.out.println("You win!");
                break;
            }
            System.out.println("Please enter your guess for the word:");
            if(keyboard.nextLine().equals(word))
            {
                System.out.println("You win!");
                break;
            }
            else
            {
                System.out.println("Try again!");
            }
        }

    }
public static void getInput(List<Character> playerGuesses)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter a letter:");
        String letterGuess = keyboard.nextLine();
        playerGuesses.add(letterGuess.charAt(0));
    }
    private static boolean printWordState(String word, List<Character> playerGuesses)
        {
            int correctCount = 0;
        for (int i = 0; i < word.length(); i++)
        {
            if (playerGuesses.contains(word.charAt(i)))
            {
                System.out.print(word.charAt(i));
                correctCount++;
            }
            else
            {
                System.out.print("-");
            }
        }
        System.out.println();
    return(word.length() == correctCount);
    }
    private static boolean getPlayerGuess(Scanner keyboard, String word, List<Character> playerGuesses)
    {
        System.out.println("Please enter a letter:");
        String letterGuess = keyboard.nextLine();
        playerGuesses.add(letterGuess.charAt(0));
        printWordState(word, playerGuesses);

        return word.contains(letterGuess);
    }
    private static void hangedMan(Integer wrongCount)
    {
        System.out.println("H A N G M A N");
        System.out.println("   +----+");
        System.out.println("       |");
        System.out.println("       |");
        System.out.println("       |");
        System.out.println("       |");
        System.out.println("      ===");

        if (wrongCount >=1) {
            System.out.println("   +----+");
            System.out.println("   |   |");
            System.out.println("       |");
            System.out.println("       |");
            System.out.println("       |");
            System.out.println("      ===");
            System.out.println("Guess again!");
        }

        if (wrongCount >= 2) {
            System.out.println("   +----+");
            System.out.println("   |   |");
            System.out.println("   O   |");
            System.out.println("       |");
            System.out.println("       |");
            System.out.println("      ===");
            System.out.println("Guess again!");
        }
        if (wrongCount >= 3) {
            System.out.println("   +----+");
            System.out.println("   |   |");
            System.out.println("   O   |");
            System.out.println("   |   |");
            System.out.println("       |");
            System.out.println("      ===");
            System.out.println("Guess again!");
        }

        if (wrongCount >= 4) {
            System.out.println("   +----+");
            System.out.println("   |   |");
            System.out.println("   O   |");
            System.out.println("  /|   |");
            System.out.println("       |");
            System.out.println("      ===");
            System.out.println("Guess again!");
        }

        if (wrongCount >= 5) {
            System.out.println("   +----+");
            System.out.println("   |   |");
            System.out.println("   O   |");
            System.out.println("  /|\\ |");
            System.out.println("       |");
            System.out.println("      ===");
            System.out.println("Guess again!");
        }
        if (wrongCount >= 6) {
            System.out.println("   +----+");
            System.out.println("   |   |");
            System.out.println("   O   |");
            System.out.println("  /|\\ |");
            System.out.println("  /    |");
            System.out.println("      ===");
            System.out.println("Guess again!");
        }
        if (wrongCount >= 7) {
            System.out.println("   +----+");
            System.out.println("   |   |");
            System.out.println("   O   |");
            System.out.println("  /|\\ |");
            System.out.println("  / \\ |");
            System.out.println("      ===");
            System.out.println("Out of guesses! Better luck next time.");

        }
    }
}










