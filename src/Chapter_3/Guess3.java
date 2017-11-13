package Chapter_3;

public class Guess3 {
    public static void guess3()
     throws java.io.IOException{
        char ch, answer = 'S';
        System.out.println("Letter guessed from A-Z");
        System.out.println("Try to pick it: ");

        ch = (char) System.in.read();
        if (ch==answer) System.out.println("you god damn right");
        else{
            System.out.print("...Sorry, letter more ");
            if(ch<answer)
                System.out.println("more closely to end of alphabet");
            else System.out.println("more closely to begin of alphabet ");
        }





    }
}
