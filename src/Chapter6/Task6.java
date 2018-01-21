package Chapter6;

import java.util.Scanner;

public class Task6 {


    public static void Launch()
    {
        Scanner s=  new Scanner(System.in);
        String expression = s.next();
        String reverse = new StringBuffer(expression).reverse().toString();
        System.out.println(reverse);

    }
}
