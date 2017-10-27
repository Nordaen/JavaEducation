package Chapter_2;

public class SideEffects {
    public static void SideEffects(){
        int i;
        i = 0;

        if (false & (++i <100))
            System.out.println("This row will not be displayed");
        System.out.println("IF operator will not be displayed");
        System.out.println("IF operator running: " + i);
        if (false && (++i <100))
            System.out.println("This row will not be displayed");
        System.out.println("IF operator running " + i);
    }
}
