package Chapter_2;

import java.io.IOException;

public class Break2 {
    public static void break2() throws IOException{
        char ch;
        for (;;){
            ch = (char) System.in.read();
            if(ch=='q') break;

        }
        System.out.println("You pressed the q button!");
    }
}
