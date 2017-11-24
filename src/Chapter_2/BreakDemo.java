package Chapter_2;

public class BreakDemo {
    public static void breakdemo()
    {
        int num = 100;

        for (int i = 0; i<num; i++){
            if (i*i >=num) break;
            System.out.println(i +" ");
        }
        System.out.println("Cycle finished.");
    }
}
