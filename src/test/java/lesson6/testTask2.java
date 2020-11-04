package lesson6;
import lesson1.Task2;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class testTask2 {

    Task2 task2;


    @Test
    public void checkCorrectSubstr() {
        int actualNumSubstr = task2.getNames("Vitalii").split("\n").length;
        int expectedNumSubstr = 5;

        String message = String.format("Expected number of substrings '%d' but got '%d'", expectedNumSubstr,actualNumSubstr);
        assertEquals(actualNumSubstr, expectedNumSubstr, message);
    }
    @Test
    public void checkCorrectNumNames() {
        int expectedNumNames = 10;
        int actualNumNames = 0;
        for( int i = 0; i < 5; i++){
            actualNumNames = task2.getNames("Vitalii").split("\n")[i].split(" ").length;
            if(actualNumNames != expectedNumNames) break;
        }
        String message = String.format("Expected number of names %d but got %d", expectedNumNames,actualNumNames);

        assertEquals(actualNumNames, expectedNumNames, message);
    }
}
