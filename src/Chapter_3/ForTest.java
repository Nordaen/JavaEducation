package Chapter_3;

public class ForTest {
public static void fortest() throws java.io.IOException
{
    int i;

    System.out.println("Press S to stop.");
    for (i=0; (char) System.in.read() !='S'; i++)
        System.out.println("i value is: "+ i);

}
}
