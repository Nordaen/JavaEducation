package Chapter5;

public class Encode {
    public static void Launch()
    {
        String msg = "This is a test";
        String encmsg = "";
        String decmsg = "";
        int key = 88;

        System.out.print("Source message: ");
        System.out.println(msg);

        for(int i = 0; i< msg.length();i++)
            encmsg = encmsg + (char) (msg.charAt(i) ^ key);

        System.out.print(encmsg);

        for (int i=0; i<msg.length(); i++)
            decmsg = decmsg + (char) (encmsg.charAt(i) ^ key);

        System.out.print("Decrypted message: ");
        System.out.println(decmsg);
    }
}
