public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1() {
        System.out.println("Задача 1");

        int currentMany = 0;
        int many = 15000;
        int totalMany = 2_459_000;
        int month = 0;
        while (currentMany <= totalMany) {
            currentMany += many;
            System.out.println("Месяц " + month + " сумма накоплений равна " + currentMany + " рублей.");
            ++month;
        }
    }

    public static void task2() {
        System.out.println("Задача 2");

        int number = 1;
        while (number <= 10) {
            System.out.print(number + " ");
            number++;
        }

        for (int i = 10; i >= 1; i--) {
            System.out.print(i + " ");
        }
    }

    public static void task3() {
        System.out.println("Задача 3");

        int population = 12_000_000;
        int yearCount = 10;
        int mortality = 17;
        int fertility = 8;

        for (int i = 1; i <= yearCount; i++) {

            population += (population / 1000 * (fertility - mortality));

            System.out.println("Год " + i + ", численность населения составляет " + population);
        }
    }

    public static void task4() {
        System.out.println("Задача 4");

        double contribution = 15000;
        int rate = 7;
        int accumulationAmount = 12_000_000;
        int currentMonth = 1;

        while (contribution <= accumulationAmount) {

            contribution *= (1 + (double) rate / 100);
            System.out.println("Месяц " + currentMonth + ", накопления = " + contribution);

            ++currentMonth;
        }
    }

    public static void task5() {
        System.out.println("Задача 5");

        double contribution = 15000;
        double rate = 0.07;
        int accumulationAmount = 12_000_000;
        int currentMonth = 1;

        while (contribution <= accumulationAmount) {

            contribution *= (1 + rate);

            if (currentMonth % 6 == 0) {
                System.out.println("Месяц " + currentMonth + ", накопления = " + contribution);
            }
            ++currentMonth;
        }
    }

    public static void task6() {
        System.out.println("Задача 6");

        double contribution = 15000;
        double rate = 0.07;

        for (int currentMonth = 1; currentMonth < 9 * 12; currentMonth++) {

            contribution *= (1 + rate);

            if (currentMonth % 6 == 0) {
                System.out.println("Месяц " + currentMonth + ", накопления = " + contribution);
            }
        }
    }

    public static void task7() {
        System.out.println("Задача 7");

        int firstFriday = 3;

        for (int i = firstFriday; i <= 31; i +=7) {
            System.out.println("Сегодня пятница " + i + "-е число");
        }
    }

    public static void task8() {
        System.out.println("Задача 8");

        int currentYear = 2023;
        int fromYear = currentYear - 200;
        int toYear = currentYear + 100;

        for (int i = fromYear; i <= toYear; i++) {

            if (i % 79 == 0) {
                System.out.println(i);
            }
        }
    }
}
