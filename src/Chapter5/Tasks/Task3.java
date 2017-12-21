package Chapter5.Tasks;

public class Task3 {
    public  void Launch()
    {
    Average aver = new Average();
    double value = aver.CancAverage();
    }
  class Average{
        double CancAverage(){

            double[] mas =  {5,2,3,7,6,8,5,3,2,6};
            double cache=0;
            for(double d : mas)
            {

            cache+=mas[(int)d];

            }
            return cache/10;
        }

    }
}
