package homework.homework1to7;

import static utils.Utils.*;

public class HW5 {


    public static void printUnderTaskNumber(int a){
        System.out.println("\u001B[32m" + a +")" + "\u001B[0m");
    }

    // ВСЕ!!! результаты должны быть протестированы, для этого необходимо создать
    // метод с названием verifyEquals(expectedResult, actualResult)

    public static void verifyEquals(String expectedResult, String actualResult) {
        if (!expectedResult.equals(actualResult)) {
            System.out.println("\u001B[31m" + "expectedResult = " + expectedResult + " doesn't match actualResult = "
                    + actualResult + "\u001B[0m");
        } else {
            System.out.println("\u001B[32m" + "Pass" + "\u001B[0m");
        }
    }

    public static void verifyEquals(int expectedResult, int actualResult) {
        if (expectedResult != actualResult) {
            System.out.println("\u001B[31m" + "expectedResult = " + expectedResult + " doesn't match actualResult = "
                    + actualResult + "\u001B[0m");
        } else {
            System.out.println("\u001B[32m" + "Pass" + "\u001B[0m");
        }
    }

    public static void verifyEquals(float expectedResult, float actualResult) {
        if (expectedResult != actualResult) {
            System.out.println("\u001B[31m" + "expectedResult = " + expectedResult + " doesn't match actualResult = "
                    + actualResult + "\u001B[0m");
        } else {
            System.out.println("\u001B[32m" + "Pass" + "\u001B[0m");
        }
    }

    public static void verifyEquals(double expectedResult, double actualResult) {
        if (expectedResult != actualResult) {
            System.out.println("\u001B[31m" + "expectedResult = " + expectedResult + " doesn't match actualResult = "
                    + actualResult + "\u001B[0m");
        } else {
            System.out.println("\u001B[32m" + "Pass" + "\u001B[0m");
        }
    }

    // Написать метод, который принимает на вход число от 1 до 7  и возвращает день недели.

    public static String returnDayWeek(int a) {
        String[] daysOfWeek = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        return daysOfWeek[a - 1];
    }

    public static int determineLargest(int x, int y, int z) {
        int largest = x;
        if (y > largest) {
            largest = y;
        }
        if (z > largest) {
            largest = z;
        }
        return largest;
    }

    public static int nestedSmallest(int a, int b, int c) {
        int smallest = a;
        if (b < smallest) {
            smallest = b;
        }
        if (c < smallest) {
            smallest = c;
        }
        return smallest;
    }

    // Написать алгоритм вычисления среднего значения из 5 показателей температуры тела кота.

    public static float averageFiveTemperatureCat(float a, float b, float c, float d, float e) {
       return Math.round(100 * (a + b + c + d + e) / 5f) / 100f;
    }


    // Написать метод, который принимает на вход десятичное число (например, 10.75),
    // и возвращает строку “10 руб 75 коп”.

    public static String returnStringRub(double amount) {
        int rub = (int) Math.floor(amount);
        int kop = (int) ((amount - rub) * 100);
        return rub + " руб " + kop + " коп";
    }

    // Написать метод, который принимает на вход десятичное число и возвращает строку “10 кг 75 гр”.

    public static String returnStringKg (double amount) {
        int kg = (int) Math.floor(amount);
        int gr = (int) ((amount - kg) * 100);
        return kg + " кг " + gr + " гр";
    }

    // Написать метод, который принимает на вход 2 параметра - цену и количество товара
    // (может быть вес товара, или количество в штуках).
    // Алгоритм возвращает сумму покупки в виде десятичного числа.

    public static double returnSumSelProducts (int number, double price) {
        return number * price;
    }

    // Написать метод, который принимает на вход необходимые параметры, и печатает чек.
    //Например:
    //
    //Яблоки
    //Цена за 1 кг			50 руб 13 коп
    //Количество товара	         3 кг 400 гр
    //_______________________________________
    //Сумма к оплате		170 руб 44 коп

    public static String printReceipt(double price, double amount, String nameProduct) {
        int priceRub = (int) Math.floor(price);
        int priceKop = (int) ((price - priceRub) * 100);
        int amountWhole = (int) Math.floor(amount);
        int amountDecimal = (int) ((amount - amountWhole) * 1000);
        double summaReceipt =  price * amount;
        int receiptRub = (int) Math.floor(summaReceipt);
        int receiptKop = (int) ((summaReceipt - receiptRub) * 100);
        System.out.println( "_".repeat(14) + "Receipt" + "_".repeat(14) + "\n"
                + "Name of product " + "\t" + nameProduct + "\n"
                + "Price " + "\t\t\t\t" + priceRub + " rub " + priceKop + " kop" + "\n"
                + "Amount of product " + "\t" + amountWhole + " kg " + amountDecimal + " gr" + "\n"
                + "_".repeat(36) + "\t\t" + "\n"
                + "Total:" + "\t\t" + receiptRub + " rub " + receiptKop + " kop");
        return receiptRub + " rub " + receiptKop + " kop";
    }

    // Написать метод, который принимает на вход количество часов работы в день и стоимость одного часа работы,
    // и возвращает заработную плату в месяц.

    public static double returnMonthSalary(int amountHourWork, double priceHour) {

        return amountHourWork * priceHour;
    }

    // Написать метод, который принимает на вход необходимые параметры и печатает строку ведомости выдачи
    // зарплаты сотрудникам.
    //Например:
    //
    //Смирнова Мария Ивановна 		70000 руб 00 коп
    //
    //Распечатать ведомость для нескольких сотрудников, например:
    //
    //Март 2022
    //Смирнова Мария Ивановна 		70000 руб 00 коп
    //Серебряков Иван Петрович 		128059 руб 00 коп

    public static void statementSalary (String date, String nameEmployee, double salary) {

        int salaryRub = (int) Math.floor(salary);
        int salaryKop = (int) ((salary - salaryRub) * 100);
        String formattedSalaryKop = String.format("%02d", salaryKop);
        System.out.println(date + "\n"
                + nameEmployee + "\t" + salaryRub + " rub " + formattedSalaryKop + " kop");
    }

    // block shim

    public static void checkShim(int x) {

        if (x < 0) {
            System.out.println(" x is negative");
        } else {
            if (x > 0) {
                System.out.println(" x is positive");
            } else {
                System.out.println("x is zero");
            }
        }
    }

    // а) Дано 3 числа. Необходимо рассчитать разницу между средним значением и медианой (median) значением.
    //Если разница больше 2, необходимо показать сообщение: “Среднее значение … отличается от медианы … на … “.
    //Иначе показать сообщение: “Среднее значение =  …, медиана =  … ”.

    public static void printMassageAverage(int a, int b, int c) {
        int average = (a + b + c) / 3;
        int medium = 0;
        if (a <= b && b <= c) {
            medium = b;
        } else if (c <= b && b <= a) {
            medium = b;
        } else if (a <= c && c <= b) {
            medium = c;
        } else if (b <= c && c <= a) {
            medium = c;
        } else if (b <= a && a <= c) {
            medium = a;
        } else if (c <= a && a <= b) {
            medium = a;
        } else {
            System.out.println("Алгоритм содержит ошибку(и), так как не предусмотрен этот кейс: a = "
                    + a + ", b = " + b + ", c = " + c);
        }
        int difference = average - medium;
        if (difference < -2 || difference > 2) {
            System.out.println("Среднее значение " + average + " отличается от медианы " + medium + " на " + difference);
        } else {
            System.out.println("Среднее значение = " + average + ", медиана = " + medium);
        }
    }

//    a <= b <= c
//    c <= b <= a
//
//    b <= a <= c
//    c <= a <= b
//
//    a <= c <= b
//    b <= c <= a

    // b) Посчитать все то же самое с помощью методов класса Math, где возможно их использовать


    public static void printMassageAverageMath(int a, int b, int c) {
        int average = (a + b + c) / 3;
        int medium = 0;
        if (a <= b && b <= c) {
            medium = b;
        } else if (c <= b && b <= a) {
            medium = b;
        } else if (a <= c && c <= b) {
            medium = c;
        } else if (b <= c && c <= a) {
            medium = c;
        } else if (b <= a && a <= c) {
            medium = a;
        } else if (c <= a && a <= b) {
            medium = a;
        } else {
            System.out.println("Алгоритм содержит ошибку(и), так как не предусмотрен этот кейс: a = "
                    + a + ", b = " + b + ", c = " + c);
        }
        int difference = average - medium;
        if (Math.abs(difference) > 2) {
            System.out.println("Среднее значение " + average + " отличается от медианы " + medium + " на " + difference);
        } else {
            System.out.println("Среднее значение = " + average + ", медиана = " + medium);
        }
    }

    // Написать метод, который принимает на вход год рождения и возвращает ваше счастливое число. Счастливое число рассчитывается по формуле: сумма всех чисел, если результат больше 9, снова считается сумма всех чисел.
    //Например:
    //год рождения 1999
    //1 + 9 + 9 + 9 = 28
    //2 + 8 = 10
    //1 + 0 = 1
    //Счастливое число - 1

    public static int returnLuckyNumber(int a) {
        int sum;
        do {
            sum = 0;
            while (a > 0) {
                sum = sum + (a % 10);
                a = a / 10;
            }
            a = sum;
        } while (sum >= 10);

       return sum;
    }

    // Написать метод, который использует методы класса Math, принимает на вход сумму к оплате (например, 10.75)
    // и округляет сумму в пользу покупателя. Метод возвращает новую сумму к оплате в виде строки, например “10 руб 00 коп”.

    public static void returnRoundSum(double a) {
        int b = (int) Math.floor(a);
        System.out.println(b + " руб 00 коп");
    }

    // Посчитать с помощью методов класса Math
    //a = 3
    //b = 4
    //c = 20
    //
    //((a * b + c) * ab)
    //Вернуть значение с округлением в бОльшую сторону.

    public static int returnBigRound(int a, int b, int c) {

        double d = Math.sqrt((a * b + c) * Math.pow(a, b)) / Math.PI;
        return (int) Math.ceil(d);
    }

    // Написать метод, который с помощью методов класса Math высчитывает любую степень
    // сгенерированного случайного числа. Метод возвращает математически округленное целое
    // значение и выводит на экран: “Число … в степени … = …”

    public static long returnAroundThisMath(int b) {
        double a = Math.random();
        long c = Math.round(Math.pow(a, b));
        System.out.println("Число " + a + " в степени " + b + " = " + c);
        return c;
    }

    //Написать метод, который возвращает случайное число в пределах от 1 до 99 включительно.

    public static double returnRandomNumber() {
        return 1 + Math.random() * 99;
    }

    public static void returnIsLeapYear(int year) {
        boolean isLeapYear = (year % 4 == 0);
        System.out.println(isLeapYear);
    }



    public static void main(String[] args) {

        printTaskNumber(1);
        verifyEquals("Monday", returnDayWeek(1));
        verifyEquals("Tuesday", returnDayWeek(2));
        verifyEquals("Wednesday", returnDayWeek(3));
        verifyEquals("Thursday", returnDayWeek(4));
        verifyEquals("Friday", returnDayWeek(5));
        verifyEquals("Saturday", returnDayWeek(6));
        verifyEquals("Sunday",returnDayWeek(7));
        verifyEquals("Sunday", returnDayWeek(5));

        System.out.println("_".repeat(20));

        printTaskNumber(2);

        int largest = determineLargest(789,43,5000);
        System.out.println("Largest = " + largest);
        verifyEquals(54, largest);
        System.out.println("_".repeat(20));

        printTaskNumber(3);

        int smallest = nestedSmallest(38, 45,68);
        System.out.println("Smollest = " + smallest);

        verifyEquals(24, nestedSmallest(38, 45,68));
        System.out.println("_".repeat(20));

        printTaskNumber(4);

        float averageTempCat = averageFiveTemperatureCat(35.4f, 37.8f, 40.2f, 38.6f, 39.3f);
        System.out.println("Average temperature cat = " + averageTempCat);

        verifyEquals(38.26f, averageTempCat);

        printTaskNumber(5);

        System.out.println(returnStringRub(10.75));

        verifyEquals("10 руб 75 коп", returnStringRub(10.75));
        verifyEquals("15 руб 75 коп", returnStringRub(10.75));

        printTaskNumber(6);

        System.out.println( returnStringKg(10.75));

        verifyEquals("10 кг 75 гр", returnStringKg(10.75));
        verifyEquals("26 кг 75 гр", returnStringKg(10.75));

        printTaskNumber(7);

        System.out.println ("Summa purches " + returnSumSelProducts( 25, 345));

        verifyEquals(8625.0, returnSumSelProducts( 25, 345));
        verifyEquals(8665.0, returnSumSelProducts( 25, 345));

        printTaskNumber(8);

        String total = printReceipt(23.45, 46.7, "Apples");
        verifyEquals("1095 rub 11 kop", total);

        printTaskNumber(9);

        double salary = returnMonthSalary(200, 278);
        System.out.println(returnMonthSalary(200, 278));
        verifyEquals(55600.0, salary);
        verifyEquals(34600.0, salary);

        printTaskNumber(10);
        statementSalary("April 2022", "Jon Depp", 45000);

        printTaskNumber(11);
        checkShim(-6);

        printTaskNumber(14);
        printUnderTaskNumber(1);
        printMassageAverage(25, 12,65);
        printUnderTaskNumber(2);
        printMassageAverageMath(25, 12,65);

        printTaskNumber(15);
        System.out.println(returnLuckyNumber(1982));

        printTaskNumber(16);
        returnRoundSum(10.75);

        printTaskNumber(17);
        System.out.println(returnBigRound(3, 4, 20));

        printTaskNumber(18);
        printUnderTaskNumber(1);
        {
            int y = 2;
            int x = 0;
            if (y > 0) {
                x = 1;
            }
            System.out.println(x);
        }

        printUnderTaskNumber(2);
        {
            double score = 82;
            if (score >= 80 && score <= 90){
                score = score + 5;
            }
            System.out.println(score);
        }

        printUnderTaskNumber(3);
        {
            int i = 0;
            int v = 35;
            boolean items = (i > 10 || v < 50);
        }

        printUnderTaskNumber(4);
        {
            int x = -35;
            if (x % 2 == 1 && x > 0) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
        }

        printUnderTaskNumber(5);
        {
            int x = 3;
            int y = 35;
            if (x > 0 && y > 0) {
                System.out.println("\u001B[34m" + "true");
            } else {
                System.out.println("\u001B[35m" + "false");
            }
        }

        printUnderTaskNumber(6);
        {
            int x = -12;
            int y = 23;
            if ((x > 0 && y > 0) || (x < 0 && y < 0)) {
                System.out.println("\u001B[34m" + "true");
            } else {
                System.out.println("\u001B[35m" + "false");
            }
        }

        printTaskNumber(19);
        returnAroundThisMath(-5);

        printTaskNumber(20);
        System.out.println(returnRandomNumber());

        printTaskNumber(21);
        returnIsLeapYear(1982);



















    }


}
