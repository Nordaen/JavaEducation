package Chapter6;

public class Chapter6_Task13 {
    public int sum(int ...a){
        int cache=0;
        for (int i : a){
            cache+=i;
        }
        return cache;
    }
    public void Launch()
    {
       int i= sum(1,2,3,4,5);
       System.out.println(i);
    }
}
