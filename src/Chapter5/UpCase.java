package Chapter5;

public class UpCase {
    public static void Launch()
    {
        char ch;

        for (int i=0;i<10;i++){
            ch = (char) ('a' +i);
            System.out.print(ch);

            System.out.print(ch + " ");
            ch = (char) ((int) ch& 65503);

            System.out.print(ch + " ");
        }

    }
}
