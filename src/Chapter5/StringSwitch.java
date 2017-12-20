package Chapter5;

public class StringSwitch {
    public static void Launch()
    {
        String command = "cancel";

        switch(command){
            case "connect":
                System.out.println("Connecting");
                break;
            case "cancel":
                System.out.println("Cancelling");
                break;
            case "disconnect":
                System.out.println("Disconnecting");
                break;
            default:
                System.out.println("Wrong command.");
                break;
            
        }
    }
}
