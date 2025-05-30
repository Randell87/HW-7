//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Задача 1
        //Объявите три массива:
        //Целочисленный массив, заполненный тремя цифрами — 1, 2 и 3 — с помощью ключевого слова new
        //Массив, в котором можно хранить три дробных числа — 1.57, 7.654, 9.986. Массив сразу заполните значениями.
        //Произвольный массив. Тип и количество данных определите сами. Самостоятельно выберите способ создания массива: с помощью ключевого слова или сразу заполненный элементами.

        int[] array1 = new int[3];
        array1[0] = 1;
        array1[1] = 2;
        array1[2] = 3;

        double[] array2 = {1.57, 7.654, 9.986};
        String[] array3 = {"apple", "banana", "cherry", "date"};

        //Задача 2
        //Распечатайте на отдельной строчке элементы каждого массива по порядку через запятую. В конце строки запятую ставить не надо.

        for(int i = 0; i < array1.length; i++){
            if (i < array1.length-1) {
                System.out.print(array1[i] + ", ");
            } else {
                System.out.print(array1[i]);
            }
        }
        System.out.println();

        for(int i = 0; i < array2.length; i++){
            if (i < array2.length-1) {
                System.out.print(array2[i] + ", ");
            } else {
                System.out.print(array2[i]);
            }
        }
        System.out.println();

        for(int i = 0; i < array3.length; i++){
            if (i < array3.length-1) {
                System.out.print(array3[i] + ", ");
            } else {
                System.out.print(array3[i]);
            }
        }
        System.out.println();

        //Задача 3
        //Распечатайте на отдельной строчке элементы каждого массива в обратном порядке через запятую. В конце строки запятую ставить не надо.

        for(int i = array1.length - 1; i >= 0; i--){
            if (i > 0) {
                System.out.print(array1[i] + ", ");
            } else {
                System.out.print(array1[i]);
            }
        }
        System.out.println();

        for(int i = array2.length - 1; i >= 0; i--){
            if (i > 0) {
                System.out.print(array2[i] + ", ");
            } else {
                System.out.print(array2[i]);
            }
        }
        System.out.println();

        for(int i = array3.length - 1; i >= 0; i--){
            if (i > 0) {
                System.out.print(array3[i] + ", ");
            } else {
                System.out.print(array3[i]);
            }
        }
        System.out.println();

        //Задача 4
        //Пройдитесь по первому целочисленному массиву и все нечетные числа в нем сделайте четными (нужно прибавить 1).
        //Важно: код должен работать с любым целочисленным массивом, поэтому для решения задания используйте циклы.
        //Распечатайте результат преобразования в консоль.

        for(int i = 0; i < array1.length; i++){
            if (array1[i] % 2 != 0) {
                array1[i] = array1[i] + 1;
            }
        }
        for(int i = 0; i < array1.length; i++){
            if (i < array1.length-1) {
                System.out.print(array1[i] + ", ");
            } else {
                System.out.print(array1[i]);
            }
        }


    }
}