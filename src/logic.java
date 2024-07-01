import java.util.*;
import java.lang.*;
public class logic {
    String decToBin(String x)
    {
        int y = Integer.parseInt(x);
        String s = "";
        while(y>0)
        {
            s = Integer.toString(y%2) + s;
            y /= 2;
        }
        return s;
    }
    String decToOctal(String x)
    {
        int y = Integer.parseInt(x);
        String s = "";
        while(y>0)
        {
            s = Integer.toString(y%8) + s;
            y /= 8;
        }
        return s;
    }
    String decToHex(String x)
    {
        int y = Integer.parseInt(x);
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
        return s;
    }
    String octalToDec(String x)
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
    String octalToHex(String x)
    {
        String y = octalToDec(x);
        return decToHex(y);
    }
    String octalToBin(String x)
    {
        String y = octalToDec(x);
        return decToBin(y);
    }
    String hexToDec(String x)
    {
        int h = 0;
        int y;
        for(int i = 0; i < x.length(); i++)
        {
            char c = x.charAt(x.length()-1-i);
            if(c == 'A')
            {
                y = 10;
            }
            else if (c == 'B')
            {
                y = 11;
            }
            else if (c == 'C')
            {
                y = 12;
            }
            else if (c == 'D')
            {
                y = 13;
            }
            else if (c == 'E')
            {
                y = 14;
            }
            else if (c == 'F')
            {
                y = 15;
            }
            else
            {
                y = Character.getNumericValue(c);
            }
            h = h + (y * (int)Math.pow(16,i));
            y /=10;
        }
        return Integer.toString(h);
    }
    String hexToOctal(String x)
    {
        String y = hexToDec(x);
        return decToOctal(y);
    }
    String hexToBinary(String x)
    {
        String y = hexToDec(x);
        return decToBin(y);
    }
    String binToDec(String x)
    {
        long y = Long.parseLong(x);
        long h = 0;
        for (int i = 0; i < x.length(); i++) {
            h = h + (y % 10) * (long) Math.pow(2, i);
            y /= 10;
        }
        return Long.toString(h);
    }
    String binToOctal(String x)
    {
        String y = binToDec(x);
        return decToOctal(y);
    }
    String binToHex(String x)
    {
        String y = binToDec(x);
        return decToHex(y);
    }
    public static void main (String [] args)
    {
        logic l = new logic();
        Scanner sc = new Scanner(System.in);
        System.out.println("what do u want to convert to?\nenter 1 for decimal\n2 for octal\n3 for hexadecimal\n4 for binary");
        int x = sc.nextInt();
        System.out.println("enter input type, is it decimal, octal, hex or binary?");
        String s = sc.next();
        System.out.println("enter input");
        String n = sc.next();
        switch (s)
        {
            case "decimal":
                if (x == 2)
                {
                    System.out.print(l.decToOctal(n));
                }
                else if (x == 3)
                {
                    System.out.print(l.decToHex(n));
                }
                else if (x == 4)
                {
                    System.out.print(l.decToBin(n));
                }
                break;
            case "octal":
                if(x == 1)
                {
                    System.out.print(l.octalToDec(n));
                }
                if (x==3)
                {
                    System.out.print(l.octalToHex(n));
                }
                if(x == 4)
                {
                    System.out.print(l.octalToBin(n));
                }
                break;
            case "hex":
                if(x == 1)
                {
                    System.out.print(l.hexToDec(n));
                }
                if (x==2)
                {
                    System.out.print(l.hexToOctal(n));
                }
                if(x == 4)
                {
                    System.out.print(l.hexToBinary(n));
                }
                break;
            case "binary":
                if(x == 1)
                {
                    System.out.print(l.binToDec(n));
                }
                if (x==2)
                {
                    System.out.print(l.binToOctal(n));
                }
                if(x == 3)
                {
                    System.out.print(l.binToHex(n));
                }
                break;
        }
    }
}