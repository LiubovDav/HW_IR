package homework.hw8;

import static utils.Utils.*;
import static homework.hw8.HW8.*;

public class Main {

    public static void main(String[] args) {

        //        Сравнить переменные соответствующих типов из классов HW8_1 и HW8 и распечатать результат
        //        сравнения в виде таблички:
        //HW8	 		|HW8_1			|areEquals?
        //____________________________________________
        //Double d = …	|Double d_1 = …		| true or false
        //……

        printTaskNumber(1);

        HW8 hw8 = new HW8();
        HW8_1 hw81 = new HW8_1();

        System.out.println("HW8\t\t\t\t\t|HW8_1\t\t\t\t\t|areEqual?");
        System.out.println("______________________________________________________");
        System.out.println("Double d = " + hw8.doubleVar + "\t\t|Double d_1 = " + hw81.doubleVar + "\t\t|"
                + hw8.doubleVar.equals(hw81.doubleVar));
        System.out.println("______________________________________________________");
        System.out.println("Integer i = " + hw8.integerVar + "\t\t|Integer i_1 = " + hw81.integerVar + "\t\t|"
                + hw8.integerVar.equals(hw81.integerVar));
        System.out.println("______________________________________________________");
        System.out.println("String s = " + hw8.stringVar + "\t|String s_1 = " + hw81.stringVar + "\t|"
                + hw8.stringVar.equals(hw81.stringVar));
        System.out.println("______________________________________________________");

        printTaskNumber(2);

        int[] array = convertToArray(2, 4, 6, 3, 7);
//        System.out.println(array[0]);
//        System.out.println(array[1]);
//        System.out.println(array[2]);
//        System.out.println(array[3]);
//        System.out.println(array[4]);

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        printTaskNumber(3);

        double[] arrayDouble = convertToArrayDouble(2.3, 4.5, 6.7, 8.5, 2.1);
        for (int i = 0; i < arrayDouble.length; i++) {
            System.out.println(arrayDouble[i]);
        }

        printTaskNumber(4);

        String[] arrayString = convertToArrayString("Hello!", "Hi!", "Privet!", "Good bay!", "Morning!");
        for (int i = 0; i < arrayString.length; i++) {
            System.out.println(arrayString[i]);
        }

        printTaskNumber(5);

        double[] arrayDouble2 = convertToArrayMulti(56, 45, 4, 5, 2);
        for (int i = 0; i < arrayDouble2.length; i++) {
            System.out.println(arrayDouble2[i]);
        }

        printTaskNumber(6);
        int countEven = countEvenNumbers(new int[] {56, 45, 4, 57, 32, 2, 12});
        System.out.println(countEven);

        printTaskNumber(7);
        int countOdd = countOddNumbers(new int[]{56, 45, 4, 57, 2, 77});
        System.out.println(countOdd);

        printTaskNumber(8);
        boolean booleanTask[] = returnArrayBoolean(new int[] {56, 45, 4, 57, 32, 2, 12, 4, 2});
        for (int i = 0; i < booleanTask.length; i++) {
            System.out.print(" " + booleanTask[i]);
        }

        printTaskNumber(9);
        String stringRet = returnStringWorld(new String[] {"Hi!", "Hou are you?"});
            System.out.println(stringRet);

        printTaskNumber(10);
        int sumIntSecondPart = countSumSecondPartArray(new int[] {34, 24, 4, 6, 3, 3, 3});
        System.out.println(sumIntSecondPart);

        printTaskNumber(11);
        int[] multiplication = returnMultiplication(5);
        for (int i = 0; i < multiplication.length; i++) {
            System.out.println(multiplication[i]);
        }





    }
}
