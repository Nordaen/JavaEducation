package Chapter_2;

public class LogicalOpTable {
    public static void logicaloptable()
    {
        boolean p, q;

        System.out.println("P\tQ\tAND\tOr\tNOT");

        p = true; q = true;
        System.out.print(p + "\t" + q+ "\t");
        System.out.print((p&q) + "\t" + (p|q) + "\t");
        System.out.println((p^q) + "\t" + (!p));

        p = true ; q = false;
        System.out.print(p + "\t" + q+ "\t");
        System.out.print((p&q) + "\t" + (p|q) + "\t");
        System.out.println((p^q) + "\t" + (!p));

        p = false; q = true;
        System.out.print(p + "\t" + q+ "\t");
        System.out.print((p&q) + "\t" + (p|q) + "\t");
        System.out.println((p^q) + "\t" + (!p));

        p = false; q = false;
        System.out.print(p + "\t" + q+ "\t");
        System.out.print((p&q) + "\t" + (p|q) + "\t");
        System.out.println((p^q) + "\t" + (!p));

    }
}
