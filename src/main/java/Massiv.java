 /** Разработано 25.08.2018
 * Массив случайных чисел
 * @author Stas
 * @version
 */

import Min.Min;


public class Massiv{    public static void main(String[] args) {


    Min New = new Min();
    New.mSluch();
//вводим дополнительные переменные
    int a=0;
    int b=-10;
    int c=11;

    for (int j=0; j<20; j++)
    {
        New.setI(j);
         int index= New.getIndex();
        //максимально отрицательный элемент массива
        if (index<a && index>b)
        {
            b=index;
        }
        //минимальный положительный элемент массива
        if (index > a && index < c) {
            c = index;
        }

    }
    System.out.println("максимально отрицательный элемент массива = " + b);
    System.out.println("минимальный положительный элемент массива = " + c);

    System.out.println("массив измененный:");
//Меняем местами найденные элементы массива и выводим полученный массив
    for (int l=0; l<20; l++) {
        New.setI(l);
        int index= New.getIndex();
        if (index == c) {
            index = b;
        } else if (index == b) {
            index=c;
        }

        System.out.println(l + " элемент массива = "+index);
    }
}

}

