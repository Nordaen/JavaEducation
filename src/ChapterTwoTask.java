import Task.ColorUtils;
import Task.MathInt;

import java.util.HashMap;

public class ChapterTwoTask {
    public static void launch ()
    {
        //Задача 1
        int a =  MathInt.rem(10,6);
        System.out.println(a);
        double b =  MathInt.div(10,6);
        System.out.println(b);
        //Задача 2
        // получение RGB
        String hex = "#4286f4"; // берем строку
        HashMap<String,Integer> values = ColorUtils.toRGB(hex); //получаем хэш-мап
        // получаем из хеш-мапа значения
        int red = values.get("value1");
        int green = values.get("value2");
        int blue = values.get("value3");
        //выводим для наглядности
        System.out.println("RGB is: " + red + " " + green + " " + blue);
        // в хекс
        String hex2 = ColorUtils.toHex(66,134,244);
        //выводим для наглядности
        System.out.println(hex2);
    }
}
