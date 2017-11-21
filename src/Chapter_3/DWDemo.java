package Chapter_3;

public class DWDemo {
    public static void dwdemo()
    throws java.io.IOException
    {
        char ch;

        do{
            System.out.print("Press any button, and then <ENTER>: ");
            ch = (char) System.in.read();

        } while (ch != 'q');
    }
}
