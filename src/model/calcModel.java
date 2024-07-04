package model;
import model.conversion.*;

public class calcModel
{
    public static String convert(String from, String to, String input)
    {
        if(from == "Decimal")
        {
            if (to == "Binary")
            {
                return DecimalTo.convertToBinary(input);
            }
            else if (to == "Octal")
            {
                return DecimalTo.convertToOctal(input);
            }
            else if (to == "HexaDecimal")
            {
                return DecimalTo.convertToHexaDecimal(input);
            }
            else if (to == "Decimal")
            {
                return DecimalTo.convertToDecimal(input);
            }
        }
        return "fine";
    }
}
