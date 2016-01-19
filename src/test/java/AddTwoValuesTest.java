import org.junit.*;
import static junit.framework.TestCase.assertEquals;

/**
 * Created by m18 on 14.01.2016.
 */
public class AddTwoValuesTest {


    @Before
    public void consolePrint() {
        System.out.println("Tests started!!! ");

    }

    @Test
    public void testAddTwoPositive1Values() {
        // Class for testing
        Calculate calc = new Calculate();

        // Method to check
        assertEquals("10 + 5 must be 15", 15, calc.add(10, 5));
    }

    @Test
    public void testAddTwoNegativeValues() {
        // Class for testing
        Calculate calc = new Calculate();

        // Method to check
        assertEquals("-10 + -5 must be -15", -15, calc.add(-10, -5));

    }

    @Test
    public void testAddTwoPositive2Values() {
        // Class for testing
        Calculate calc = new Calculate();

        // Method to check
        assertEquals("7 + 7 must be 14", 14, calc.add(7, 7));
    }

    @Test
    public void testAddTwoBigValues() {
        // Class for testing
        Calculate calc = new Calculate();

        // Method to check
        assertEquals("99999999 + 99999999 must be 199999998", 99999998, calc.add(99999999, 99999999));
    }

    @Test
    public void testAddTwoDifferent1Values() {
        // Class for testing
        Calculate calc = new Calculate();

        // Method to check
        assertEquals("-7 + 7 must be 0", 0, calc.add(-7, 7));
    }

    @Test
    public void testAddTwoDifferent2Values() {
        // Class for testing
        Calculate calc = new Calculate();

        // Method to check
        assertEquals("0 + -1 must be -1", -1, calc.add(0, -1));
    }

    @Ignore
    public void testAddTwoDifferentValuesIgnore() {
        // Class for testing
        Calculate calc = new Calculate();

        // Method to check
        assertEquals("5732037 + -5732037 must be 0", 0, calc.add(5732037, -5732037));
    }


    @Test
    public void testAddTwoDifferent3Values() {
        // Class for testing
        Calculate calc = new Calculate();

        // Method to check
        assertEquals("5732037 + -5732037 must be 0", 0, calc.add(5732037, -5732037));
    }

    @BeforeClass
    public static void PrintText() {
        System.out.println("Text from BeforeClass");
    }

    @AfterClass
    public static void PrintTextAtTheEnd() {
        System.out.println("Text from AfterClass");
    }

    //TODO
    //add new 5 tests for add() method


    //TODO
    //add tests for new methods

    @After
    public void consolePrintAfter() {
        System.out.println("Tests finished!!! ");

    }
}