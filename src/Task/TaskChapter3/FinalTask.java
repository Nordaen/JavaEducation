package Task.TaskChapter3;

import java.util.*;

public class FinalTask {
    public static void FinalTask()
    {
        int index = 0, beginIndex=0, endIndex;
        float var1, var2, result;
        char character;

        Scanner sc = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<String>();
        ArrayList<Float> arrayOfResults = new ArrayList<Float>();
        ArrayList<Float> numbers = new ArrayList<Float>();

        StringBuilder str = new StringBuilder();

        System.out.println("Enter an example");

        String expression = sc.next();


        char[] m = expression.toCharArray();
        for(char x :m)
        {
            if(Character.isUpperCase(x)||Character.isLowerCase(x)){
                System.out.println("Error. EXTERMINATE");
                Runtime.getRuntime().exit(0);
            }
            if (!PUNCT_SET.contains(Character.valueOf(x)))
            {
                System.out.println("Error. EXTERMINATE");
                Runtime.getRuntime().exit(0);
            }
        }
        if (IfThereBracket(m)) {
            //вводим в анализирующий массив данные
            beginIndex = ReturnBeginIndex(m); //получаем индексы начала
            beginIndex += 1; //увеличиваем чтобы не считало скобку
            endIndex = CharacterPosition(m); //получаем индексы первого знака

            character = CharacterAnalyser(m); //получаем знак

            for (char ch : m)
                list.add(Character.toString(ch)); //закидываем в лист значения
            endIndex--;
            for (; beginIndex != endIndex; ++beginIndex) {
                str.append(m[beginIndex]); //записываем в билдер значения до знака
            }

            numbers.add(Float.parseFloat(str.toString())); //распознаем как число и вводим в лист чисел
            beginIndex = CharacterPosition(m);

            endIndex = ReturnEndIndex(m); // та же операция с другим числом
            str.delete(0, 3000); //очищаем билдер

            for (; beginIndex != endIndex; beginIndex++) {
                str.append(m[beginIndex]); // записываем второе значение
            }
            numbers.add(Float.parseFloat(str.toString())); //записываем в лист


            var1 = Float.parseFloat(String.valueOf(numbers.get(0))); //получаем из листа первое число
            var2 = Float.parseFloat(String.valueOf(numbers.get(1))); //получаем из листа второе число


            switch (character) {            //в зависимости от знака применяем действие
                case '+': {
                    arrayOfResults.add(Adding(var1, var2));
                }
                break;

                case '-': {
                    arrayOfResults.add(Decrementation(var1, var2));
                    break;
                }
                case '*': {
                    arrayOfResults.add(Multiplication(var1, var2));
                    break;
                }
                case '/': {
                    if (var2 != 0)
                        arrayOfResults.add(Division(var1, var2));
                    else
                        System.out.println("Error. Cannot divide by zero.");
                    break;
                }

            }
            str.delete(0, 1000); //очищаем билдер
            for (char ch : m) {
                str.append(ch);
            }
/////////////////////part two////////////////////////////////////////////////////////////
            beginIndex = ReturnBeginIndex(m); //работаем после скобок
            endIndex = ReturnEndIndex(m);
            str.delete(beginIndex, endIndex + 1);
            char[] k = new char[100];
            str.getChars(0, str.length(), k, 0);
            character = NoBracketCharacterAnalyser(k);
            str.deleteCharAt(0);

            var1 = arrayOfResults.get(0);
            numbers.add(Float.parseFloat(str.toString()));
            var2 = numbers.get(2);
            switch (character) {
                case '+': {
                    arrayOfResults.add(Adding(var1, var2));
                }
                break;

                case '-': {
                    arrayOfResults.add(Decrementation(var1, var2));
                    break;
                }
                case '*': {
                    arrayOfResults.add(Multiplication(var1, var2));
                    break;
                }
                case '/': {
                    if (var2 != 0)
                        arrayOfResults.add(Division(var1, var2));
                    else
                        System.out.println("Error. Cannot divide by zero.");
                    break;
                }

            }
            System.out.println("Result is: " + arrayOfResults.get(1));
            System.out.println();
        } else{ //Если нет скобок
            str.delete(0, 1000);
            character = NoBracketCharacterAnalyser(m);
            endIndex = NoBracketsCharacterPosition(m);
            beginIndex = 0;
            endIndex--;
            for (; beginIndex != endIndex; beginIndex++) {
                str.append(m[beginIndex]);
            }
            numbers.add(Float.parseFloat(str.toString()));

            str.delete(0, 1000);
            beginIndex = endIndex+1;
            endIndex= m.length;
            for (; beginIndex != endIndex; beginIndex++) {
                str.append(m[beginIndex]);
            }
            numbers.add(Float.parseFloat(str.toString()));
            var1 = Float.parseFloat(String.valueOf(numbers.get(0))); //получаем из листа первое число
            var2 = Float.parseFloat(String.valueOf(numbers.get(1))); //получаем из листа второе число
            switch (character) {
                case '+': {
                    arrayOfResults.add(Adding(var1, var2));
                }
                break;

                case '-': {
                    arrayOfResults.add(Decrementation(var1, var2));
                    break;
                }
                case '*': {
                    arrayOfResults.add(Multiplication(var1, var2));
                    break;
                }
                case '/': {
                    if (var2 != 0)
                        arrayOfResults.add(Division(var1, var2));
                    else
                        System.out.println("Error. Cannot divide by zero.");
                    break;
                }

            }
            System.out.println("Result is: " + arrayOfResults.get(0));
        }

        System.out.println();
    }

    public static float Adding(float a, float b) {
        return a + b;
    }

    public static float Decrementation(float a, float b) {
        return a - b;
    }

    public static float Multiplication(float a, float b) {
        return a * b;
    }

    public static float Division(float a, float b) {
        return a / b;
    }

    public static char NoBracketCharacterAnalyser(char[] m) {

        for (char ch : m) {


            switch (ch) {
                case '+': {
                    return '+';
                }
                case '-': {
                    return '-';

                }
                case '*': {
                    return '*';

                }
                case '/': {
                    return '/';
                }
            }
        }
        return '+';
    }
    public static char CharacterAnalyser(char[] m) {
        int cache = 0, beginIndex = 0, endIndex = 0;
        beginIndex = ReturnBeginIndex(m);
        endIndex = ReturnEndIndex(m);
        for (char ch : m) {
            ++cache;
            if (cache > beginIndex && cache < endIndex) {
                switch (ch) {
                    case '+': {
                        return '+';
                    }
                    case '-': {
                        return '-';

                    }
                    case '*': {
                        return '*';

                    }
                    case '/': {
                        return '/';
                    }
                }
            }

        }
        return '+';
    }

    public static boolean IfThereBracket(char[] m) {
        for (char ch : m) {
            if (ch == '(')
                return true;
        }
        return false;
    }

    public static int CharacterPosition(char[] m) {
        char character = '+';
        int cache = 0, beginIndex = 0, endIndex = 0;
        beginIndex = ReturnBeginIndex(m);
        endIndex = ReturnEndIndex(m);
        for (char ch : m) {
            ++cache;
            if (cache > beginIndex && cache < endIndex) {
                switch (ch) {
                    case '+': {
                        return cache;
                    }
                    case '-': {
                        return cache;

                    }
                    case '*': {
                        return cache;

                    }
                    case '/': {
                        return cache;
                    }
                }
            }

        }
        return '+';
    }
    public static int NoBracketsCharacterPosition(char[] m) {
        char character = '+';
        int cache = 0, beginIndex = 0, endIndex = 0;
        beginIndex = ReturnBeginIndex(m);
        endIndex = ReturnEndIndex(m);
        for (char ch : m) {
            ++cache;

            switch (ch) {
                case '+': {
                    return cache;
                }
                case '-': {
                    return cache;

                }
                case '*': {
                    return cache;

                }
                case '/': {
                    return cache;
                }
            }
        }


        return '+';
    }


    public static int ReturnBeginIndex(char[] m) {
        int cache = 0;
        for (char ch : m) {

            if (ch == '(')
                return cache;
            cache++;
        }
        return 0;
    }

    public static int ReturnEndIndex(char[] m) {
        int cache = 0;
        for (char ch : m) {
            if (ch == ')')
                return cache;
            cache++;
        }
        return 0;
    }

    private static final Set<Character> PUNCT_SET = new HashSet<>(Arrays.asList(
            '!', '"', '#', '$', '%', '&',
            '.', ':', ';', '<', '=', '>', '?', '@', '[', '\\', ']', '^',
            '_', '`', '{', '|', '}', '~'
    ));

}

