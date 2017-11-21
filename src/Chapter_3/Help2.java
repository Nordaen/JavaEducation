package Chapter_3;

import java.io.IOException;

public class Help2 {
    public static void help2() throws IOException {
        char choice, ignore;
        do{
            System.out.println("Help: ");
            System.out.println(" 1. if");
            System.out.println(" 2. switch");
            System.out.println(" 3. for");
            System.out.println(" 4 while");
            System.out.println(" 5. do-while \n");
            System.out.print("Choose: ");

            choice = (char) System.in.read();
            do {
                ignore = (char) System.in.read();
            } while (ignore !='\n');
        } while (choice < '1' | choice >'5');
    System.out.println("\n");
    switch(choice){
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

    }
    }

}
