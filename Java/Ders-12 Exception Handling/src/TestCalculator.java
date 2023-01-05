import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.fail;

public class TestCalculator {
    Calculator calculator;

    @Before
    public void setUp() throws Exception {
        calculator = new Calculator(); //creating the object of the Calculator class since the divide function inside the Calculator class is not static
    }

    @Test
    public void testDivide() {
        int num1 = 5;
        int num2 = 0;

        try {
            calculator.divide(num1, num2);
            fail();
        }
        catch (Exception ignored){

        }
    }
}
