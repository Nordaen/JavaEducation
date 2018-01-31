package Chapter11;

public class MyThread implements Runnable {
    String thrdName;
    MyThread(String name){
        thrdName = name;
    }
    public void run(){
        System.out.println(thrdName + " - launch");
        try{
            for (int count = 0;count<10;count++){
                Thread.sleep(400);
                System.out.println("In " + thrdName + ", counter:" +
                        count);
            }
        }
        catch(InterruptedException exc) {
            System.out.println(thrdName + " - interrupted");
        }
        System.out.println(thrdName + " - ending");
    }

}

class UseThreads {
    public static void Launch()
    {
        System.out.println("Main thread launch");
        MyThread mt = new MyThread("Child #1");
        Thread newThrd = new Thread(mt);
        newThrd.start();

        for (int i=0;i<50;i++){
            System.out.print(".");
            try{
                Thread.sleep(100);
            }catch(InterruptedException exc){
                System.out.println("Ending main thread");
            }
        }
    }
}
