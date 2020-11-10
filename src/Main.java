import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);//ввод
        double a = in.nextDouble();
        double b = in.nextDouble();

        if (a == 0){
            if (b > 0)
                System.out.println("any x");
            else if (b <= 0)
                System.out.println("no such x");
        }
        else if (a < 0 && b < 0)
            System.out.println("no such x");
        else if (b > 0 && a > 0)
            System.out.println("any x");
        else {
            String buffer1 = String.format("%.1f", b/a);
            String buffer2 = String.format("%.1f", -1*b/a);
            if (a > 0)
                System.out.println("x<" + buffer1 + " or x>" + buffer2);
            else System.out.println(buffer1 + "<x<" + buffer2);
        }
    }
}
