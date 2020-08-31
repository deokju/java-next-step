package hellostudy.object;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StrCalculatorTest {
    private StrCalculator calc;

    @Before
    public void setup(){
        calc = new StrCalculator();
    }

    @Test
    public void 아주정상적인루트(){
        assertEquals(15,calc.run("1,2,3,4,5") ) ;
    }

    @Test
    public void 음수(){
        assertEquals(14,calc.run("-1,2,3,4,5") ) ;
    }

    @Test
    public void 커스텀구분자(){
        assertEquals(15,calc.run("//@\n1@2,3,4@5") ) ;
    }
}
