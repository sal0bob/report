import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = 0;

        while (a < 5) {
            System.out.println(a);
            a++;
        }

        do {
            System.out.println(a);
            a++;
            if (a == 8) {
                break;
            }
        } while (a < 10);


        int curDmg = scanner.nextInt();
        int delta = scanner.nextInt();
        int sec = scanner.nextInt();
        int sum = 0;

        while (sec > 0) {
            sum += curDmg;
            curDmg -= delta;
            if (curDmg <= 0) {
                break;
            }
            sec--;
        }
        System.out.println(sum);
    }
}
