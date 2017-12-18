package Chapter5;

public class Search {
    public static void Launch()
    {
        int nums[] = {6,8,3,7,5,6,1,4};
        int val = 5;
        boolean found = false;

        for (int x : nums) {
            found = true;
            break;
        }
        if(found)
            System.out.println("Value founded!");
    }

}
