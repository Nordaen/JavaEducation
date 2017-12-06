package Chapter4;

public class Venicle3 {
    int passengers,fuelcap,mpg;
    int range()
    {
       return mpg * fuelcap;
    }
double fuelneeded(int miles) {
        return (double) miles/mpg;
}
    class CompFuel {
        public void Venicle3L() {
            Venicle3 minivan = new Venicle3();
            Venicle3 sportscar = new Venicle3();

            double gallons;
            int dist = 252;

            int range1, range2;

            minivan.passengers = 7;
            minivan.fuelcap = 16;
            minivan.mpg = 21;

            sportscar.passengers = 2;
            sportscar.fuelcap = 14;
            minivan.mpg = 12;

            gallons = minivan.fuelneeded(dist);

         System.out.println("To overcome " + dist + " miles minivan needs "+
         gallons + " gallons fuel");

         gallons = sportscar.fuelneeded(dist);

         System.out.println("To overcome " + dist+ " miles sportscar needed "+
         gallons + " gallons fuel.");


        }
    }

}
