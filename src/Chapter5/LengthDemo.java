package Chapter5;

public class LengthDemo {
    public static void Launch(){
        int list[] = new int[10];
        int nums[] = {1,2,3};
        int table[][] = {
                {1,2,3},
                {4,5},
                {6,7,8,9}
        };
        System.out.println("List size: " + list.length);
        System.out.println("Nums size: " + nums.length);
        System.out.println("Table size: " + table.length);
        System.out.println("Table[0] size: " + table[0].length);
        System.out.println("Table[1] size: " + table[1].length);
        System.out.println("Table[2] size: " + table[2].length);
        System.out.println();

        for(int i=0; i<list.length;i++)
            list[i] = i*i;

        System.out.print("List content: ");
        for(int i=0; i<list.length;i++)
            System.out.print(list[i] + " ");
        System.out.println();
    }
}
