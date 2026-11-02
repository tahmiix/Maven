import junit.framework.TestCase;
import junit.framework.TestResult;
import org.codewiththamsanqa.Student;
import org.codewiththamsanqa.StudentService;
import org.junit.Test;

public class CalculatorTest extends TestCase {
    Calculator c = new Calculator();

    @Test
    public void testAdd(){

        assertEquals(2, c.CalculatorAdd(1,1));
    }

    public void testMultiply(){
        assertEquals(4,c.CalculatorMultiply(9,2));
    }

    public void testDivion(){
        assertEquals((double)2,( c.CalculatorDivide(12.6, 6.3)));
    }


}