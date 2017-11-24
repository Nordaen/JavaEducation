package Chapter_3;

public class Break5 {
    public static void break5()
    {
        done:
        for(int i = 0; i<10; i++){
            for(int j=0; j<10;j++){
                for(int k=0;k<10;k++){
                    System.out.println(k+" ");
                    if(k==5) break done;
                } System.out.println("After cycle for k");
            } System.out.println("After cycle for j");
        } System.out.println("After cycle for j");
    }
}
