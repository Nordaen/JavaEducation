package Chapter12;

public class AutoBox2 {
    static void m(Integer v){
        System.out.println("m() received " + v);
    }
    static int m2(){
        return 10;
    }
    static Integer m3()
    {
        return 99;
    }
    public static void Launch()
    {
        m(199);
        Integer iOb = m2();
        System.out.println("Value received from m2(): "+ iOb);

        int i = m3();
        System.out.println("Value received from m3(): " + i);

        iOb = 100;
        System.out.println("Root square from iOb: " + Math.sqrt(iOb));
        
    }

}
