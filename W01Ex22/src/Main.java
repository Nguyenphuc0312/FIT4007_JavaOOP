
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap vao so muon kiem tra: ");
        int number = scanner.nextInt();

        if (number < 2)
            System.out.print("Khong phai so nguyen to");
        if (number == 2 || number == 3)
            System.out.print("La so nguyen to");
        if (number % 2 == 0 || number % 3 == 0)
            System.out.print("Khong phair");

        for (int i = 5; i <= Math.sqrt(number); i += 5) {
            if (number % i == 0 || number % (i + 2) == 0) {
                System.out.print("La so nguyen to");
            }
        }
        scanner.close();

    }
}