package homework;

public class HW_3 {

    public static void main(String[] args) {

        {
            System.out.println("\nTask #2");

            byte a = 24;
            byte b = -105;

            System.out.println("a = " + a);
            System.out.println("b = " + b);
        }

        {
            System.out.println("\nTask #3");

            short s = -30000;
            short t = 30000;

            System.out.println("s = " + s);
            System.out.println("t = " + t);
        }

        {
            System.out.println("\nTask #4");

            int i = Integer.MIN_VALUE;
            System.out.println("int min\t\t" + i);

            i = Integer.MAX_VALUE;
            System.out.println("int max\t\t" + i);
        }

        {
            System.out.println("\nTask #5");

            long phoneNumber = 12343004345L;
            System.out.println("Phone Numbe " + phoneNumber);
        }

        {
            System.out.println("\nTask #6");

            float f = 100.101101f;
            double d = 100.101101;

            System.out.println("float f = 100.101101 " + f);
            System.out.println("double d = 100.101101 " + d);
        }

        {
            System.out.println("\nTask #7");

            Double dd = 10.09999 + 20.099999;
            System.out.println("Double dd = " + dd);

            Float ff = 10.09999f + 20.099999f;
            System.out.println("Float ff = " + ff);
        }

        {
            System.out.println("\nTask #8");

            double result = (double) 10 / 3;
            System.out.println(result);
        }

        {
            System.out.println("\nTask #9");

            float f = 100.101101f;
            double d = 100.101101;

            double sum = f + d;
            double product = f * d;
            double quotient = f / d;
            double remainder = f % d;

            System.out.println("sum = " + sum);
            System.out.println("product = " + product);
            System.out.println("quotient = " + quotient);
            System.out.println("remainder = " + remainder);
        }

        {
            System.out.println("\nTask #10");
            // TODO print Hello World using dots
        }

        {
            System.out.println("\nTask #11");

            byte t1 = 0;
            short t2 = 150;
            byte t3 = -120;
            float t4 = -505.505f;
            int t5 = 100100;
            long t6 = 100010001000L;
            double t7 = 2.66666666666666;
            float t8 = -1000000.001f;
            short t9 = 1010;

            System.out.println("t1 = " + t1);
            System.out.println("t2 = " + t2);
            System.out.println("t3 = " + t3);
            System.out.println("t4 = " + t4);
            System.out.println("t5 = " + t5);
            System.out.println("t6 = " + t6);
            System.out.println("t7 = " + t7);
            System.out.println("t8 = " + t8);
            System.out.println("t9 = " + t9);
        }

        {
            System.out.println("\nTask #12");

            System.out.println("Type\tSize in bits\tmin\t\t\t\t\t\tmax");
            System.out.println("byte\t" + Byte.SIZE + "\t\t\t\t" + Byte.MIN_VALUE + "\t\t\t\t\t" + Byte.MAX_VALUE);
            System.out.println("short\t" + Short.SIZE + "\t\t\t\t" + Short.MIN_VALUE + "\t\t\t\t\t" + Short.MAX_VALUE);
            System.out.println("int\t\t" + Integer.SIZE + "\t\t\t\t" + Integer.MIN_VALUE + "\t\t\t\t" + Integer.MAX_VALUE);
            System.out.println("long\t" + Long.SIZE + "\t\t\t\t" + Long.MIN_VALUE + "\t" + Long.MAX_VALUE);
            System.out.println("float\t" + Float.SIZE + "\t\t\t\t" + Float.MIN_VALUE + "\t\t\t\t\t" + Float.MAX_VALUE);
            System.out.println("double\t" + Double.SIZE + "\t\t\t\t" + Double.MIN_VALUE + "\t\t\t\t" + Double.MAX_VALUE);
        }

        {
            System.out.println("\nTask #13");

            Integer num1 = 2354;
            Integer num2 = 2354;

            System.out.println("Если num1 = num2, то результат сравнения методом .equals = " + num1.equals(num2));

            num1 = 5354;
            num2 = 2354;

            System.out.println("Если num1 не равно  num2, то результат сравнения методом .equals = " + num1.equals(num2));
        }

        {
            System.out.println("\nTask #14");

            int number1 = 243;
            int number2 = 243;

            System.out.println("Если number1 = number2, то результат сравнения методом compare = "
                    + Integer.compare(number1, number2));

            number1 = 145;
            number2 = 244;

            System.out.println("Если number1 < number2, то результат сравнения методом compare = "
                    + Integer.compare(number1, number2));

            number1 = 545;
            number2 = 244;

            System.out.println("Если number1 > number2, то результат сравнения методом compare = "
                    + Integer.compare(number1, number2));
        }

        {
            System.out.println("\nTask #15");

            Float k = 234.9999f;

            System.out.println(k.intValue());
        }

        {
            System.out.println("\nTask #16");

            double sr = 345.34;
            double rt = 564.5678;

            System.out.println(Double.sum(sr, rt));
        }

        {
            System.out.println("\nTask #17");

            Float f1 = 3654.5678f;
            Float f2 = 23344.5432f;

            System.out.println(Integer.sum(f1.intValue(), f2.intValue()));
        }

        {
            System.out.println("\nTask #18");

            Short short1 = 12000;
            Short short2 = 12300;

            System.out.println("a) 12000 - 12300 = " + Short.compare(short1, short2));

            short1 = 12500;
            short2 = 12300;

            System.out.println("b) 12000 - 12300 = " + short1.compareTo(short2));
        }

        {
            System.out.println("\nTask #19");

            String str1 = "123.56"; // str1 is an instance of class String
            String str2 = "123.55"; // str2 is an instance of class String
            Double doub1 = 123.56; // doub1 is an instance of class Double
            Double doub2 = 123.55; // doub2 is an instance of class Double

            System.out.println(Double.sum(doub1, -doub2));
            System.out.println(doub1.sum(doub1, -doub2));
            System.out.println(doub2.sum(doub1, -doub2));
            System.out.println(Double.parseDouble(str1) - Double.parseDouble(str2));
            System.out.println(Double.valueOf(str1) - Double.valueOf(str2));

//        BigInteger bigInteger = new BigInteger("2123112234234234234234234");
//        bigInteger.add(...);
//        bigInteger.subtract()...);
//        bigInteger.multiply()...);
//        bigInteger.divide()...);
//
//        BigDecimal bigDecimal = new BigDecimal("1231234234234234234.22342342412312");
//        bigDecimal.add(...);
//        bigDecimal.subtract()...);
//        bigDecimal.multiply()...);
//        bigDecimal.divide()...);
        }

        {
            System.out.println("\nTask #20");

            float tmax = 39.1f;
            float tmin = 37.7f;

            System.out.println(Math.round(10 * (tmax + tmin) / 2) / 10.0);
        }

        {
            System.out.println("\nTask #21");

            System.out.println("Переменная n может принимать значения:");

            Number n = Double.MAX_VALUE;
            System.out.println("n = " + n);

            n = 10;
            System.out.println("n = " + n);

            n = 10.999999999;
            System.out.println("n = " + n);
        }

        {
            System.out.println("\nTask #22");

            Integer numberInteger = 100;
            System.out.println(numberInteger.getClass());
            System.out.println(numberInteger.toString().getClass());
        }

        {
            System.out.println("\nTask #23");

            float c = 36.6f;
            float f = (c * 9 / 5) + 32;

            System.out.println(c + " градусов по Цельсию = " + f + " градусов по Фаренгейту");

            byte k1 = 50;
            float p1 = k1 * 2.205f;
            byte p2 = 50;
            double k2 = Math.round(1000 * (p2 / 2.205)) / 1000.0;

            System.out.println(k1 + " kilogram = " + p1 + " lbs, " + p2 + " lb = " + k2 + " kg");
        }



    }
}
