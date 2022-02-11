import java.util.Scanner;

public class GuesstheNumber {
    public static void main(String[] args) {

    int randomNum = (int) (Math.random()*(20-1)) + 1;
    int count;

        System.out.println("Hello! What is your name?");
        System.out.println("Abaddon.");
        System.out.println("Well, Abaddon, I am thinking of a number between 1 and 20.");
        System.out.println("Take a guess.");
       



        for (count = 0; count < 6; count++) {

            Scanner getInput = new Scanner(System.in);
            String input = getInput.nextLine();
            int guess = Integer.parseInt(String.valueOf(input));

                if (guess > randomNum)
                {
                    System.out.println("Your guess is too high.");
                    System.out.println("Take a guess.");
                }
                else if (guess < randomNum) {
                    System.out.println("Your guess is too low.");
                    System.out.println("Take a guess.");
                }
                else
                {
                    System.out.println("Good job, Abaddon! You guessed my number in " + count + " guesses!");
                    System.out.println("Would you like to play again? (y or n)");
                    Scanner getAnswer = new Scanner(System.in);
                    String answer = getAnswer.nextLine();

                    if (answer.equalsIgnoreCase("n"))
                    {
                        break;
                    }

                    else
                    {
                        GuesstheNumber.main(args);
                    }
                }



        }

    }
}
