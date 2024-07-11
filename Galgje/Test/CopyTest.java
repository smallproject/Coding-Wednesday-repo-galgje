import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CopyTest {

    @Test
    void temp() {
        //Arrange
        boolean rand;

        //Act
        rand = Copy.tempWoord("netwerk", "netwerk");

        //Assert
        assertEquals(rand, Copy.tempWoord("netwerk", "netwerk"));
    }
}