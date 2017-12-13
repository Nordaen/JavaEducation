package Chapter5;

import java.util.Random;

public class MinMax {
    public static void Launch()
    {
        int nums[] = new int[10];
        int min,max;
        Random random = new Random();
        for (int i = 0;i!=10;i++)
        {

            nums[i] = random.nextInt(100);
        }
        min = max = nums[0];
        for(int i=1;i<10;i++){
            if(nums[i] < min) min=nums[i];
            if(nums[i] > max) max = nums[i];
        }
        System.out.println("min and max: " + min + " "
        + max);
    }
}
