public class Main {
    public Main() {}
        public static void main (String[]args){
            int clientOS = 1;
            switch (clientOS) {
                case 1:
                    System.out.println("Установите версию приложения для iOS по ссылке");
                    break;
                case 2:
                    System.out.println("Установите версию приложения для Android по ссылке");
                    break;
            }

            System.out.println("задание 2");
            int age = 2015;
            int clientOs = 1;
            if (clientOs == 0 && age < 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else if (clientOS == 0 && age >= 2015) {
                System.out.println("Установите обычную версию приложения для iOS по ссылке");
            } else if (clientOs == 1 && age < 2015) {
                System.out.println("Установите обычную версию приложения для Android по ссылке");
            } else if (clientOs == 1 && age >= 2015){
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }

            System.out.println("задание 3");
            int year = 1957;
            if ((year % 4 != 0 || year % 100 == 0) && year % 400 != 0) {
                System.out.println("" + year + " год не является весокосным");
            } else {
                System.out.println("" + year + " год является весокосным");
            }

            System.out.println("задание 4");
            int deliveryDistance = 50;
            int deliveryTime = 1;
            if (deliveryDistance <= 20) {
                System.out.println("Потребуется дней " + deliveryTime);
            } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
                System.out.println("Потребуется дней " + deliveryTime );

            } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
                System.out.println("Потребуется дней " + deliveryTime + 1);
            } else {
                System.out.println("доставки нет");
            }

            System.out.println("задание 5");
            int mounth = 8;
            switch (mounth) {
                case 12:
                case 1:
                case 2:
                    System.out.println("Месяц " + mounth + " принадлежит сезону Зима.");
                    break;
                case 3:
                case 4:
                case 5:
                    System.out.println("Месяц " + mounth + " принадлежит сезону Весна.");
                    break;
                case 6:
                case 7:
                case 8:
                    System.out.println("Месяц " + mounth + " принадлежит сезону Лето.");
                    break;
                case 9:
                case 10:
                case 11:
                    System.out.println("Месяц " + mounth + " принадлежит сезону Осень.");
                    break;
                default:
                    System.out.println("Такого дня не существует");
            }

        }
    }

