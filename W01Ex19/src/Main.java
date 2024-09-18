public class Main {
    public static void main(String[] args) {
        String str = "Day la mot chuoi";
        int count = 0;

        for (int i = 0; i < str.length(); i++){
            if (str.charAt(i) == 'a'){
                count++;
            }
        }

        System.out.print("So lan ki tu a xuat hien: " + count);
    }
}