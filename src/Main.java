public class Main {
    public static void main(String[] args) {

        System.out.println("Homework 1");
        System.out.println("Task 1");
        int totalMoney = 0;
        int moneyPerMonth = 15000;
        int month = 0;
        while (totalMoney <= 2459000) {
            totalMoney = totalMoney + moneyPerMonth;
            totalMoney = totalMoney + totalMoney/100;
            month++;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + totalMoney + " рублей.");
        }
        System.out.println();
        System.out.println("Task 2");
        int number = 1;
        while(number <= 10) {
            System.out.print(number + " ");
            number++;
        }
        System.out.println();

        for (number = 10; number >= 1; number--) {
            System.out.print(number + " ");
        }
        System.out.println();
        System.out.println("Task 3");
        int population = 12_000_000;
        int birthRate = 12_000_000 * 17 / 1000;
        int mortalityRate = 12_000_000 * 8 / 1000;
        int year = 0;
        while (year < 10) {
            year++;
            population = population + birthRate - mortalityRate;
            System.out.println("Год " + year + " численность населения составляет " + population);
        }
        System.out.println();
        System.out.println("Homework 2");
        System.out.println("Task 1");
        int vasyalDeposit = 15000;
        for (int i = 1; vasyalDeposit < 12000000; i++) {
            vasyalDeposit = vasyalDeposit + (vasyalDeposit / 100 * 7) ;
            System.out.println("Месяц " + i + " сумма накоплений " + vasyalDeposit);
        }

        System.out.println(" ");
        System.out.println("Task 2");
        int vasyalDeposit2 = 15000;
        int i = 1;
        for (; vasyalDeposit2 < 12000000; i++) {
            vasyalDeposit2 = vasyalDeposit2 + (vasyalDeposit2 / 100 * 7) ;
            if (i % 6 == 0) {
                System.out.println("Месяц " + i + " сумма накоплений " + vasyalDeposit2);
            }

        }
        System.out.println("");
        System.out.println("Task 3");
        int vasyalDeposit3 = 15000;
        int i2 = 1;
        for (; i2 <= 108; i2++) {
            vasyalDeposit3 = vasyalDeposit3 + (vasyalDeposit3 / 100 * 7) ;
            if (i2 % 6 == 0) {
                System.out.println("Месяц " + i2 + " сумма накоплений " + vasyalDeposit3);
            }

        }
        System.out.println("");
        System.out.println("Task 4");
        int dayOfMonth = 4;

        for (; dayOfMonth <= 31; dayOfMonth += 7) {

            System.out.println("Сегодня пятница " + dayOfMonth + " число. Необходимо подготовить отчет.");
        }
        System.out.println("");
        System.out.println("Homework 3");
        System.out.println("Task 2");
        for (int x = 1; x <= 10; x++) {
            System.out.println("2 * " + x + " = " + x * 2);
        }
    }
}