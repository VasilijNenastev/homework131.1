public class Main {
    public static String calculationLeapYear (int year) {
        if (year < 1854) {
            return " год не может быть меньше 1854";
        }
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            return year + " - високосный год";
        } else {
            return year + " - не високосный год";
        }
    }

    public static String clientDeviceYear(int clientOS, int year) {
        int iOS1 = 0;
        int android1 = 1;
        if (clientOS == iOS1 && year >= 2015) {
            return "Установите версию приложения для iOS по ссылке";
        } else if (clientOS == iOS1 && year < 2015) {
            return "Установите облегченную версию приложения для iOS по ссылке";
        } else if (clientOS == android1 && year >= 2015) {
            return "Установите версию приложения для Android по ссылке";
        } else {
            return "Установите облегченную версию приложения для Android по ссылке";
        }
    }

    public static String deliveryDistance(int DistanceKm) {
        if (DistanceKm < 20) {
            return "Потребуется 1 день на доставку";
        }
        if (DistanceKm >= 20 && DistanceKm < 60) {
            return "Потребуется 2 дня на доставку";
        }
        if (DistanceKm >= 60 && DistanceKm < 100) {
            return "Потребуется 3 дня на доставку";
        } else {
            return "Доставка не производится";
        }
    }


    public static void main(String[] args) {
        System.out.print(" Методы задача №1");
        System.out.println();
        System.out.println(calculationLeapYear(1855));
        System.out.println();

        System.out.print(" Методы задача №2");
        System.out.println();
        System.out.println(clientDeviceYear(1, 2000));
        System.out.println();

        System.out.print(" Методы задача №3");
        System.out.println();
        System.out.println(deliveryDistance(200));


    }

}