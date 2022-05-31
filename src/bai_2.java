import java.util.Scanner;

public class bai_2 {
    public static void convert (String a){
        char b [] = a.toCharArray();
        String newa = "";
        for (int i = 0; i < b.length; i++) {
            String c = Character.toString(b[i]);
            if(i%2 ==0 ){
                String d = c.toUpperCase();
                newa += d;

            }else {
                String e = c.toLowerCase();
                newa+=e;

            }
        }
        System.out.println(newa);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        convert(a);
    }
}
