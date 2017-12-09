package Chapter4;

public class Pwr {
    double b;
    int e;
    double val;

    Pwr(double base, int exp) {
        b =  base;
        e = exp;

        val = 1;
        if(exp==0)return;
        for (;exp>0;exp--) val=val*base;
        }
   double get_pwr(){
        return val;
   }
    }
    class DemoPwr{
    public static void launch(){
        Pwr x = new Pwr(4.0,2);
        Pwr y = new Pwr(2.5,1);
        Pwr z = new Pwr(5/7,0);

        System.out.println(x.b + "in grade " + x.e + " equal " + x.get_pwr());
        System.out.println(y.b + " in grade the " + y.e + " equal " + y.get_pwr());
        System.out.println(z.b + " in grade " + z.e + " equal " + z.get_pwr());
    

    }
    }

