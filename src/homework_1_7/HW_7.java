package homework_1_7;

import java.util.Random;

public class HW_7 extends CommonHW {


    // Написать метод, который принимает на вход массив int,
    // и возвращает среднее значение. Проверить работу метода тестом, если параметр - массив catsAges

    public static void returnArray(int[] array) {

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        int average = sum / array.length;
        System.out.println("среднee " + average);
    }

    // Создать метод, который принимает на вход массив int,  и возвращает минимальное значение,
    // максимальное значение и среднее значение всех чисел массива.
    // Проверить работу метода на массиве из задания 20.

    public static int[] returnMinMaxAverage(int[] array) {

        int minValue = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < minValue) {
                minValue = array[i];
            }
        }
        System.out.println("Min value = " + minValue);

        int maxValue = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxValue) {
                maxValue = array[i];
            }
        }
        System.out.println("Max value = " + maxValue);

        int summ = 0;
        for (int i = 0; i < array.length; i++) {
            summ = summ + array[i];
        }

        int average = summ / array.length;
        System.out.println("Average = " + average);

        return new int[] {minValue, maxValue, average};
    }

    public static void main(String[] args) {

        // Создать массив catsNames, заполнить его любыми значениями (см картинку котов из презентации).

        printTaskNumber(1);
        String[] catsNames = new String[] {"Ivan", "Black", "Pusik", "Rizhik", "Grey", "Rizhik", "Big"};


        // В массиве catsNames изменить значение элемента с индексом 4 на “Рыжик”,
        // а значение элемента с индексом 1 на “Черныш”.

        printTaskNumber(2);

        catsNames[1] = "Черныш";
        catsNames[4] = "Рыжик";

        for (int i = 0; i < catsNames.length; i++) {
            System.out.println(catsNames[i]);
        }

        printTaskNumber(3);

        // Создать массив catsColors и заполнить его значениями.

        String[] catsColors = new String[] {"grey", "black", "grey", "red", "braun", "red", "blue"};
        for (int i = 0; i < catsColors.length; i++) {
            System.out.println(catsColors[i]);
        }


        printTaskNumber(4);

        // Создать массив catsAges и заполнить его любыми значениями.

        int[] catsAges = new int[] {2, 9, 1 ,7, 5, 3, 5};

        printTaskNumber(5);

        // Создать массив isCatRed и заполнить его соответствующими значениями

        boolean[] isCatRed = new boolean[catsColors.length];
        for (int i = 0; i < catsColors.length; i++) {
//            if (catsColors[i].equals("red")) {
//                isCatRed[i] = true;
//            } else {
//                isCatRed[i] = false;
//            }
            //  the commented lines above can be replaced by a single line:
            isCatRed[i] = catsColors[i].equals("red");
        }

        printTaskNumber(6);

        // Распечатать для массивов catsNames и catsColors:
        //имя кота в коробке с номером 6
        //имена котов из коробок с четными индексами
        //имена котов из коробок, чьи индексы кратны 4
        //цвет котов из коробок с нечетными индексами
        //цвет котов из коробок, чьи индексы кратны 3


        System.out.println(catsNames[5]);
        System.out.println("______________");

        for (int i = 0; i < catsNames.length; i++) {
            if (i % 2 == 0) {
                System.out.println(catsNames[i]);
            }
        }
        System.out.println("______________");

        for (int i = 0; i < catsNames.length; i++) {
            if (i % 4 == 0) {
                System.out.println(catsNames[i]);
            }
        }
        System.out.println("______________");

        for (int i = 0; i < catsColors.length; i++) {
            if (i % 2 != 0) {
                System.out.println(catsColors[i]);
            }
        }
        System.out.println("______________");

        for (int i = 0; i < catsColors.length; i++) {
            if (i % 3 == 0) {
                System.out.println(catsColors[i]);
            }
        }

        printTaskNumber(7);
        //Распечатать “Накорми кота!” для всех серых котов

        for (int i = 0; i < catsColors.length; i++) {
            if (catsColors[i].equals("grey")) {
                System.out.println("Накорми кота!");
            }
        }

        printTaskNumber(8);

        //Распечатать “Отнеси кота на прививку!”, если возраст кота меньше 2 лет
        for (int i = 0; i < catsAges.length; i++) {
            if (catsAges[i] < 2) {
                System.out.println("Отнеси кота на прививку!");
            }
        }

        printTaskNumber(9);

        // Для кота в последней коробке распечатать имя, цвет, возраст

        int num = catsNames.length - 1;
        System.out.println(catsNames[num]);
        System.out.println(catsColors[num]);
        System.out.println(catsAges[num]);

        printTaskNumber(10);

        // Распечатать имена всех котов, чей возраст больше 2 лет

        for (int i = 0; i < catsAges.length; i++) {
            if (catsAges[i] > 2) {
                System.out.println(catsNames[i]);
            }
        }

        printTaskNumber(11);

        // Распечатать “Накорми кота!” если имя кота “Рыжик” и значение isCatRed == true

        for (int i = 0; i < catsNames.length; i++) {
            if (catsNames[i].equals("Рыжик")) {
                System.out.println(catsNames[i]);
            }
        }

        printTaskNumber(12);
        // Распечатать средний возраст котов из массива catsAges

        double sum = 0;
        for (int i = 0; i < catsAges.length; i++) {
            sum = sum + catsAges[i];
        }
        double averageAge = sum / catsAges.length;
        System.out.println("средний возраст котов " + averageAge);

        printTaskNumber(13);

        // Распечатать "возраст самого молодого кота".
        {
            int minAge = Integer.MAX_VALUE;
            for (int i = 0; i < catsAges.length; i++) {
                if (catsAges[i] < minAge) {
                    minAge = catsAges[i];
                }
            }
            System.out.println("возраст самого молодого кота " + minAge);
        }

        printTaskNumber(14);

        // Распечатать возраст самого старого кота
        {
            int maxAge = 0;
            for (int i = 0; i < catsAges.length; i++) {
                if (catsAges[i] > maxAge) {
                    maxAge = catsAges[i];
                }
            }
            System.out.println("возраст самого старого кота " + maxAge);
        }

        printTaskNumber(15);
        // Распечатать количество серых котов

        int countGrey = 0;
        for (int i = 0; i < catsColors.length; i++) {
            if (catsColors[i].equals("grey")) {
                countGrey = countGrey + 1;
            }
        }
        System.out.println("количество серых котов " + countGrey);

        printTaskNumber(16);
        // Распечатать имя кота, если кот находится в коробке с четным индексом и его возраст не больше 3 лет


        for (int i = 0; i < catsNames.length; i++) {
            if ((i + 1) % 2 == 0 && catsAges[i] <= 3) {
                System.out.println(catsNames[i]);
            }
        }

        printTaskNumber(17);
        // Создать массив четных положительных чисел, значения которых не больше 10.
        // (заполняем значения с помощью цикла for)

        int maxNum = 10;
        int[] arrayEven = new int[maxNum / 2 + 1];
        for (int i = 0; i < arrayEven.length; i++) {
            arrayEven[i] = i * 2;
            System.out.println(i * 2);
        }

        printTaskNumber(18);

        // Написать метод, который принимает на вход массив int, и возвращает среднее значение.
        // Проверить работу метода тестом, если параметр - массив catsAges

        returnArray(catsAges);


        printTaskNumber(19);

        // Создать массив нечетных отрицательных чисел в промежутке от -1000 до -900

        int[] arrayMinus = new int[50];
        int count = 0;
        for (int i = -1000; i <= -900; i++) {
            if (i % 2 != 0) {
                arrayMinus[count] = i;
                count = count + 1;
            }
        }

        for (int i = 0; i < arrayMinus.length; i++) {
            System.out.println(arrayMinus[i]);
        }

        printTaskNumber(20);

        // Создать массив из 10 случайных положительных целых чисел

        int[] arrayPlus = new int[10];
        Random random = new Random();
        for (int i = 0; i < arrayPlus.length; i++) {
            arrayPlus[i] = Math.abs(random.nextInt());
        }

        for (int i = 0; i < arrayPlus.length; i++) {
            System.out.println(arrayPlus[i]);
        }

        printTaskNumber(21);

        // Создать метод, который принимает на вход массив int,  и возвращает минимальное значение,
        // максимальное значение и среднее значение всех чисел массива.
        // Проверить работу метода на массиве из задания 20.

        int[] minMaxAverageArray = returnMinMaxAverage(arrayPlus);
        System.out.println("-----------------------");
        System.out.println("Min value = " + minMaxAverageArray[0]);
        System.out.println("Max value = " + minMaxAverageArray[1]);
        System.out.println("Avarage = " + minMaxAverageArray[2]);

        printTaskNumber(22);

        // Создать массив четных чисел и массив нечетных чисел из элементов массива из задания 20.

        int evenLength = 0;
        for (int i = 0; i < arrayPlus.length; i++) {
            if (arrayPlus[i] % 2 == 0) {
                evenLength++;
            }
        }

        int[] evenArray = new int[evenLength];
        int[] oddArray = new int[arrayPlus.length - evenLength];

        int evenCount = 0;
        int oddCount = 0;
        for (int i = 0; i < arrayPlus.length; i++) {
            if (arrayPlus[i] % 2 == 0) {
                evenArray[evenCount] = arrayPlus[i];
                evenCount++;
            } else {
                oddArray[oddCount] = arrayPlus[i];
                oddCount++;
            }
        }

        System.out.println("Even array:");
        for (int i = 0; i < evenArray.length; i++) {
            System.out.println(evenArray[i]);
        }

        System.out.println("--------------------");

        System.out.println("Odd array:");
        for (int i = 0; i < oddArray.length; i++) {
            System.out.println(oddArray[i]);
        }



























    }
}
