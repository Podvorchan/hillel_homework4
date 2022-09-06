package ua.ithillel.podvorchan.homework6;

public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
        metod1020((int) (Math.random() * 50), (int) (Math.random() * 50));
        positiveNegative((int) (Math.random() * (-100 - 100) + 100));
        positiveNegativeTrueFalse((int) (Math.random() * (-100 - 100) + 100));
        linePrinting("Hello World", 14);
        System.out.println(isLeapYear(2022) ? "true" : "false");
    }
    static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");

    }
    static void checkSumSign() {
        int a = 4;
        int b = 5;
        int sum = a + b;
        if (sum >= 0) {
            System.out.println("Сумма положительная");
        } else
            System.out.println("Сумма отрицательная");

    }
    static void printColor() {
        int value = (int) (Math.random() * (-100 - 200) + 200);
       // System.out.println(value);
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value > 0 && value <= 100) {
            System.out.println("Желтый");
        } else
            System.out.println("Зеленый");
    }
    static void compareNumbers() {
        int a = 52;
        int b = 69;
        if (a >= b) {
            System.out.println("a>=b");
        }
        System.out.println("a<b");

    }
    static boolean metod1020(int a, int b) {
        int sum = a + b;
        boolean c;
        // System.out.println(sum);
        if (sum >= 10 && sum <= 20) {
            c = true;
        } else
            c = false;
        System.out.println(c);
        return c;

    }
    static void positiveNegative(int n) {
        // System.out.println(n);
        if (n >= 0) {
            System.out.println("Число положительное");
        } else
            System.out.println("Число отрицательное");
    }
    static boolean positiveNegativeTrueFalse(int n) {
        boolean pn;
        //System.out.println(n);
        if (n >= 0) {
            pn = true;

        } else
            pn = false;
        System.out.println(pn);
        return pn;
    }
    static void linePrinting(String str, int a) {

        for (int i = 1; i <= a; i++) {
            System.out.println(str);
        }
    }
    static boolean isLeapYear(int year) {
        return (year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0);
       /* if (year % 4 != 0) {
            return false;
        } else if (year % 400 == 0) {
            return true;
        } else if (year % 100 == 0) {
            return false;
        } else {
            return true;*/
    }

}

