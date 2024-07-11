import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class WoordenLijstTest {

    @Test
    void getWoorden() {
        //Arrange
        ArrayList<String> woordenLijst = new ArrayList<String>(
                Arrays.asList("netwerk","Monitor","api")
        );

        WoordenLijst RandomWoord = new WoordenLijst(woordenLijst);

        //Act
        String text = RandomWoord.getRandomWoordFromList();

        //Assert
        assertTrue(RandomWoord.getWoorden(text));

    }
}