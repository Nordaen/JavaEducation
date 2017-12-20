package Chapter5;

public class SubStr {
    public static void Launch()
    {
        String orgstr = "Java - engine of the internet";

        String substr = orgstr.substring(7,25);
        System.out.println("orgstr: " + orgstr);
        System.out.println("substr: "+ substr);
    }
}
