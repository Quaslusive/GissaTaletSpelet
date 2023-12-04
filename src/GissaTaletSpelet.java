import java.util.Random;
import java.util.Scanner;
/*
  Skriven av Carl Sundberg
  Komplettering #1 2023/11/08
*/

public class GissaTaletSpelet {
    static Scanner sc = new Scanner(System.in); // Skanner

    public static void main(String[] args) {

        while (true) { // Loopen kommer att gå förevigt
            playGuessingGame();
        }
    }
    static void playGuessingGame() {

        Random rand = new Random(); // Skapar en slumptal generator
        int randomNum = rand.nextInt(100 + 1); // Slumpmässig tal från 0 till 99 + 1

        System.out.println("Guess a number between 0 snd 100 \n" + "What is your guess? ");
        try {
            int userGuess = sc.nextInt(); // Läser in indata
            gameResult(userGuess, randomNum);
        } catch (Exception e) {
            System.err.println("Only numbers allowed \nResenting Game...");
            sc.nextLine();
        }
    }

    static void gameResult(int userGuess, int randomNum) {

        int attemptNum = 1; // Antal försök

        while (true) { // Loopen kommer att fortsätta tills användaren har svarat rätt ==

            if (userGuess == randomNum) {
                System.out.println("Correct! You needed " + attemptNum + " to find the correct number!");
                break;
            } else if (userGuess > randomNum) {
                System.out.println("Wrong! My number is smaller! \n" + "What is your guess? ");
            } else {
                System.out.println("Wrong! My number is bigger! \n" + "What is your guess? ");
            }
            attemptNum++;
            userGuess = sc.nextInt();
        }
    }
}