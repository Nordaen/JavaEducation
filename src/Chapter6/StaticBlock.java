package Chapter6;

public class StaticBlock {
    static double rootOf2;
    static double rootOf3;

    static{
        System.out.println("In static block");
        rootOf2 = Math.sqrt(2.0);
        rootOf3 = Math.sqrt(3.0);
    }
    StaticBlock(String msg){
        System.out.println(msg);
    }
}

class SDemo3{
    public static void Launch(){
        StaticBlock ob = new StaticBlock("In constructor");
        System.out.println("Square root 2 equal: " + StaticBlock.rootOf2);
        System.out.println("Square toor 3 equal: " + StaticBlock.rootOf3);
    }
}