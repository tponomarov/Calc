import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by m18 on 14.01.2016.
 */

public class FileCheckerTest {

    @Before
    public void consolePrint() {
        System.out.println("Tests started!!! ");

    }

    @Test
    public void FileCheckerTestExisting() {
        // Class for testing
        FileChecker f = new FileChecker();

        if(f ){
            System.out.println("File existed");
        }else{
            System.out.println("File not found!");
        }

    }


    @AfterClass
    public static void PrintTextAtTheEnd() {
        System.out.println("Text from AfterClass");
    }
}
