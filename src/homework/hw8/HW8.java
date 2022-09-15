package homework.hw8;

public class HW8 {

//    Создать объекты типа Integer, Double, String и присвоить им такие же значения,
//        как и переменным класса HW8_1

    Integer integerVar = 4;
    Double doubleVar = 3.4d;
    String stringVar = "Homework";

//Написать метод, который принимает на вход целое положительные число в пределах от 1 до 10 исключительно,
// и возвращает таблицу умножения на это число в виде массива
//Например, метод(2) -> {0, 2, 4, 6, 8, 10, 12, 14, 16, 18, 20}

    public static int[] returnMultiplication(int a) {
        int[] array = new int[11];
        for (int i = 0; i < 11; i++) {
            array[i] = i * a;
        }
        return array;
    }



}
