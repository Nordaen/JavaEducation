package Chapter_2;

public class CastDemo {
public static void castdemo()
{
    double x,y;
    byte b;
    int i;
    char ch;

    x = 10.0;
    y= 3.0;
    i = (int) (x/y);
    System.out.println("integer division result x / y: " + i);

    i = 100;
    b = (byte) i;
    System.out.println("Value: " + b);

    i = 257;
    b = (byte) i;
    System.out.println("Value: " + b);

    b= 88;
    ch = (char) b;
    System.out.println("ch: " + ch);
}

}
