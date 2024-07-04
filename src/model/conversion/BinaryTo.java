package model.conversion;
import model.conversion.*;

public class BinaryTo
{
    public static String convertToDecimal(String input)
    {
        long temp = Long.parseLong(input);
        long result = 0;
        for (int i = 0; i < input.length(); i++) {
            result = result + (temp % 10) * (long) Math.pow(2, i);
            temp /= 10;
        }
        return Long.toString(result);
    }
    public static String convertToBinary(String input)
    {
        return input;
    }
    public static String convertToOctal(String input)
    {
        String result = convertToDecimal(input);
        return DecimalTo.convertToOctal(result);
    }
    public static String convertToHexaDecimal(String input)
    {
        String result = convertToDecimal(input);
        return DecimalTo.convertToHexaDecimal(result);
    }
}
