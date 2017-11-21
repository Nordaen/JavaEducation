package Chapter_3;

public class ForVar {
    public static void forvar()
    {
        int sum = 0;
        int fact = 1;

        for (int i = 1; i<=5; i++)
        {
            sum+=i;
            fact*=i;
        }
        System.out.println("Sum:" + sum);
        System.out.println("Factorial: " + fact);
    }
}
