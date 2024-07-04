package model.conversion;
import model.conversion.*;
import java.lang.Math;

public class OctalTo {
    public static String convertToDecimal(String input)
    {
        int temp = Integer.parseInt(input);
        int result = 0;
        for(int i = 0; i < input.length(); i++)
        {
            result = result + (temp % 10) * (int)Math.pow(8,i);
            temp /=10;
        }
        return Integer.toString(result);
    }
    public static String convertToBinary(String x)
    {
        String y = convertToDecimal(x);
        return DecimalTo.convertToBinary(y);
    }
    public static String convertToOctal(String input)
    {
        return input;
    }
    public static String convertToHexaDecimal(String input)
    {
        String result = convertToDecimal(input);
        return DecimalTo.convertToHexaDecimal(result);

    }
}
