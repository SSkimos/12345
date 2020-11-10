import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);//ввод

        int number = in.nextInt();
        int i = 2;
        boolean bool = false;

        while (i <= number / 2) {
            if (number % i == 0) {
                bool = true;
                break;
            }
            i++;
        }
        if (!bool) {
            System.out.println("prime");
            return;
        }
        System.out.println("composite");
    }
}