import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = 0, b;
        b = 0;
        a += 1;
        a ++;
        a *= 2;
        b = scanner.nextInt();
        double res = (double) a / b;
        System.out.println(res);
    }
}
