
public class Main {
    public static void main(String[] args){
        if (args.length > 0){
            int value;
            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;

            for (int i = 0; i < args.length; i++){
                value = Integer.parseInt(args[i]);

                max = (value > max)? value: max;
                min = (value < min)? value: min;
            }

            System.out.println("Gia tri lon nhat: " + max);
            System.out.println("Gia tri be nhat: " + min);
        }
        else{
            System.out.println("Vui long nhap vao tham so!");
        }
    }
}