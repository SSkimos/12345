import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);//ввод
        int a, b, n;
        a = in.nextInt();
        b = in.nextInt();
        n = in.nextInt();
        a *= n;
        b *= n;
        a += b / 100;
        b %= 100;
        System.out.println(a + " " + b); //вывод

    }

}
