package geekbrains.lessons;

/**
 * @author Andrey Knyazev
 * @version dated by 17.05.2018
 */
public class Lesson160518 {

    //    1. Создать пустой проект в IntelliJ IDEA и прописать метод main();
    public static void main(String[] args) {

    }

    //    2. Создать переменные всех пройденных типов данных, и инициализировать их значения;
    public static void variables() {
        byte a = 127;
        short b = 32000;
        int c = 1564891657;
        long d = 3465435464654L;

        float e = 3.0f;
        double f = 6.7;

        boolean bool = true;
        char hello = 'A';

        String str = "Hello Java";

    }

    /*    3. Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат,
   где a, b, c, d – входные параметры этого метода; */
    public static int retResult(int a, int b, int c, int d) {
        return a * (b + (c / d));
    }

    //    4. Написать метод, принимающий на вход два числа, и проверяющий что их сумма лежит
//    в пределах от 10 до 20(включительно), если да – вернуть true, в противном случае – false;
    public static boolean check(int a, int b) {
        return (a + b >= 10 && a + b <= 20);
    }

    //    5. Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль
//    положительное ли число передали, или отрицательное; Замечание: ноль считаем положительным числом.
    public static void printPosNeg(int a) {
        if (a >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }

    //    6. Написать метод, которому в качестве параметра передается целое число, метод должен вернуть true,
//    если число отрицательное;
    public static boolean retInteger(int a) {
        return a < 0;
    }


    //    7. Написать метод, которому в качестве параметра передается строка, обозначающая имя,
//    метод должен вывести в консоль сообщение «Привет, указанное_имя!»;
    public static void printName(String name) {
        System.out.println("Привет, " + name);
    }

    //    8. * Написать метод, который определяет является ли год високосным, и выводит сообщение в консоль.
//    Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
    public static boolean leapYear(int a) {
        return ((a % 4 == 0) && (a % 100 != 0) || (a % 400 == 0));
    }
}
