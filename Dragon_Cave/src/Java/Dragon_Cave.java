import java.util.Scanner;

public class Dragon_Cave {

    public String intro() {
        return "You are in a land full of dragons. In front of you\n" +
            "you see two caves. In one cave, the dragon is friendly\n" +
                "and will share his treasure with you. The other dragon\n" +
                "is greedy and will eat you on sight\n";
    }

    public String promptUser() {
        return "Please pick 1 or 2";
    }

    public String outcome1() {
        return "You approach the cave...\n" +
                "It is dark and spooky\n" +
                "A large dragon jumps out in front of you! He opens his jaws and...\n" +
                "Gobbles you down in one bite!";
    }

    public String outcome2() {
        return "You approach the cave...\n" +
                "It us bright and vibrant...\n" +
                "A large dragon on top of a pile of gold allows you in and says...\n" +
                "Take as much as you would like!\n";
    }

    public int getUserInput(Scanner scanner) {
        return scanner.nextInt();
    }
}