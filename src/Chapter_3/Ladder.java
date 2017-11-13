package Chapter_3;

public class Ladder {
    public static void ladder()
    {
        for (int x = 0; x<6; x++){
            if(x==1)
                System.out.println("x equal 1");
            else if(x==2)
                System.out.println("x equal 2");
            else if (x==3)
                System.out.println("x equal 3");
            else if (x==4)
                System.out.println("x equal 4");
            else
                System.out.println("X is in range: 1 - 4");
        }
    }
}
