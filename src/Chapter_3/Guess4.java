package Chapter_3;

public class Guess4 {
    public static void guess4() throws java.io.IOException {
        char ch, ignore, answer = 'S';

        do {
            System.out.println("Guessed letter from range A-Z. ");
            System.out.print("Try to make a guess: ");

            ch = (char) System.in.read();
            do {
                ignore = (char) System.in.read();
            } while (ignore != '\n');
            if (ch == answer) System.out.println("You god damn right. ");
            else {
                System.out.print("Sorry, the letter that we need is ");
                if (ch < answer)
                    System.out.println("closely to alphabet end");
                else
                    System.out.println("closely to alphabet begin");
                System.out.println("Try it again! \n");
            }
        } while (answer != ch);
    }
}
