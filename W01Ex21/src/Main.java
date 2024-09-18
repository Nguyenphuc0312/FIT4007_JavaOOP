
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

       System.out.print("Nhap vao chuoi muon xu ly: ");
       String str_input = scanner.nextLine();

        StringTokenizer str = new StringTokenizer(str_input);
        while (str.hasMoreTokens()){
            System.out.println(str.nextToken());
        }
    }
}