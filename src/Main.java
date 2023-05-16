public class Main {
    public static void main(String[] args) {
       int clientOS = 1;
       int clientAndroid =2;
       switch (clientOS) {
           case 1:
               System.out.println("Установите версию приложения для iOS по ссылке");
               break;
           case 2:
               System.out.println("Установите версию приложения для Android по ссылке");
               break;
       }

           System.out.println("задание 2");

       int client= 1;
       int age =2015;

        int clientOS1 = 1;
        int clientAndroid1 =2;
        if (client==1 && age<=2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }else{
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
        System.out.println("задание 3");

        int year = 2020;
        if(  year%4 == 0 && year% 100 !=0 || year% 400 ==0) {
            System.out.println(year + " год является весокосным");
        }else{
            System.out.println(year + " год не является весокосным");
        }

        System.out.println("задание 4");
        int deliveryDistance = 9;
                if(deliveryDistance<= 20){
                    System.out.println("Потребуется дней 1");
                    if(deliveryDistance>20 && deliveryDistance<=60) {
                        System.out.println("Потребуется дней 2");
                        if (deliveryDistance > 60 && deliveryDistance <= 100) {
                            System.out.println("Потребуется дней 3");

                        }
                    }else{
                        System.out.println("доставки нет");

                    }
                }


        System.out.println("задание 5");
                int mounth =3;
                switch (mounth) {
                    case 1 :
                        System.out.println("Январь");
                        break;
                    case 2 :
                        System.out.println("Февраль");
                        break;
                        case 3 :
                        System.out.println("Март");
                        break;
                        case 4 :
                        System.out.println("Апрель");
                        break;
                        case 5 :
                        System.out.println("май");
                        break;
                        case 6 :
                        System.out.println("Июнь");
                        break;
                        case 7 :
                        System.out.println("Июль");
                        break;
                        case 8 :
                        System.out.println("Август");
                        break;
                        case 9 :
                        System.out.println("Сентябрь");
                        break;
                        case 10 :
                        System.out.println("Октябрь");
                        break;
                        case 11 :
                        System.out.println("Ноябрь");
                        break;
                        case 12 :
                        System.out.println("Декабрь");
                        break;
                    default:
                        System.out.println("Такого дня не существует");
                }


       }
    }
