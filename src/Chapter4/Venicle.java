package Chapter4;

public class Venicle {
    int passengers,fuelcap,mpg;



    class VenicleDemo {
        public void VenicleL() {
            Venicle minivan = new Venicle();
            Venicle sportscar = new Venicle();

            int range1, range2;

            minivan.passengers = 7;
            minivan.fuelcap = 16;
            minivan.mpg = 21;

            sportscar.passengers = 2;
            sportscar.fuelcap = 14;
            minivan.mpg = 12;


            range1 = minivan.fuelcap * minivan.mpg;
            range2 = sportscar.fuelcap * sportscar.mpg;
            System.out.println("Minivan can transport" + minivan.passengers + " passengers on distance: " + range1 + " miles");
            System.out.println("Sportscar can transport " + sportscar.passengers + " passengers on distance: " + range2 + " miles");

        }
    }
}
