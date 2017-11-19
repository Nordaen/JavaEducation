package Chapter_3;

public class SqrRoot {
    public static void SqrRoot()
    {
        double num, sroot, rerr;

        for (num = 1.0; num < 100.0; num++){
            sroot = Math.sqrt(num);
            System.out.println("Square root from " + num + " equal " + sroot);

            rerr = num - (sroot * sroot);
            System.out.println("Rounding error: " + rerr);
            System.out.println();
        }
    }

}
