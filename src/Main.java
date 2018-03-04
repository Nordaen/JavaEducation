import Chapter12.EnumDemo2;

import java.io.IOException;

public class Main {
    interface MyValue {
        double getValue();
    }
    public static void main(String[] args) throws IOException {
	// write your code here

       MyValue myVal;

       myVal= ()-> 98.6;
       System.out.println("Value: " + myVal.getValue());

        }
    }

