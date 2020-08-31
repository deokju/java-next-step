package hellostudy.object;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    private Calculator cal;

    @Before
    public void before(){
        cal = new Calculator();
        System.out.println("before");
    }

    @Test
    public void add() {
        assertEquals(9,cal.add(6,3));
        System.out.println("add");
    }

    @Test
    public void subtract(){
        assertEquals(3,cal.substract(6,3));
        System.out.println("subtract");
    }

    @Test
    public void multiply() {
        assertEquals(16, cal.multipy(4,4));
        System.out.println("multiply");
    }

    @Test
    public void divide(){
        assertEquals(1, cal.divide(4,4));
        System.out.println("divide");
    }

    @After
    public void after() {
        System.out.println("after");
    }
}
