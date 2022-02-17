import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Dragon_Cave dragon = new Dragon_Cave();
        System.out.println(dragon.intro());
        System.out.println(dragon.promptUser());

        if (dragon.getUserInput(scanner) == 1) {
            System.out.println(dragon.outcome1());
        } else {
            System.out.println(dragon.outcome2());
        }

        System.out.println("\nThank you for playing");
    }
}
