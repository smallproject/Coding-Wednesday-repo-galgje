import java.util.ArrayList;
import java.util.Random;

public class WoordenLijst {
    private ArrayList<String> woorden;

    public WoordenLijst(ArrayList<String> woorden) {
        this.woorden = woorden;
    }

    public WoordenLijst(String woorden) {
        if (woorden.isBlank())
            return;

        this.woorden.add(woorden);
    }

    public ArrayList<String> getWoorden() {
        return woorden;
    }

    public boolean getWoorden(String text) {
        return woorden.contains(text);
    }

    public String getRandomWoordFromList() {
        int number = random(woorden.size());
        String text = woorden.get(number);

        System.out.println(text);

        return text;
    }

    private int random(int count) {
        Random random = new Random();

        int randNumber;
        randNumber = random.nextInt(count);
        return randNumber;
    }
}
