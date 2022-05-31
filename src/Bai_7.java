

import java.util.Scanner;

public class Bai_7 {
    public static void remove(String a , String b){
        a = a.trim();
        a =a.replaceAll("\\s"," ");
        String []c = a.split(" ");
        String d = "";
        for (int i = 0; i < c.length; i++) {
            if (c[i].toLowerCase().equals(b.toLowerCase())){
                continue;
            }
            d += c[i]+" ";
        }
        System.out.println(d);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("chuoi me");
        String a = sc.nextLine();
        System.out.println("chuoi con");
        String b = sc.nextLine();
        remove(a,b);

    }
}
