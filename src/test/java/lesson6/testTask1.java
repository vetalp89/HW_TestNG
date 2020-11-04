package lesson6;

import lesson1.Task1;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;



public class testTask1 {

    Task1 task1;



    @Test(dataProvider = "minNum")
    public void getMinNumber(int a, int b, int c, int expected) {
        int actualNum = task1.min(a,b,c);
        String message = String.format("Min number is incorrect for: %d,%d,%d", a,b,c);
        assertEquals(actualNum, expected, message);
    }


    @DataProvider(name = "minNum")
    public Object[][] runTest() {
        return new Object[][] {
                {2,4,5,2},
                {2,5,6,2},
                {8,3,7,3},
                {1,5,8,1},
                {1,2,8,1}
        };

    }

}
