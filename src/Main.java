
import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void task1() {
        System.out.println("Задание 1");
        calculationYear(2012);
    }

    public static void calculationYear(int year) {
        if (year % 400 == 0 || year % 100 != 0 && year % 4 == 0) {
            System.out.println(year + " год — високосный год");
        } else {
            System.out.println(year + " год — невисокосный год");
        }
    }

    public static void task2() {
        System.out.println("Задание 2");
        selectionVersion(1, 2023);
    }

    public static void selectionVersion(int os, int year) {
        int currentYear = LocalDate.now().getYear();
        if (year >= currentYear) {
            switch (os) {
                case 0:
                    System.out.println("Установите версию приложения для iOS по ссылке");
                    break;
                case 1:
                    System.out.println("Установите версию приложения для Android по ссылке");
                    break;
                default:
                    System.out.println("К сожалению, этот телефон не поддерживается");
            }
        } else {
            switch (os) {
                case 0:
                    System.out.println("Установите облегченную версию приложения для iOS по ссылке");
                    break;
                case 1:
                    System.out.println("Установите облегченную версию приложения для Android по ссылке");
                    break;
                default:
                    System.out.println("К сожалению, этот телефон не поддерживается");
            }
        }
    }

    public static void task3() {
        System.out.println("Задание 3");
        int deliveryPeriod = calculationDayDelivery(getDistance());
        if (deliveryPeriod != -1) {
            System.out.println("Потребуется дней: " + deliveryPeriod);
        } else {
            System.out.println("К сожалению, доставки в ваш регион нет");
        }
    }

    public static int getDistance() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Сколько километров до вашего адреса?");
        return scanner.nextInt();
    }

    public static int calculationDayDelivery(int deliveryDistance) {
        int deliveryPeriod = 1;
        if (deliveryDistance <= 20) {
            return deliveryPeriod;
        } else if (deliveryDistance < 60) {
            return deliveryPeriod + 1;
        } else if (deliveryDistance <= 100) {
            return deliveryPeriod + 2;
        } else {
            return -1;
        }
    }
}