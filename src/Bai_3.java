import java.util.Locale;
import java.util.Scanner;

public class Bai_3 {
    public static void convert(String a) {
        a = a.trim();
        a = a.replaceAll("\\s+", " ");
        String str[] = a.split(" ");
        a = "";
        for (int i = 0; i < str.length; ++i) {
            a += String.valueOf(str[i].charAt(0)).toUpperCase() + str[i].substring(1).toLowerCase();
            if (i < str.length - 1) {
                a +=" ";
            }
        }
        System.out.println(a);


    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        convert(a);
    }
}
