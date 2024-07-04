package model.conversion;
import model.conversion.DecimalTo;

public class OctalTo {
    public static String octalToDec(String x)
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
        String y = octalToDec(x);
        return DecimalTo.convertToBinary(y);
    }
}
