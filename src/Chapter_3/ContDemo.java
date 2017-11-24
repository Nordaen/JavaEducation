package Chapter_3;

public class ContDemo {
    public static void contdemo()
    {
        int i;

        for(i = 0; i<=100; i++){
            if ((i%2) !=0) continue;
            System.out.println(i);
        }
    }
}
