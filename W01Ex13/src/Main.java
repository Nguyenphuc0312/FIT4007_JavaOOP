
public class Main {
    public static void main(String[] args) {
        if (args.length > 0){
            try{
                int n = Integer.parseInt(args[0]);

                int sum = 0;
                for (int i = 1; i <= n; i++){
                    sum += i;
                }

                System.out.println("Tong: " + sum);
            }
            catch (NumberFormatException e){
                System.out.println("Gia tri ban nhap khong hop le! Hay nhap lai");
            }
        }
        else {
            System.out.println("Vui long nhap vao tham so n!");
        }
    }
}
