import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
        GuesstheNumber game = new GuesstheNumber();
        System.out.println(game.intro());
        System.out.println(game.promptUser());

        int randomNum = (int) (Math.random() * (20 - 1)) + 1;
        int count;
        for (count = 0; count < 6; count++) {

            String input;
            Scanner getInput = new Scanner(System.in);
            try {
                input = getInput.nextLine();
            } catch (Exception e) {
                System.out.println("!error!");
                return;
            }


            int guess = Integer.parseInt(String.valueOf(input));

            if (guess > randomNum) {
                System.out.println("Your guess is too high.");
                System.out.println("Take a guess.");
            } else if (guess < randomNum) {
                System.out.println("Your guess is too low.");
                System.out.println("Take a guess.");
            } else {
                System.out.println("Good job, Abaddon! You guessed my number in " + count + " guesses!");
                System.out.println("Would you like to play again? (y or n)");
                String answer;
                Scanner getAnswer = new Scanner(System.in);
                try {
                    answer = getAnswer.nextLine();
                } catch (Exception e) {
                    System.out.println("!error!");
                    return;
                }
                if (answer.equalsIgnoreCase("n")) {
                    break;
                } else {
                    main(args);
                }
            }


        }
    }
}

