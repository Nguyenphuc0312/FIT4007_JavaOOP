
public class Main {
    public static void main(String[] args){
        int oddSum = 0;

        for (int i = 1; i <= 99; i += 2){
            oddSum += i;
        }

        System.out.println("Tong cac so le tu 1-99: " + oddSum);
    }
}