package model.conversion;

public class HexaDecimalTo {
    public static String convertToDecimal(String input)
    {
        int result = 0;
        int tempInt;
        for(int i = 0; i < input.length(); i++)
        {
            char tempChar = input.charAt(input.length()-1-i);
            if(tempChar == 'A')
            {
                tempInt = 10;
            }
            else if (tempChar == 'B')
            {
                tempInt = 11;
            }
            else if (tempChar == 'C')
            {
                tempInt = 12;
            }
            else if (tempChar == 'D')
            {
                tempInt = 13;
            }
            else if (tempChar == 'E')
            {
                tempInt = 14;
            }
            else if (tempChar == 'F')
            {
                tempInt = 15;
            }
            else
            {
                tempInt = Character.getNumericValue(tempChar);
            }
            result = result + (tempInt * (int)Math.pow(16,i));
            tempInt /=10;
        }
        return Integer.toString(result);
    }
    public static String convertToBinary(String input)
    {
        String result = convertToDecimal(input);
        return DecimalTo.convertToBinary(result);
    }
    public static String convertToOctal(String input)
    {
        String result = convertToDecimal(input);
        return DecimalTo.convertToOctal(result);
    }
    public static String convertToHexaDecimal(String input)
    {
        return input;
    }
}