package Task.TaskChapter3;

import java.io.IOException;

public class Task10 {
    public static void task10() throws IOException {
char ch;
int changeCounter=0;
        for (; ; ) {
            ch = (char) System.in.read();
            if (ch == '.') break;
            if(Character.isLowerCase(ch)){
                ch-=32;
                System.out.println(ch);
                changeCounter++;
                ch='1';
            }
            if(Character.isUpperCase(ch)){
                ch+=32;
                System.out.println(ch);
                changeCounter++;
            }
        }
        System.out.println("Changed letters count: "+ changeCounter);
    }
}
