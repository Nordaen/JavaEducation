package Chapter_2;

public class VarInitDemo {
    public static void varinitdemo()

    {
        int x;

        for (x=0; x<3; x++)
        {
            int y = -1;
            System.out.println("y:" + y);
            y=100;
            System.out.println("Changed y: "+ y);
            
        }
    }
}
