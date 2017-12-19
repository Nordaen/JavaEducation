package Chapter5;

public class StringArrays {
    public static void Launch() {
        String strs[] = {"This", "String,", "Is", "Test"};
    System.out.println("Source massive: ");
    for(String s: strs)
        System.out.print(s + " ");
    System.out.println("\n");

    strs[2] = "and exacly";
    strs[3] = "test!";

        for(String s: strs)
            System.out.print(s + " ");
    }

}
