import org.junit.Assert;
import org.junit.Test;

public class DiceTest {

    public DiceTest() {

    }

    @Test
    public void diceConstructorTest() {
        // Given
        int numberOfDice = 3;

        // When a set of dice is constructed
        Dice dice = new Dice(numberOfDice);

        // When we retrieve the number of dice from the set
        int retrievedNumberOfDice = dice.getNumberOfDies();

        // Then we expect the retrieved number to match the given number
        Assert.assertEquals(numberOfDice, retrievedNumberOfDice);
    }

    // The above test also tests getNumberOfDies, so I didn't create a test for that

    // The tossAndSum method and the getValuesOfDies method both employ Math.random and cannot be unit tested

    @Test
    public void setNumberOfDiesTest() {
        // Given a set of 6 dice exists and a value to set the dice to exists
        Dice dice = new Dice(6);
        int expected = 4;

        // When we set the number of dies to the new value
        dice.setNumberofDies(expected);

        // When we return the number of dies
        int actual = dice.getNumberOfDies();

        // Then we expect the expected and actual to be the same
        Assert.assertEquals(expected, actual);
    }
}

