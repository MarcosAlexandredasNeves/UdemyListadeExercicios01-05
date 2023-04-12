import java.util.Locale;
import java.util.Scanner;

public class ex05 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        int code1, code2, piece1, piece2;
        double value1, value2, amount;

        code1 = scanner.nextInt();
        piece1 = scanner.nextInt();
        value1 = scanner.nextDouble();

        code2 = scanner.nextInt();
        piece2 = scanner.nextInt();
        value2 = scanner.nextDouble();

        amount = value1 * piece1 + value2 * piece2;

        System.out.printf("Valor a pagar: R$ %.2f%n", amount);


        scanner.close();

    }
}
