package model.conversion;

public class DecimalTo
{
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
        int y = Integer.parseInt(input);
        String s = "";
        while(y>0)
        {
            s = Integer.toString(y%8) + s;
            y /= 8;
        }
        return s.toString();
    }
    public static String convertToHexaDecimal(String input)
    {
        int y = Integer.parseInt(input);
        String s = "";
        while(y>0)
        {
            int q = y % 16;
            if( q < 10)
                s = Integer.toString(y%16) + s;
            else
            {
                if (q == 10)
                {
                    s = "A" + s;
                }
                else if (q == 11)
                {
                    s = "B" + s;
                }
                else if (q == 12)
                {
                    s = "C" + s;
                }
                else if (q == 13)
                {
                    s = "D" + s;
                }
                else if (q == 14)
                {
                    s = "E" + s;
                }
                else if (q == 15)
                {
                    s = "F" + s;
                }
            }
            y /= 16;
        }
        return s.toString();
    }
    public static String convertToDecimal(String input)
    {
        return input;
    }
}