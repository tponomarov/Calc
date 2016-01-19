import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by m18 on 14.01.2016.
 */
public class MultiplyTwoValuesTest {

    @Before
    public void consolePrint() {
        System.out.println("Tests started!!! ");

    }

    @Test
    public void MultiplyTwoValues1Test() {
        // Class for testing
        Calculate calc = new Calculate();

        // Method to check
        assertEquals("80 * 80 must be 6400", 6400, calc.multiply(80, 80));
    }

    @After
    public void consolePrintAfter() {
        System.out.println("Tests are ends!!! ");

    }
}