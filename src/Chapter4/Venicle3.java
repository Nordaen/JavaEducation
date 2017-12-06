package Chapter4;

public class Venicle3 {
    int passengers,fuelcap,mpg;
    void range()
    {
        System.out.println(" Range - " + fuelcap * mpg + " miles.");
    }

    class AddMeth {
        public void Venicle3L() {
            Venicle3 minivan = new Venicle3();
            Venicle3 sportscar = new Venicle3();

            int range1, range2;

            minivan.passengers = 7;
            minivan.fuelcap = 16;
            minivan.mpg = 21;

            sportscar.passengers = 2;
            sportscar.fuelcap = 14;
            minivan.mpg = 12;

            System.out.print("minivan can transport + " + minivan.passengers
             + "passengers.");
            minivan.range();
            System.out.print("Sportcar can transport" + sportscar.passengers
            + " passengers.");
            sportscar.range();

        }
    }

}
