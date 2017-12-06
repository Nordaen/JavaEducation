package Chapter4;


import java.io.IOException;

public class HelpClassDemo {
    public  void HelpClassDemo_Launch() throws IOException {
        char choice, ignore;
        Help hlpobj = new Help();

        for (;;){
            do {
            hlpobj.showmenu();
            choice = (char) System.in.read();

            do {
                ignore = (char) System.in.read();
            } while (ignore !='\n');
            } while ( !hlpobj.isvalid(choice));

            if(choice =='q') break;
            System.out.println("\n");
            hlpobj.helpon(choice);
        }

    }

    class Help{
        void helpon(int what){
            switch (what){
                case '1':
                    System.out.println("IF operator:\n");
                    System.out.println("if(condition) operator");
                    System.out.println("else operator");
                    break;
                case '2':
                    System.out.println("Operator switch:\n");
                    System.out.println("switch(expression)");
                    System.out.println(" case constant:");
                    System.out.println(" operators sequence");
                    System.out.println(" break;");
                    System.out.println(" // ...");
                    System.out.println("}");
                    break;
                case '3':
                    System.out.println("FOR operator:\n");
                    System.out.print("for(initialization; condition; iteration");
                    System.out.println(" operator;");
                    break;
                case '4':
                    System.out.println("Operator while:\n");
                    System.out.println("while(condition) operator");
                    break;
                case '5':
                    System.out.println("do-while operator:\n");
                    System.out.println("do {");
                    System.out.println(" operator;");
                    System.out.println("} while (condition);");
                    break;
                case '6':
                    System.out.println("Break operator:\n");
                    System.out.println("break; or break mark");
                    break;
                case '7':
                    System.out.println("Continue operator:\n");
                    System.out.println("continue; or continue mark");
                    break;
            }
            System.out.println();
        }
        void showmenu(){
            System.out.println("Help: ");
            System.out.println(" 1. if");
            System.out.println(" 2. switch");
            System.out.println(" 3. for");
            System.out.println(" 4 while");
            System.out.println(" 5. do-while \n");
            System.out.print("Choose: (q - exit): ");
        }
            boolean isvalid(int ch){
            if(ch < '1' | ch > '7' & ch !='q') return false;
            else return true;
        }

    }



}

