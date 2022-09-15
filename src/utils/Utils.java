package utils;

public class Utils {

    public static void printTaskNumber(int a) {
        System.out.println("\n\u001B[34m" + "#".repeat(20) + "\u001B[0m");
        System.out.println(" ".repeat(6) + "Task #" + a);
        System.out.println("\u001B[34m" + "#".repeat(20) + "\u001B[0m");
    }


//    Написать метод, который принимает на вход 5 целых чисел, и возвращает массив из этих же чисел

    public static int[] convertToArray(int a1, int a2, int a3, int a4, int a5) {
        return new int[] {a1, a2, a3, a4, a5};
    }


//    Написать метод, который принимает на вход 5 чисел типа double, и возвращает массив из этих же чисел

    public static double[] convertToArrayDouble(double a1, double a2, double a3, double a4, double a5) {
        return new double[] {a1, a2, a3, a4, a5};
    }


//    Написать метод, который принимает на вход 5 слов, и возвращает массив из этих слов

    public static String[] convertToArrayString(String a1, String a2, String a3, String a4, String a5) {
        return new String[] {a1, a2, a3, a4, a5};
    }

// Написать метод, который принимает на вход массив целых чисел,
// и возвращает массив тех же чисел, умноженных на 2.5

    public static double[] convertToArrayMulti(int a1, int a2, int a3, int a4, int a5) {
        return new double[]{a1 * 2.5, a2 * 2.5, a3 * 2.5, a4 * 2.5, a5 * 2.5};
    }

//    Написать метод, который принимает на вход массив целых положительных чисел,
//    и возвращает количество четных чисел в этом массиве

    public static int countEvenNumbers (int[] array) {
        int count = 0;
        for (int c = 0; c < array.length; c++) {
            if (array[c] % 2 == 0)
                count++;
        }
        return count;
    }

//    Написать метод, который принимает на вход массив целых положительных чисел,
//    и возвращает массив нечетных чисел

    public static int countOddNumbers (int[] array) {
        return array.length - countEvenNumbers(array);
    }

//    Написать метод, который принимает на вход массив целых чисел,
//    и возвращает массив значений true или false, если числа больше 10

    public static boolean[] returnArrayBoolean (int[] array) {
        if (array == null) {
            return null;
        }

        boolean[] arrayBoolean = new boolean[array.length];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 10) {
                arrayBoolean[i] = true;
            } else {
                arrayBoolean[i] = false;
            }
        }
        return arrayBoolean;
    }

    public static void voidMethod(boolean flag) {
        System.out.println("Void method");
        if (flag) {
            return;
        }
        System.out.println("Hello Flag!");
    }

//    Написать метод, который принимает на вход массив слов,
//    и возвращает строку, состоящую из этих слов

    public static String returnStringWorld (String[] words) {

        String stringWords = "";
        for (int i = 0; i < words.length; i++) {
            stringWords = stringWords + words[i] + " ";
        }
        return stringWords;
    }

//    Написать метод, который принимает массив целых чисел
//    и считает сумму чисел во второй половине массива

    public static int countSumSecondPartArray (int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (i >= array.length / 2) {
                sum = sum + array[i];
            }
        }
        return sum;
    }






}
