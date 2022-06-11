package homework;

public class HW_4 {

    private static int taskNumber = 1;

    public static void printLine() {
        System.out.println("*********");
    }

    public static void printEmptyLine() {
        System.out.println();
    }

    public static void task() {
        printEmptyLine();
        printLine();
        System.out.println("Задача " + taskNumber);
        taskNumber++;
        printLine();
    }


    //Распечатать следующие выражения, используя метод и параметры:
    //Результат деления k на l = …, а остаток от деления  = …
    //Результат деления k на m = …, а остаток от деления  = …
    //Результат деления l на m = …, а остаток от деления  = …
    //Результат деления m на k = …, а остаток от деления  = …
    //И так далее все возможные варианты.

    public static void division(double k, double l, double m) {
        System.out.println("Результат деления k на l = " + k / l + ", а остаток от деления  = " + k % l);
        System.out.println("Результат деления k на m = " + k / m + ", а остаток от деления  = " + k % m);
        System.out.println("Результат деления l на m = " + l / m + ", а остаток от деления  = " + l % m);
        System.out.println("Результат деления l на k = " + l / k + ", а остаток от деления  = " + l % k);
        System.out.println("Результат деления m на k = " + m / k + ", а остаток от деления  = " + m % k);
        System.out.println("Результат деления m на k = " + m / l + ", а остаток от деления  = " + m % l);
    }

    // Создать переменные apple и  student и присвоить им значения 40 и 6 соответственно. Распечатать выражение:
    //Если … яблок(а) поделить на … учеников, то каждый ученик получит по … яблок(a), и … яблок(а) останется учителю.
    //Распечатать это же выражение со значениями 100 и 21.

    public static void appleStudent(int apple, int student) {
        System.out.println("Если " + apple + " яблок(а) поделить на " + student + " учеников, то каждый ученик получит по" +
                +apple / student + " яблок(a), и " + apple % student + " яблок(а) останется учителю.");
    }


    public static void printApples(int number) {
        System.out.print(number + " ");
        if (number % 100 > 10 && number % 100 < 20) {
            System.out.println("яблок");
        }

        int remainder = number % 10;
        if (remainder == 0 || remainder == 5 || remainder == 6 || remainder == 7 || remainder == 8 || remainder == 9) {
            System.out.println("яблок");
        } else if (remainder == 1) {
            System.out.println("яблоко");
        } else if (remainder == 2 || remainder == 3 || remainder == 4) {
            System.out.println("яблока");
        } else {
            System.out.println("Ошибка, такой вариант не предусмотрел алгоритмом");
        }
    }

    // Напишите метод, который примет на вход параметр температуры в Цельсиях,
    // и распечатает результат температуры в Цельсиях и в Фаренгейтах.

    public static void temperatureCelsiyaFaringeit(float t) {
        System.out.println("Фаренгейт = " + (((t * 9 / 5) + 32) + " и Цельсия = " + t));
    }

    //

    public static int test10(int h, int v) {
        int actualResult = 0;

        if (h % 3 == 0 && v % 3 == 0) {
            actualResult = h + v;
        } else if (h % 5 == 0 && v % 5 == 0) {
            actualResult = h - v;
        } else if (h % 2 == 0 && h % 2 == 0) {
            actualResult = h * v;
            if (h < 0 || v < 0) {
                actualResult = -1 * actualResult;
            }
        } else {
            System.out.println("Невозможно произвести действие");
        }
        return actualResult;
    }


    public static void main(String[] args) {

        task();
        // (2 = 2) И (7 = 7)
        System.out.println(2 == 2 && 7 == 7);

        task();
        // Не(15 < 3)
        System.out.println(!(15 < 3));

        task();
        // ("Сосна" = "Дуб") ИЛИ ("Вишня" = "Клён");
        System.out.println("Sosna".equals("Dub") || "Vishnya".equals("Klen"));

        task();
        // Не("Сосна" = "Дуб");
        System.out.println(!("Sosna".equals("Dub")));

        task();
        // (Не(15 < 3)) И (10 > 20);
        System.out.println((!(15 < 3)) && (10 > 20));

        task();
        // ("Глаза даны, чтобы видеть") И ("Под третьим этажом находится второй этаж");
        // TODO Need question
        // System.out.println("Глаза даны, чтобы видеть" && "Под третьим этажом находится второй этаж");

        task();
        // (6/2 = 3) ИЛИ (7*5 = 20)
        System.out.println((6 / 2 == 3) || (7 * 5 == 20));

        task();
        //  ("В минуте 70 секунд") ИЛИ ("Работающие часы показывают время")
        // TODO Need question
        // System.out.println("В минуте 70 секунд" || "Работающие часы показывают время");

        task();
        //!(28 > 7) И !(300/5 = 60)
        System.out.println(!(28 > 7) && !(300 / 5 == 60));

        task();
        //("Телевизор - электрический прибор") И ("Стекло - дерево")
        //System.out.println(("Телевизор - электрический прибор") && ("Стекло - дерево"));

        task();
        //Не((300 < 100))  → ("Жажду можно утолить водой")
        // System.out.println(!((300 < 100)) >= ("Жажду можно утолить водой"));

        task();
        //(75 < 81) → (88 = 88)
        System.out.println((75 < 81) == (88 == 88));

        task();
        // Если тебе больше 18 лет, то ты взрослый. Иначе, ты - ребенок.
        int age = 54;

        if (age >= 0) {
            if (age >= 18) {
                System.out.println("Age " + age + " ты взрослый");
            } else {
                System.out.println("Age " + age + " - ты - ребенок.");
            }
        } else {
            System.out.println("incorrect age, mustn't be negative");
        }


        task();
        // Если земля сухая, значит, нет дождя. Если земля мокрая, то идет дождь.
        String lend = "земля мокрая";
        if (lend.equals("земля сухая")) {
            System.out.println("Если земля сухая, значит, нет дождя.");
        } else if (lend.equals("земля мокрая")) {
            System.out.println("Если земля мокрая, то идет дождь.");
        }

        task();
        // Если земля сухая, значит, нет дождя. Если земля мокрая, то идет дождь. Иначе идет снег.
        String lend2 = "земля сухая";
//        String lend2 = "земля мокрая";
//        String lend2 = "земля влажная";
        if (lend2.equals("земля сухая")) {
            System.out.println("Если земля сухая, значит, нет дождя.");
        } else if (lend2.equals("земля мокрая")) {
            System.out.println("Если земля мокрая, то идет дождь.");
        } else {
            System.out.println("Идет снег.");
        }

        task();
        // Если на небе тучи, идет дождь, иначе идет “слепой” дождь.
        String sky = "тучи";
//        String sky = "облака";
        if (sky.equals("тучи")) {
            System.out.println("Если на небе тучи, идет дождь");
        } else {
            System.out.println("Иначе идет “слепой” дождь");
        }

        task();
        // Если сегодня суббота, значит, завтра воскресенье.
        // Если сегодня пятница, значит, вчера был четверг.
        // Иначе вчера был не четверг, а завтра - не воскресенье

        String today = "пятница";
//        String today = "суббота";
//        String today = "воскресенье";
        if (today.equals("суббота")) {
            System.out.println("Если сегодня суббота, значит, завтра воскресенье.");
        } else if (today.equals("пятница")) {
            System.out.println("Если сегодня пятница, значит, вчера был четверг.");
        } else {
            System.out.println("Иначе вчера был не четверг, а завтра - не воскресенье.");
        }

        task();
        // Если на горе свистнул рак, значит, прошла вечность, иначе ждите дальше.

        boolean hasLobsterWhistled = false;
        if (hasLobsterWhistled) {
            System.out.println("прошла вечность");
        } else {
            System.out.println("ждите дальше");
        }

        task();
        // Если тебе 18 или ты закончил школу, то ты можешь не жить с родителями, иначе живи с родителями.

        int age2 = 16;
        boolean isGraduatedFromSchool = true;
        if (age2 >= 18 || isGraduatedFromSchool) {
            System.out.println("ты можешь не жить с родителями");
        } else {
            System.out.println("живи с родителями");
        }

        task();
        // Проверьте число на четность. Если число четное, удвойте это число, иначе возведите число в квадрат.
        // Выведите результат работы алгоритма на печать.
        // Найдите в презентации, какой блок схеме соответствует ваш алгоритм.

        int g = 33;

        if (g % 2 == 0) {
            g = g * 2;
        } else {
            g = g * g;
        }
        System.out.println(g);

        task();

        // Напишите алгоритм проверки возраста на соответствие условиям (if-else):
        // Голосовать можно с 18 лет
        // Машину можно водить с 16 лет
        // В школу можно идти с 5 лет
        // Выведите результат работы алгоритма на печать.
        //
        //Найдите в презентации, какой блок схеме соответствует ваш алгоритм.

        {
            int age3 = 17;

            if (age3 >= 18) {
                System.out.println("Голосовать можно с 18 лет");
            } else if (age3 >= 16) {
                System.out.println("Машину можно водить с 16 лет");
            } else if (age3 >= 5 && age3 >= 21) {
                System.out.println("В школу можно идти с 5 лет");
            }
        }

        {
            System.out.println("____________");
            int age3 = 16;

            if (age3 >= 5 && age3 <= 21) {
                System.out.println("В школу можно идти с 5 лет");
            } else if (age3 < 5) {
                System.out.println("В школу идти рано");
            }
            if (age3 >= 16 && age3 <= 150) {
                System.out.println("Машину можно водить с 16 лет");
            } else {
                System.out.println("Машину водить рано");
            }
            if (age3 >= 18 && age3 <= 150) {
                System.out.println("Голосовать можно с 18 лет");
            } else {
                System.out.println("Голосовать можно с 18 лет");
            }

            task();

            // Напишите алгоритм программы, которая проверяет оценку ученика и выполняет следующие действия:
            // 5 - выдать похвальную грамоту и перевести в следующий класс
            // 4 - перевести в следующий класс
            // 3 - дать задание на лето и перевести в следующий класс
            // 2 - вызвать родителей и оставить в текущем классе на второй год
            // Выведите результат работы алгоритма на печать.

            int mark = 3;

            if (mark == 5) {
                System.out.println("выдать похвальную грамоту и перевести в следующий класс");
            } else if (mark == 4) {
                System.out.println("перевести в следующий класс");
            } else if (mark == 3) {
                System.out.println("дать задание на лето и перевести в следующий класс");
            } else if (mark == 2) {
                System.out.println("вызвать родителей и оставить в текущем классе на второй год");
            }

            task();
            // Напишите алгоритм программы, которая проверяет 2 числа.
            // Программа складывает числа, которые делятся на 3 без остатка, и вычитает числа, которые делятся на 5 без остатка.
            // Программа умножает числа, которые делятся на 2 без остатка,
            // но если хотя бы одно число отрицательное,
            // программа умножает результат предыдущего действия на (-1).
            // Если числа не прошли ни одну проверку, программа выводит на печать ошибку о невозможности произвести действия.
            {
                int h = 9;
                int v = 9;

                if (h % 3 == 0 && v % 3 == 0) {
                    System.out.println(h + v);
                } else if (h % 5 == 0 && v % 5 == 0) {
                    System.out.println(h - v);
                } else if (h % 2 == 0 && h % 2 == 0) {
                    int mult = h * v;
                    if (h < 0 || v < 0) {
                        System.out.println(-1 * mult);
                    } else {
                        System.out.println(mult);
                    }
                } else {
                    System.out.println("Невозможно произвести действие");
                }
            }

            task();

            division(45, 3, 65);

            task();
            appleStudent(456, 36);

            task();

            printApples(56);

            task();

            temperatureCelsiyaFaringeit(36);

            task();

            // Напишите тест, который валидирует (проверит правильность работы) ваш код из задания №10.
            // Тестовые данные - 2, 5, 0. (Проверьте число на четность. Если число четное, удвойте это число,
            // иначе возведите число в квадрат. Выведите результат работы алгоритма на печать.)

            {
                int h = 9;
                int v = 9;
                int expectedResult = 18;
                int actualResult = test10(h, v);

                //test
                if (actualResult == expectedResult) {
                    System.out.println("\u001B[32m" + "Pass");
                } else {
                    System.out.println("\u001B[31m" + "Fail");
                }

                h = -2;
                v = 5;
                expectedResult = 18;
                actualResult = test10(h, v);

                //test
                if (actualResult == expectedResult) {
                    System.out.println("\u001B[32m" + "Pass");
                } else {
                    System.out.println("\u001B[31m" + "Fail");
                }

                task();

                // Напишите тест, который валидирует ваш код из задания №11.
                // Придумайте тестовые данные. Выведите результат проверки на печать.
                // (Напишите алгоритм проверки возраста на соответствие условиям (if-else):
                //Голосовать можно с 18 лет
                //Машину можно водить с 16 лет
                //В школу можно идти с 5 лет
                //Выведите результат работы алгоритма на печать.)

                // test

                {
                    int age4 = 38;
                    String expectedResultTest2 = "В школу можно идти с 5 лет";
                    String actualResultTest2 = "";

                    if (age3 >= 18) {
                        actualResultTest2 = "Голосовать можно с 18 лет";
                    } else if (age4 >= 16) {
                        actualResultTest2 = "Машину можно водить с 16 лет";
                    } else if (age4 >= 5) {
                        actualResultTest2 = "В школу можно идти с 5 лет";
                    }
                    // test

                    if (actualResultTest2.equals(expectedResultTest2)) {
                        System.out.println("\u001B[32m" + "Pass");
                    } else {
                        System.out.println("\u001B[31m" + "Fail");
                    }

                }

                task();

                // Напишите алгоритм программы, которая проверяет число типа short на количество разрядов,
                // и выводит результат проверки.
                // ( Например, “It’s a two-digit number.”, “It’s a five-digit number.”, etc)
                // Выведите результат проверки на печать.


            }


        }

    }
}
