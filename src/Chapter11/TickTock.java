package Chapter11;

public class TickTock {
    String state;

    synchronized void tick(boolean running){
        if(!running){
            state = "ticked";
            notify();
            return;
        }
        System.out.print("Tick ");

        state = "ticked";
        notify();

        try {
        while (!state.equals("tocked"))
            wait();
        } catch(InterruptedException exc){
            System.out.println("Interrupted thread");
        }
    }
    synchronized void tock(boolean running){
        if(!running){
            state = "tocked";
            notify();
            return;
        }
        System.out.println("Tock");
        state = "tocked";
        notify();
        try{
            while(!state.equals("ticked"))
                wait();
        }catch(InterruptedException exc){
            System.out.println("Thread interruption");
        }
    }
}

class MyThread implements Runnable{
    Thread thrd;
    TickTock ttOb;

    MyThread(String name, TickTock tt){
        thrd = new Thread(this,name);
        ttOb = tt;
        thrd.start();
    }

    public void run()
    {
        if(thrd.getName().compareTo("Tick")==0){
            for(int i=0; i<5; i++) ttOb.tick(true);
            ttOb.tick(false);
        }
        else{
            for(int i=0; i<5; i++) ttOb.tock(true);
            ttOb.tock(false);
        }
    }
}

class ThreadCom{
    public static void Launch()
    {
        TickTock tt = new TickTock();
        MyThread mt1 = new MyThread("Tick",tt);
        MyThread mt2 = new MyThread("Tock",tt);

        try{
            mt1.thrd.join();
            mt2.thrd.join();
        } catch(InterruptedException exc){
            System.out.println("Interrupted main thread");
        }
    }
}
