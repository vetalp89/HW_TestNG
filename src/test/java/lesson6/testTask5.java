package lesson6;

import lesson1.Task5;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class testTask5 {
    Task5 task5;


    @Parameters({"initialString", "expectedReversedString"})
    @Test
    public void testTask5(
            @Optional("Hello") String initialString, @Optional("olleH") String expectedReversedString) {
        String actualReversedString = task5.main(initialString);
        String message = String.format("Expected %s but got %s", expectedReversedString, actualReversedString);
        assertEquals(
                expectedReversedString,
                actualReversedString,
                message
        );
    }

}
