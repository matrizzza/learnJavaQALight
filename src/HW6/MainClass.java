package HW6;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class MainClass {
    public static void main(String[] args) {
        /*
        ДЗ№6
“   Test_String ”
1.  Убрать пробелы в начале и в конце стринги
2.  С указанной стринги оставить только слово Test
3.  Сделать проверку – если первый Не пустой символ строки ‘t’ или ‘T’ то вывести сообщениее «Первый символ - «Т»» если нет – то ничего не делать.
4.  Найти первую букву ‘s’ и заменить ее на  ‘y’
Это тренировка по работе со стрингами, поэтому делать ее можно прямо в мейне. Каждый пункт - это отдельное новое действие с исходной стрингой.

5. Создать лист hwList со значениями 22 , 33, 44 , 55  и вывести в консоль
6. Создать новый лист hwListReverse и в него переписать значения с первого в обратном порядке (т.е. 55, 44, 33, 22) и вывести в консоль
Это все тоже можно делать прямо в main
         */
        String string = "   Test_String ";
        System.out.println(string.trim());
        System.out.println(string.substring(string.toLowerCase().indexOf('t'), string.indexOf('_')));

        if (string.trim().toLowerCase().startsWith("t")) {
            System.out.println("Первый символ - «Т»");
        }

        System.out.println(string.replaceFirst("s", "y"));


        List<String> hwList = new ArrayList<>();
        hwList.add("22");
        hwList.add("33");
        hwList.add("44");
        hwList.add("55");
        System.out.println(hwList);
        List<String> hwListReverse = new ArrayList<>();
        for (int i = hwList.size()-1; i >= 0; i--) {
            hwListReverse.add(hwList.get(i));
        }
        System.out.println(hwListReverse);
    }
}
