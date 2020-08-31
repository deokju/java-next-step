package hellostudy.object;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StrCalculator {
    private final String DELIMITER = "#";
    private List<String> delimiter = new ArrayList<>();

    public StrCalculator() {
        super();
        delimiter.add(";");
        delimiter.add(",");
    }

    public int run(String str) {
        if(str.isEmpty()){
            return 0;
        }

        String expectedNumbers = extractCustomDelimiter(str);
        return sum(expectedNumbers);
    }

    private String extractCustomDelimiter(String str) {
        String divide ="//";
        System.out.println(str.indexOf(divide));
        if(str != null &&str.indexOf(divide) == 0){
            delimiter.add(str.substring(2,3));
            return str.substring(4);
        }else{
            return str;
        }
    }

    private int sum(String expectedNumbers) {
        Integer[] numbers = stringToNumber(expectedNumbers);
        checkUnderNumber(numbers);
        return Arrays.stream(numbers).reduce(0, (s, e)->s + e);
    }

    private void checkUnderNumber(Integer[] numbers) {
        for(Integer num : numbers) {
            if(num <0)
                throw new RuntimeException("해당숫자는 음수입니다. [" + num+"]");
        }
    }

    private Integer[] stringToNumber(String expectedNumbers) {
        String _target = expectedNumbers;
        for(String tag : delimiter) {
            _target = _target.replaceAll(tag, DELIMITER);
        }

        String[] expectedNumber = _target.split("#");

        Integer[] integers = new Integer[expectedNumber.length];
        for(int i = 0; i<expectedNumber.length; i++)
        {
            integers[i]= Integer.valueOf(expectedNumber[i]);
        }

        return integers;
    }
}
