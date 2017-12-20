package Chapter5;

public class ShowBitsDemo {

    public void Launch()
    {
            ShowBits b = new ShowBits(8);
            ShowBits i = new ShowBits(32);
            ShowBits li = new ShowBits(64);

            System.out.println("123 in binary value: ");
            b.show(123);

            System.out.println("\n87987 in binary value: ");
            i.show(87987);

            System.out.println("\n237658768 in binary value: ");
            li.show(237658768);

            System.out.println("\nYoung 8 bites of number 87987 in binary value: ");
            b.show(87987);
    }
  class  ShowBits{
        int numbits;
        ShowBits(int n) {
            numbits = n;
        }
    void show(long val){
            long mask = 1;
            mask <<=numbits-1;

            int spacer = 0;
            for (;mask!=0;mask>>=1){
                if((val&mask)!=0)System.out.print("1");
                else System.out.print("0");
                spacer++;
                if((spacer %8) == 0){
                    System.out.print(" ");
                    spacer = 0;
                }
            }
    }

    }
}

