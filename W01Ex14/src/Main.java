
public class Main {
    public static void main(String[] args){
        if (args.length > 0){
            int n = Integer.parseInt(args[0]);
            int sum = 0;

            for (int i = (n % 2 == 0)? 1: 2; i <= n; i += 2){
                sum += i;
            }

            System.out.println("Tong: " + sum);
        }
        else{
            System.out.println("Vui long nhap vao tham so!");
        }
    }
}