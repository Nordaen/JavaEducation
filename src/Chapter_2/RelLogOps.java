package Chapter_2;

public class RelLogOps {
    public static void rellogops()
    {
        int i,j;
        boolean b1,b2;

        i=10;
        j= 11;

        if(i<j) System.out.println("i<j");
        if(i<=j) System.out.println("i<=j");
        if(i!=j) System.out.println("i!=j");
        if(i==j) System.out.println("That will not be completed");
        if (i>=j) System.out.println("That will not be completed");
        if (i>j) System.out.println("That will not be completed");

        b1 = true;
        b2 = false;
        if(b1 & b2) System.out.println("That will not be completed");
        if (!(b1 &b2)) System.out.println("!(b1 & b2) : true");
        if (b1 | b2) System.out.println("b1 | b2: true");
        if (b1 ^ b2) System.out.println("b1 ^ b2: true");

    }

}
