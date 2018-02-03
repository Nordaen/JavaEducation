package Chapter12;
enum Transport{
    CAR,TRUCK,AIRPLANE,TRAIN,BOAT;
}
public class EnumDemo2 {
    public static void Launch()
    {
        Transport tp;

        System.out.println("Const of Transport: ");

        Transport allTransports[] = Transport.values();

        for (Transport t : allTransports){
            System.out.println(t);
        }
        System.out.println();

        tp = Transport.valueOf("AIRPLANE");
        String str = tp.toString();
        System.out.println("tp contains: "+ tp);
        System.out.println(str);

    }
}
