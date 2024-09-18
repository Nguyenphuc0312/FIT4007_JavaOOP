
public class Main {
    public static void main(String[] args){
        int evenSum = 0;

        for (int i = 2; i <= 10; i += 2){
            evenSum += i;
        }

        System.out.println("Tong cua cac so chan trong 10 so dau tien: " + evenSum);
    }
}