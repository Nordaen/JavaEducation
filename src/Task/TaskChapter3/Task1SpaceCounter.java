package Task.TaskChapter3;

import java.io.IOException;

public class Task1SpaceCounter {
    public static void task1spacecounter() throws IOException {
        int spaceCounter = 0;
        char ch;

        System.out.println("Press something to get out from this program.");
        for (; ;) {
            ch = (char) System.in.read();
            if (ch == '.')
                break;
            if (ch == ' ')
             spaceCounter++;

        }
    System.out.println("You pressed space " + spaceCounter + " times");
    }
}


