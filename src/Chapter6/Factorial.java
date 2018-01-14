package Chapter6;

public class Factorial {

    int factR(int n){
        int result;

        if(n==1) return 1;
        result  = factR(n-1) * n;
        return result;
    }
    int factI(int n){
        int t,result;

        result = 1;
        for (t=1; t<=n;t++) result *=t;
        return result;
    }
}

class Recursion{
    public static void Launch(){
        Factorial f=  new Factorial();

        System.out.println("Imperative canculation");
        System.out.println("Factorial 3 equal " + f.factR(3));
        System.out.println("Factorial 4 equal " + f.factR(4));
        System.out.println("Factorial 5 equal" + f.factR(5));

        System.out.println("Iterative canculation");
        System.out.println("Factorial 3 equal " + f.factI(3));
        System.out.println("Factorial 4 equal " + f.factI(4));
        System.out.println("Factorial 5 equal " + f.factI(5));
    }
}