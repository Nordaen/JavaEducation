package Chapter5;

public class StrOps {
    public static void Launch()
    {
        String str1 = "Java - leader of the Internet!";
        String str2 = new String(str1);
        String str3 = "String Java is efficient";
        int result, idx;
        char ch;

        System.out.println("Length str1: " + str1.length());

        for(int i =0; i<str1.length(); i++)
            System.out.print(str1.charAt(i));
        System.out.println();

        if(str1.equals(str2))
            System.out.println("str1 equal str2");
        else
            System.out.println("str not equal str2");

        if(str1.equals(str3))
            System.out.println("str1 equal str3");
        else
            System.out.println("str1 not equal str3");

        str2 = "One Two Three One";
        idx=str2.indexOf("One");
        System.out.println("Index of first entrance One: " +
                idx);
        idx = str2.lastIndexOf("One");
        System.out.println("Index of last entrance One: " + idx);


    }
}
