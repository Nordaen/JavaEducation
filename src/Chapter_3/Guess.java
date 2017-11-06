package Chapter_3;

public class Guess {
    public static void guess() throws java.io.IOException
    {
        char ch, answer ='S';

        System.out.println("Litter guessed from A-Z");
        System.out.println("Make a guess");
        ch = (char) System.in.read();

        if (ch == answer) System.out.println("You god damn right!");
    }
}
