package model.conversion;

public class DecimalTo
{
    public static String convertToDecimal(String input)
    {
        return input;
    }
    public static String convertToBinary(String input)
    {
        int temp = Integer.parseInt(input);
        String result = "";
        while(temp>0)
        {
            result = Integer.toString(temp%2) + result;
            temp /= 2;
        }
        return result.toString();
    }
    public static String convertToOctal(String input)
    {
        int temp = Integer.parseInt(input);
        String result = "";
        while(temp>0)
        {
            result = Integer.toString(temp%8) + result;
            temp /= 8;
        }
        return result.toString();
    }
    public static String convertToHexaDecimal(String input)
    {
        int temp = Integer.parseInt(input);
        String result = "";
        while(temp>0)
        {
            int var = temp % 16;
            if( var < 10)
                result = Integer.toString(temp%16) + result;
            else
            {
                if (var == 10)
                {
                    result = "A" + result;
                }
                else if (var == 11)
                {
                    result = "B" + result;
                }
                else if (var == 12)
                {
                    result = "C" + result;
                }
                else if (var == 13)
                {
                    result = "D" + result;
                }
                else if (var == 14)
                {
                    result = "E" + result;
                }
                else if (var == 15)
                {
                    result = "F" + result;
                }
            }
            temp /= 16;
        }
        return result.toString();
    }
}