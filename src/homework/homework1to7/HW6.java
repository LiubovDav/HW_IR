package homework.homework1to7;

import static utils.Utils.*;

public class HW6 {

    // Распечатать последовательность чисел от 0 до 9 включительно.

    public static void printSequence(int a) {
        for (int i = 0; i < a + 1; i++) {
            System.out.println(i);
        }
    }

    // Распечатать последовательность чисел от 10 исключительно до 0 включительно.

    public static void printSequenceTenToZero() {
        for (int i = 9; i >= 0; i--) {
            System.out.println(i);
        }
    }

    // Распечатать последовательность чисел от 50 до 55 включительно с шагом 2.

    public static void printSequenceFiftyToFive(int a) {
        for (int i = 50; i <= 55; i += 2) {
            System.out.println(i);
        }
    }

    // Распечатать последовательность чисел, кратных 7, в промежутке (327, 300)

    public static void printSequenceThreeHundred() {
        for (int i = 326; i >= 300; i--) {
            if (i % 7 == 0) {
                System.out.println(i);
            }
        }
    }

    // Распечатать последовательность чисел в промежутке [12, 13] с шагом 0.1

    public static void printSequenceTwelve() {
        for (float i = 12; i < 13; i += 0.1) {
            System.out.println(Math.round(i * 10) / 10.0);
        }
    }

    // Распечатать последовательность четных чисел от 215 до 237 включительно

    public static void printSequenceTwoHundred() {
        for (int i = 215; i <= 237; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    // Распечатать последовательность чисел, кратных 7, в промежутке от 7 исключительно до 14 исключительно.

    public static void printSequenceSeven() {
        for (int i = 8; i < 14; i++) {
            if (i % 7 == 0) {
                System.out.println(i);
            }
        }
    }

    // Распечатать последовательность, которая начинается с минимального значения типа данных short
    // и заканчивается максимальным значением short. Числа в последовательности должны быть кратны 15001.

    public static void printSequenceShort() {
        for (short i = Short.MIN_VALUE; i < Short.MAX_VALUE; i++) {
            if (i % 15001 == 0) {
                System.out.println(i);
            }
        }
    }

    // Распечатать последовательность чисел в промежутке от -10 до 34 включительно.
    // Числа, кратные 11, должны быть распечатаны синим цветом. Числа, кратные 12,
    // должны быть распечатаны красным цветом. А ноль необходимо распечатать словом ZERO.

    public static void printSequenceTen() {
        for (int i = -10; i <= 34; i++) {
            if (i == 0) {
                System.out.println("\u001B[32m" + "ZERO");
            } else if (i % 11 == 0) {
                System.out.println("\u001B[34m" + i + "\u001B[0m");
            } else if (i % 12 == 0) {
                System.out.println("\u001B[31m" + i + "\u001B[0m");
            }
        }
    }

    // Написать метод, который принимает на вход параметры start, end, step, и печатает последовательность
    // десятичных чисел, начиная с числа start, с шагом step. Точка выхода из цикла - число end.

    public static void printStartEndStep(double start, int end, int step) {
        for (double i = start; i < end; i += step) {
            System.out.println(i);
        }
    }

    // Написать метод, который принимает параметр l и печатает последовательность четных чисел от нуля.
    // Длина последовательности = l.

    public static void printSequenceL(int l) {
        int i = 0; // числа которые ты проверяешь на кратность 2
        int count = 0; // сколько раз напечатали

        while (count < l) { // когда count станет равным l выполнение while прекратится
            if (i % 2 == 0) {
                System.out.println(i);
                count += 1;
            }
            i += 1;
        }
    }

    // Напишите метод, который принимает целое число n, и выводит все степени числа 2 от 1 до n включительно

    public static void printSequenceRoot(int a) {
        double b = 2;
        for (double i = 1; i <= a; i++) {
            System.out.println(Math.pow(b, i));
        }
    }

    // Вывести последовательность 012345678900011223344556677889900…  до числа 9999 включительно.

    public static void printSequenceRooForthTime() {
        for (int i = 0; i <= 4; i++) {
            for (int j = 0; j <= 9; j++) {
                for (int k = 0; k < i; k++) {
                    System.out.print(j);
                }
            }
        }
        System.out.println();
    }

    // Написать метод, который принимает параметры l, n, и печатает последовательность чисел,
    // начиная с числа n, по формуле для n + 1 члена последовательности: n + 1 = 2n
    // Длина последовательности l.

    public static void printSequenceFormulaN(int l, int n) {
        int count = 0;
        while (count < l) {
            if ((n + 1) % 2 == 0) {
                System.out.println(n);
                count += 1;
            }
            n += 1;
        }
    }

    // Сгенерируйте последовательность целых положительных двузначных чисел,
    // в которых разница между первой цифрой (десятки) и второй цифрой (единицы) не превышает 3.

   // public static void printSequenceAllowedTwoDigitNumbers() {
   //     for (int i = 10; i < ...; i++) {
   //     }
   // }








    public static void main(String[] args) {

        printTaskNumber(1);
        printSequence(9);

        printTaskNumber(2);
        printSequenceTenToZero();

        printTaskNumber(3);
        printSequenceFiftyToFive(50);

        printTaskNumber(4);
        printSequenceThreeHundred();

        printTaskNumber(5);
        printSequenceTwelve();

        printTaskNumber(6);
        printSequenceTwoHundred();

        printTaskNumber(7);
        printSequenceSeven();

        printTaskNumber(8);
        printSequenceShort();

        printTaskNumber(9);
        printSequenceTen();

        printTaskNumber(10);
        printStartEndStep(24.54, 435, 12);

        printTaskNumber(11);
        printSequenceL(10);

        printTaskNumber(12);
        printSequenceRoot(10);

        printTaskNumber(13);
        printSequenceRooForthTime();

        printTaskNumber(14);
        printSequenceFormulaN(5, 35);




    }



}
