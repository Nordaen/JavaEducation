package Chapter5;

public class NotZeroDiv {
    public static void Launch()
    {
        int result;

        for(int i = -5; i<6; i++){
            result = i!=0 ? 100/i:0;
            if(i!=0)
                System.out.println("100 / " + i + " equal" + result);
        }
    }
}
