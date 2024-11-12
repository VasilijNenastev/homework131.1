public class Main {
    public static String calculationLeapYear (int year1) {
        String result;
        if (year1 < 1854) {
            result = " год не может быть меньше 1854";
        } else if (year1 % 4 == 0 && year1 % 100 != 0 || year1 % 400 == 0) {
            result = year1 + " - високосный год";
        } else {
            result = year1 + " - не високосный год";
        }
        return result;
    }

    public static String clientDeviceYear(int clientOS, int year) {
        String result;
        int iOS = 0;
        int android = 1;
        if (clientOS == iOS && year >= 2015) {
            result = "Установите версию приложения для iOS по ссылке";
        } else if (clientOS == iOS && year < 2015) {
            result = "Установите облегченную версию приложения для iOS по ссылке";
        } else if (clientOS == android && year >= 2015) {
            result = "Установите версию приложения для Android по ссылке";
        } else {
            result = "Установите облегченную версию приложения для Android по ссылке";
        }
        return result;
    }

    public static String deliveryDistance(int DistanceKm) {
        String result;
        if (DistanceKm < 20) {
            result = "Потребуется 1 день на доставку";
        } else if (DistanceKm >= 20 && DistanceKm < 60) {
            result = "Потребуется 2 дня на доставку";
        } else if (DistanceKm >= 60 && DistanceKm < 100) {
            result = "Потребуется 3 дня на доставку";
        } else {
            result = "Доставка не производится";
        }
        return result;
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