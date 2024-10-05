import java.util.Scanner;
import java.util.Random;
public class HighOrLow {
    public static void main(String[] args) {
        Random gen = new Random();
        Scanner in = new Scanner(System.in);
        boolean doneInput = false;
        boolean correct = false;
        double guess = -1;
        String trash;


        int val = gen.nextInt(10) + 1;  // val is 1 to 10
        do {

            do {
                System.out.println("Guess the number between 1 and 10");
                if (in.hasNextInt()) {
                    guess = in.nextDouble();
                    in.nextLine();
                    if (guess > 0 && guess <= 10) {
                        doneInput = true;
                    } else {
                        trash = String.valueOf(guess);
                        System.out.println("You entered " + trash + ". Please guess a number between 1 and 10.");
                    }
                } else {
                    trash = in.nextLine();
                    System.out.println("You entered " + trash + ". Please guess a number between 1 and 10.");
                }
            }
            while (!doneInput);
            if (val > guess) {
                System.out.println("Your guess is LOW.");
            } else if (val < guess) {
                System.out.println("Your guess is HIGH.");
            } else {
                correct = true;
                System.out.println("Your guess is CORRECT! The number was " + val + ".");
            }
        } while (!correct);
    }
}
