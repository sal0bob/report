import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b;
        a = scanner.nextInt();
        b = scanner.nextInt();

        boolean res = a > b;

        System.out.println(res);
        System.out.println( a * b > 10 ? a * b : "N");

        String cos = a < 2 && b < a && a * a + b * b > 4 && b > 0 ? "yes" : "no";
        System.out.println(cos);

    }
}
