package Min;

import java.util.Random;

public class Min {
    //определяем кол-во элементов в массиве, диапазон от -10 до 10
    private int[] _3_ = new int[21];
    private int i;


    public void mSluch() {

        //Заполняем массив случайных чисел в диапазоне -10 до 10 и выводим на экран
        Random random = new Random();
        for (i = 0; i < 21; i++) {
            _3_[i] = random.nextInt(21) - 10;
            System.out.println(i + " индекс = "+_3_[i]);
        }
    }

    public void setI(int i) {this.i = i;}

    public int getIndex(){ return _3_[i];}

    public int[] get_3_() { return _3_;}
}

