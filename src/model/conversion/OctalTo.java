package model.conversion;
import model.conversion.*;

public class OctalTo {
    public static String convertToDecimal(String x)
    {
        int y = Integer.parseInt(x);
        int h = 0;
        for(int i = 0; i < x.length(); i++)
        {
            h = h + (y % 10) * (int)Math.pow(8,i);
            y /=10;
        }
        return Integer.toString(h);
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
