package Chapter5.Tasks;

import java.util.Random;

public class Task13 {
    public static void Launch() {
        int nums[] = new int[10];
        int min, max;
        Random random = new Random();
        for (int i = 0; i != 10; i++) {

            nums[i] = random.nextInt(100);
        }
        min = max = nums[0];
        for (int i : nums) {
            if (i < min) min = i;
            if (i > max) max = i;
        }
        System.out.println("min and max: " + min + " "
                + max);
    }
}
