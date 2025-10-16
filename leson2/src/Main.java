import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a = 0, b;
        Scanner scanner = new Scanner(System.in);
        b = scanner.nextInt();
        int res1, res2;
        double res3;
        a++;
        a += 2;
        a *= 2;
        res1 = a + b;
        res2 = a * b;
        res3 = (double) b / a;
        System.out.println(res1 + " " + res2 + " " + res3);
    }
}
