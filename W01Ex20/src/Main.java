
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap vao day ki tu muon kiem tra: ");
        String str = scanner.nextLine();

        int count = 0;
        for (int i = 0; i < str.length(); i++){
            if (Character.isDigit(str.charAt(i))){
                count++;
            }
        }
        System.out.print("So ki tu la so la: " + count);
    }
}