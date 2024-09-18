
public class Main {
    public static void main(String[] args){
        if (args.length > 0){
            int a = Integer.parseInt(args[0]);
            int b = Integer.parseInt(args[1]);

            if (a == 0){
                if (b == 0){
                    System.out.println("Chuong trinh co vo so nghiem");
                }
                else {
                    System.out.println("Chuong trinh vo nghiem");
                }
            }
            else {
                System.out.println("Nghiem cua phuong trinh: " + -b/a);
            }
        }
        else{
            System.out.println("Vui long nhap vao tham so!");
        }
    }
}