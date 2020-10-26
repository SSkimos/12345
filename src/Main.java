import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);//ввод
        int a, h, m;
        String mr, sr;
        a = in.nextInt();
        h = a / 3600;
        a -= h*3600;
        m = a / 60;
        a -= m*60;
        h = h % 24;
        if (m < 10) {
            mr = "0" + String.valueOf(m);
        } else {
            mr = String.valueOf(m);
        }
        if (a < 10) {
            sr = "0" + String.valueOf(a);
        } else {
            sr = String.valueOf(a);
        }
        System.out.println(h + ":" + mr + ":" + sr); //вывод

    }

}

