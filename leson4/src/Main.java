import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b;
        a = scanner.nextInt();
        b = scanner.nextInt();
        if (a > b) {
            int max = a;
            System.out.println(max);
        } else {
            int max = b;
            System.out.println(max);
        }


        if (a > b) {
            System.out.println(a);
        }

        if (a > b) {
            System.out.println("a больше b и равен" + a);
        } else if (a == b) {
            System.out.println("a равен b");
        }else {
            System.out.println("b больше a и равна" + b);
        }


        System.out.println("Введите число месяца");
        int month = scanner.nextInt();

        switch (month){
            case 1:
                System.out.println("январь");
                break;
            case 2:
                System.out.println("февраль");
                break;
            case 3:
                System.out.println("март");
                break;
            case 4:
                System.out.println("апрель");
                break;
            case 5:
                System.out.println("май");
                break;
            case 6:
                System.out.println("июнь");
                break;
            case 7:
                System.out.println("июль");
                break;
            case 8:
                System.out.println("август");
                break;
            case 9:
                System.out.println("сентябрь");
                break;
            case 10:
                System.out.println("октабрь");
                break;
            case 11:
                System.out.println("ноябрь");
                break;
            case 12:
                System.out.println("декабрь");
                break;
            default:
                System.out.println("такого месяца не существует");
        }

    }
}
