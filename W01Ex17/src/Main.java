
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Nhap vao so muon kiem tra: ");
        int num_int = scan.nextInt();

        if (num_int == 0)
            System.out.print("zero");
        else if (num_int % 2 ==0)
            System.out.print("chan");
        else
            System.out.print("le");

    }
}