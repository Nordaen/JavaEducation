package Chapter_3;

public class NoBreak {
    public static void nobreak()
    {
        for (int i = 0; i<=5; i++){
            switch(i)
            {
                case 0 :
                    System.out.println("i less that 1");
                case 1:
                    System.out.println("i less that 2");
                case 2:
                    System.out.println("i less that 2");
                case 3:
                    System.out.println("i less that 2");
                case 4:
                    System.out.println("i less that 2");
            }
       System.out.println();
        }
    }
}
