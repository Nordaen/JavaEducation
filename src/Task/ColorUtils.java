package Task;

import java.awt.*;
import java.util.HashMap;

public class ColorUtils {
    public static String toHex(int r, int g, int b)
    {
        //хекс есть форматирование самого RGB в виде #RRGGBB, так что достаточно форматировать строку
        String hex = String.format("#%02x%02x%02x", r, g, b); //два числа в шеснадцетиричной системе счисления
        return  hex; //и вернуть её
    }
    public static HashMap<String, Integer> toRGB(String hex)
    { // взял за задачу вернуть несколько значений испольуя хеш-мап
      Color c = Color.decode(hex); //используя встроенный функционал получаем декодированныз из хеша цвет
        HashMap<String, Integer> tmpHashMap = new HashMap<String, Integer>(); //создаем хэш-мап и вносим в него значения
        tmpHashMap.put("value1", c.getRed());
        tmpHashMap.put("value2", c.getGreen());
        tmpHashMap.put("value3", c.getBlue());
     return tmpHashMap; //возвращаем хеш-мап
    }
}
