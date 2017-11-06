package Chapter_3;

import java.io.IOException;

public class KbIn {
    public static void kbin() throws java.io.IOException {

    char ch;
    System.out.println("Press any button, then enter");
    ch = (char) System.in.read();
    System.out.println("You pressed button " + ch);
        }
    }


