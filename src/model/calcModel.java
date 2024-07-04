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
        else if (from == "Binary")
        {
            if (to == "Decimal")
            {
                return BinaryTo.convertToDecimal(input);
            }
            else if (to == "Binary")
            {
                return BinaryTo.convertToBinary(input);
            }
            else if (to == "Octal")
            {
                return BinaryTo.convertToOctal(input);
            }
            else if (to == "HexaDecimal")
            {
                return BinaryTo.convertToHexaDecimal(input);
            }
        }
        else if(from == "Octal")
        {
            if (to == "Decimal")
            {
                return OctalTo.convertToDecimal(input);
            }
            else if (to == "Binary")
            {
                return OctalTo.convertToBinary(input);
            }
            else if (to == "Octal")
            {
                return OctalTo.convertToOctal(input);
            }
            else if(to == "HexaDecimal")
            {
                return OctalTo.convertToHexaDecimal(input);
            }
        }
        else if(from == "HexaDecimal")
        {
            if (to == "Decimal")
            {
                return HexaDecimalTo.convertToDecimal(input);
            }
            else if (to == "Binary")
            {
                return HexaDecimalTo.convertToBinary(input);
            }
            else if (to == "Octal")
            {
                return HexaDecimalTo.convertToOctal(input);
            }
            else if(to == "HexaDecimal")
            {
                return HexaDecimalTo.convertToHexaDecimal(input);
            }
        }
        return "wrong input";
    }
}
