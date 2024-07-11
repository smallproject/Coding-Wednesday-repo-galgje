import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Copy {
    static WoordenLijst RandomWoord;
    static String woord;
    static int remainingAttempts = 6;
    static StringBuilder fouteLetters = new StringBuilder();
    static StringBuilder guessedLettersBuilder = new StringBuilder();

    private static void init() {
        ArrayList<String> woordenLijst = new ArrayList<String>(
                Arrays.asList("netwerk","Monitor","api","Javascript","React","Java")
        );

        RandomWoord =  new WoordenLijst(woordenLijst);
        woord = RandomWoord.getRandomWoordFromList().toLowerCase();

    }

    public static void main(String[] args) {
        init();
        machine();
    }

    public static void machine() {

        printGuessedLetters(woord);

        while(remainingAttempts > 0 && !(guessedLettersBuilder.toString().equals(woord))) {
            System.out.println(guessedLettersBuilder);
            Scanner scanner = new Scanner(System.in);
            System.out.print("Guess a letter: ");
            char gok = scanner.next().toLowerCase().charAt(0);


            boolean guessCorrectly = false;
            for (int i = 0; i < woord.length(); i++) {
                if (woord.charAt(i) == gok) {
                    guessCorrectly = true;
                    guessedLettersBuilder.setCharAt(i, gok);
                }

            }

            if (guessCorrectly) {
                System.out.println("Correct");
            } else {
                System.out.println("Incorrect");

                if (!guessedLetter(gok)) {
                    fouteLetters.append(gok);
                    remainingAttempts--;
                }
            }

            System.out.println("attempts:" + remainingAttempts);
            System.out.println(fouteLetters);
        }

    }

    public static boolean tempWoord(String woord, String raadWoord) {
        return raadWoord.equals(woord);
    }

    public static boolean guessedLetter(char letter) {
        for (int i = 0; i < fouteLetters.length(); i++) {
            if (fouteLetters.charAt(i) == letter) {
                return true;
            }
        }

        return false;
    }

    public static String printGuessedLetters(String woord) {
        String text = "";
        for (int i = 0; i < woord.length(); i++) {
//            text += "_";
            guessedLettersBuilder.append("-");
        }
        System.out.println(guessedLettersBuilder);
        return text;
    }



}
