package Chapter_2;

public class Break3 {
    public static void break3(){
        for (int i=0; i<3; i++)
        {
            System.out.println("Outsource cycle counter: " + i);
            System.out.print("       Inside cycle counter: ");

            int t =0;
            while(t<100){
                if (t == 10) break;
                System.out.print(t+ " ");
                t++;
            }
        }
    }
}
