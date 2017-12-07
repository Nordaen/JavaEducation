package Chapter4;

public class Venicle3 {
    int passengers, fuelcap, mpg;

    int range() {
        return mpg * fuelcap;
    }

    Venicle3(int p, int f, int m) {
        passengers = p;
        fuelcap = f;
        mpg = m;
    }

    double fuelneeded(int miles) {
        return (double) miles / mpg;
    }
}


    class CompFuel {
        public void Venicle3L() {
            Venicle3 minivan = new Venicle3(7,16,21);
            Venicle3 sportscar = new Venicle3(2,14,12);

            double gallons;
            int dist = 252;
            gallons = minivan.fuelneeded(dist);
           System.out.println("Dlya preodolenia " + dist +
                   "  miles minivan needed" + gallons +
                   " fuel gallons");

           gallons = sportscar.fuelneeded(dist);

           System.out.println("To overcome " + dist +
                   " miles sportscar needed " + gallons +
                   " fuel gallons");



        }
    }

