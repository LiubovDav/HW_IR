package homework.homework1to7;

public class HW2 {
    public static void main(String[] args) {
        int k = 10;
        int l = 15;
        int m = 20;

        int sum = k + l;
        int mul = l * m;
        int subst = m - l;


        System.out.print(k);
        System.out.print(l);
        System.out.print(m);

        System.out.println(k);
        System.out.println(l);
        System.out.println(m);

        System.out.print(k + " ");
        System.out.print(l+ " ");
        System.out.println(m+ " ");

        System.out.println("int k = " + k);
        System.out.println("int l = " + l);
        System.out.println("int m = " + m);

        System.out.println("Sum of k and l = " + sum);
        System.out.println("k * m = " + mul);
        System.out.println("Разность переменных l и m = " + subst);

        int apple = 100;
        int student = 21;

        System.out.println("Если " + apple + " яблок поделить на " + student + " учеников, то каждый ученик получит по " +
                + apple / student + " яблок(a), и " + apple % student + " яблок(а) останется учителю.");

        System.out.println("Результат деления k на l = " + k / m + " , а остаток от деления  = " + k % m);
        System.out.println("Результат деления k на l = " + k / m + " , а остаток от деления  = " + k % m);
        System.out.println("Результат деления k на l = " + l / m + " , а остаток от деления  = " + l % m);
        System.out.println("Результат деления k на l = " + m / k + " , а остаток от деления  = " + m % k);

        m++;

        int sum1  = k + l + m;

        System.out.println("Сумма чисел k, l, m++ = " + sum1);

        int x = 2;
        int y = 3;
        int a = k;
        int b = l;
        int c = m;
        int d = y - x;

        int expr21 = (x + 3) * (x + 3);
        int expr22 = (3 + 4 * x) / 5 - 10 * (y - 5) * (a + b + c) / x + 9 * ( 4 / x + (9 + x) / y);
        int expr23 = (((5 * x + 7 * y) / (8 * x + 10 * y)) / (3 * x - y) / (x + y)) / a + b + c / d + ((a + b) / (c + d)) +
                + a * b;

        System.out.println("task\tresult");
        System.out.println("21\t\t" + expr21);
        System.out.println("22\t\t" + expr22);
        System.out.println("23\t\t" + expr23);










    }
}
