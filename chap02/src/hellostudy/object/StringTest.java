package hellostudy.object;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class StringTest {

    @Test
    public void 쉼표_찾기(){
        String divide ="//";
        String target = "//;\n1234";

        System.out.println(target.indexOf(divide));
        if(target != null &&target.indexOf(divide) == 0){
            System.out.println(target.substring(2,3));
            System.out.println(target.substring(4));
        }
    }

    @Test
    public void 숫자분할(){
        String _divide = "#";
        String divides[] = new String[2];
        divides[0] = ":";
        divides[1] = ",";

        String target = "1,2,4:5";

        String _target = target;
        for(String tag : divides) {
            _target = _target.replaceAll(tag, _divide);
        }
        assertEquals("1#2#4#5", _target);
    }

    @Test
    public void 문자To숫자(){
        String target = "1#2#4#5";
        String[] expectedNumber = target.split("#");

        Integer[] integers = new Integer[expectedNumber.length];
        for(int i = 0; i<expectedNumber.length; i++)
        {
            integers[i]= Integer.valueOf(expectedNumber[i]);
        }
    }

    @Test
    public void 합산(){
        Integer[] integers = new Integer[]{1,2,3,4,5};

        int result = Arrays.stream(integers).reduce(0, (s,e)->s + e);
        assertEquals(15, result);
    }

}
