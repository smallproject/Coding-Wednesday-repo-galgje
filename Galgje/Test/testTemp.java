import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;


class testTemp {

    @Test
    void getWoorden() {
        //Arrange
        var maxlenght = 5;
        var wordlist = new wordlist(maxlenght);

        //Act
        var sut =  wordlist.getrandomwoord;

        //Assert
//        assertNotNull();
//        assert test;
    }

    @Test
    public void TestImpossibleLengthRequest() {
        var maxLength = 0;

        //act
        var wordlist = new wordlist(maxLength);

    }


//    TestRandomwod();
//    TestImpossibleLengthRequest();
//    TestGetRandomWordOnEmptyPossibleWordList();
//    TestPossibleSize();
}