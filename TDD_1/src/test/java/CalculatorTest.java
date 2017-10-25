import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculatorTest{

    Calculator tester = new Calculator();

    @Test
    public void TestAdd() throws Exception {
        assertEquals(2,tester.Add(1,1));
    }

    @Test
    public void TestMult() throws Exception {
        assertEquals(10,tester.Mult(2,5));
    }

    @Test
    public void TestSub() throws Exception {
        assertEquals(8,tester.Sub(10,2));
    }

    @Test
    public void TestDiv() throws Exception {
        assertEquals(2,tester.Add(1,1));
    }
}
