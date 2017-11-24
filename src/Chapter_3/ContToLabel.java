package Chapter_3;

public class ContToLabel {
    public static void conttolabel()
    {
        outerloop:
        for(int i=1; i<10; i++){
            System.out.print("\nOuter Cycle: pass "+ i + ", inner cycle: ");
            for (int j=1;j<10;j++){
                if(j==5) continue outerloop;
                System.out.print(j);
            }
        }
    }
}
