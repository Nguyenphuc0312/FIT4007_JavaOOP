public class Main {
    public static void main(String[] args){
        int multipleOfSevenSum = 0;

        for (int i = 1; i <= 100; i += 7){
            multipleOfSevenSum += i;
        }

        System.out.println("Tong cac so la boi cua so 7 tu 1-100: " + multipleOfSevenSum);
    }
}