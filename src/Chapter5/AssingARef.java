package Chapter5;

public class AssingARef {
    public static void Launch()
    {
        int i;

        int nums1[] = new int[10];
        int nums2[] = new int[10];

        for (i=0;i<10;i++)
            nums1[i] = i;
        for(i=0;i<10;i++)
            nums2[i]=-i;
        System.out.print("Nums1 array: ");
        for(i=0;i<10;i++)
            System.out.print(nums1[i]+" ");
        System.out.println();

        System.out.print("Nums2 array: ");
        for(i=0;i<10;i++)
            System.out.print(nums2[i]+ " ");
        System.out.println();

        nums2=nums1; // now both variables refers to array nums1
        System.out.print("Nums2 after assignment: ");
        for(i=0;i<10;i++)
            System.out.print(nums2[i]+ " ");
        System.out.println();

        //Make operation on array nums1 from nums2 variable
        nums2[3]=99;

        System.out.print("Nums1 array after changes from nums2: ");
        for(i=0;i<10;i++)
            System.out.print(nums1[i]+" ");
        System.out.println();
    }
}
